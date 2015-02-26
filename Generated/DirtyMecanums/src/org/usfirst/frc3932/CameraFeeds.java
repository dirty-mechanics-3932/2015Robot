package org.usfirst.frc3932;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;
import edu.wpi.first.wpilibj.CameraServer;

public class CameraFeeds
{
	public static final String camNameFront = "cam1";
	public static final String camNameRear = "cam0";
	public static final int imageQuality = 60;
	
	public final int camRear;
	public final int camFront;
	private int curCam;
	private Image frame;
	private CameraServer server;
	
	private boolean isRearCamera = false;
	
	public CameraFeeds()
	{
        // Get camera ids by supplying camera name ex 'cam0', found on roborio web interface
        camRear = NIVision.IMAQdxOpenCamera(camNameRear, NIVision.IMAQdxCameraControlMode.CameraControlModeController);
        camFront = NIVision.IMAQdxOpenCamera(camNameFront, NIVision.IMAQdxCameraControlMode.CameraControlModeController);
        curCam = camFront;
        // Img that will contain camera img
        frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
        // Server that we'll give the img to
        server = CameraServer.getInstance();
        server.setQuality(imageQuality);
	}
	
	public void init()
	{
		changeCam(camFront);
	}
	
	public void run()
	{
		updateCam();
	}
	
	/**
	 * Stop aka close camera stream
	 */
	public void end()
	{
		NIVision.IMAQdxStopAcquisition(curCam);
	}
	
	/**
	 * Change the camera to get imgs from to a different one
	 * @param newId for camera
	 */
	public void changeCam(int newId)
    {
		NIVision.IMAQdxStopAcquisition(curCam);
    	NIVision.IMAQdxConfigureGrab(newId);
    	NIVision.IMAQdxStartAcquisition(newId);
    	curCam = newId;
    }
    
	/**
	 * Get the img from current camera and give it to the server
	 */
    public void updateCam()
    {
    	NIVision.IMAQdxGrab(curCam, frame, 1);
        server.setImage(frame);
    }
    
    public void switchCams(){
    	if (isRearCamera){
    		isRearCamera = false;
    		changeCam(camFront);
    	}
    	else {
    		isRearCamera = true;
    		changeCam(camRear);
    	}
    }
    
    
}
