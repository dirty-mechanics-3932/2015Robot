package org.usfirst.frc3932.subsystems;

import edu.wpi.first.wpilibj.Joystick;

public class ArthurDriveSystem extends DriveSystem {
	public static final double SIDEWAYS_DRIVE_SPEED_SCALE = 0.5d;
	public static final double FORWARD_DRIVE_SPEED_SCALE  = 0.5d;
	public static final double TWIST_SPEED_SCALE = 0.5d;
	
	public void drive(Joystick joystick){
		double x = joystick.getX();
		double y = joystick.getY();
		double twist = joystick.getRawAxis(3);
		drive(x, y, twist);
    }
	
	public void drive(double x, double y, double twist){
		x = Math.min(x, 0.7);
		y = Math.min(y, 0.7);
		twist = Math.min(twist, 0.7);
    	mecanumDrive.mecanumDrive_Cartesian(x*SIDEWAYS_DRIVE_SPEED_SCALE, y*FORWARD_DRIVE_SPEED_SCALE, twist*TWIST_SPEED_SCALE, 0);

	}
}
