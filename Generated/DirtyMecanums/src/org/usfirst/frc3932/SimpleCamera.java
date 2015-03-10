package org.usfirst.frc3932;

import edu.wpi.first.wpilibj.CameraServer;

public class SimpleCamera implements Camera {
	CameraServer server;

	public SimpleCamera() {
		try {
			server = CameraServer.getInstance();
	        server.setQuality(50);
	        //the camera name (ex "cam0") can be found through the roborio web interface
	        server.startAutomaticCapture("cam0");
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	public void executeCamera() {
		try {
			//Nothing to do for simple camera
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
