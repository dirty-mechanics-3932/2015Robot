package org.usfirst.frc3932.subsystems;

public class ArthurDriveSystem extends DriveSystem {
    private final static double FORWARD_DRIVE_SPEED_SCALE = 0.70d;
    private final static double TWIST_SPEED_SCALE = 0.70d;
	public void drive(double x, double y, double twist){
//		double forwardVector = adjust(y);
//		double twistVector = Math.min(-adjust(x)*forwardVector + adjust(twist), 1);
//    	mecanumDrive.mecanumDrive_Cartesian(0, forwardVector*FORWARD_DRIVE_SPEED_SCALE, twistVector*TWIST_SPEED_SCALE, 0);
		mecanumDrive.arcadeDrive(adjust(x)*FORWARD_DRIVE_SPEED_SCALE, adjust(y)*TWIST_SPEED_SCALE);
    }
}
