package org.usfirst.frc3932.subsystems;

public class ArthurDriveSystem extends DriveSystem {
	public static final double SIDEWAYS_DRIVE_SPEED_SCALE = 0.1d;
	public static final double FORWARD_DRIVE_SPEED_SCALE  = 0.3d;
	public static final double TWIST_SPEED_SCALE = 0.1d;
	
//    public void drive(double x, double y, double rawAxis3){
//    	
////		double forwardVector = adjust(y);
////		double twistVector = Math.min(-adjust(x)*forwardVector + adjust(twist), 1);
////    	mecanumDrive.mecanumDrive_Cartesian(0, forwardVector*FORWARD_DRIVE_SPEED_SCALE, twistVector*TWIST_SPEED_SCALE, 0);
//		mecanumDrive.mecanumDrive_Cartesian(x * SCALE, y * );
//		///mecanumDrive.arcadeDrive(adjust(x)*FORWARD_DRIVE_SPEED_SCALE, adjust(y)*TWIST_SPEED_SCALE);
//    }
	
	public void drive(double x, double y, double twist){
    	mecanumDrive.mecanumDrive_Cartesian(adjust(x)*SIDEWAYS_DRIVE_SPEED_SCALE, adjust(y)*FORWARD_DRIVE_SPEED_SCALE, adjust(twist)*TWIST_SPEED_SCALE, 0);
    }
}
