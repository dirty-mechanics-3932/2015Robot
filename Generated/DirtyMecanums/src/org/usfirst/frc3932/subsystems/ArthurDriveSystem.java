package org.usfirst.frc3932.subsystems;

public class ArthurDriveSystem extends DriveSystem {
	public static final double SCALE = .75;
	
    public void drive(double x, double y, double rawAxis3){
    	
//		double forwardVector = adjust(y);
//		double twistVector = Math.min(-adjust(x)*forwardVector + adjust(twist), 1);
//    	mecanumDrive.mecanumDrive_Cartesian(0, forwardVector*FORWARD_DRIVE_SPEED_SCALE, twistVector*TWIST_SPEED_SCALE, 0);
		mecanumDrive.arcadeDrive(x * SCALE, rawAxis3 * SCALE);
		///mecanumDrive.arcadeDrive(adjust(x)*FORWARD_DRIVE_SPEED_SCALE, adjust(y)*TWIST_SPEED_SCALE);
    }
}
