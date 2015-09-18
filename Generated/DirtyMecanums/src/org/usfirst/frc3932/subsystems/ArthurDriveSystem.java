package org.usfirst.frc3932.subsystems;

public class ArthurDriveSystem extends DriveSystem {
	public static final double SIDEWAYS_DRIVE_SPEED_SCALE = 0.7d;
	public static final double FORWARD_DRIVE_SPEED_SCALE  = 0.7d;
	public static final double TWIST_SPEED_SCALE = 0.7d;
	
	public void drive(double x, double y, double twist){
    	mecanumDrive.mecanumDrive_Cartesian(x*SIDEWAYS_DRIVE_SPEED_SCALE, y*FORWARD_DRIVE_SPEED_SCALE, twist*TWIST_SPEED_SCALE, 0);
    }
}
