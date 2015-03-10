package org.usfirst.frc3932;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.DrawMode;
import com.ni.vision.NIVision.Image;
import com.ni.vision.NIVision.ShapeMode;

import edu.wpi.first.wpilibj.CameraServer;

public class USBCamera implements Camera {
	int session;
	Image frame;

	public USBCamera() {
		try {
			frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);
	
			// the camera name (ex "cam0") can be found through the roborio web
			// interface
			session = NIVision.IMAQdxOpenCamera("cam0",
					NIVision.IMAQdxCameraControlMode.CameraControlModeController);
			NIVision.IMAQdxConfigureGrab(session);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	public void executeCamera() {
		try {
			NIVision.IMAQdxStartAcquisition(session);
	
			/**
			 * grab an image, draw the circle, and provide it for the camera server
			 * which will in turn send it to the dashboard.
			 */
	
			NIVision.IMAQdxGrab(session, frame, 1);
	
			CameraServer.getInstance().setImage(frame);
	
			NIVision.IMAQdxStopAcquisition(session);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
