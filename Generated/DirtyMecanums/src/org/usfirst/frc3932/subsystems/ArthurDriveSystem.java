package org.usfirst.frc3932.subsystems;

import edu.wpi.first.wpilibj.Joystick;

public class ArthurDriveSystem extends DriveSystem {
	public static final double SIDEWAYS_DRIVE_SPEED_SCALE = 0.8d;
	public static final double FORWARD_DRIVE_SPEED_SCALE  = 0.8d;
	public static final double TWIST_SPEED_SCALE = 0.8d;
	
	public static final double FINE_SPEED_SCALE = 0.3d;
	
	public static final double VOLTAGE_AT_WALL_DOCK_ULTRA = 1.6d;
	public static final double VOLTAGE_AT_WALL_DOCK_ULTRA_LEFT = VOLTAGE_AT_WALL_DOCK_ULTRA;
	public static final double VOLTAGE_AT_WALL_DOCK_ULTRA_RIGHT = VOLTAGE_AT_WALL_DOCK_ULTRA + 0.3d;
	
	public void drive(Joystick joystick){
		double x = joystick.getX()*SIDEWAYS_DRIVE_SPEED_SCALE;
		double y = joystick.getY()*FORWARD_DRIVE_SPEED_SCALE;
		double twist = joystick.getRawAxis(3)*TWIST_SPEED_SCALE;
		if (joystick.getRawButton(1)){
			x *= FINE_SPEED_SCALE;
			y *= FINE_SPEED_SCALE;
			twist *= FINE_SPEED_SCALE;
		}
		drive(x, y, twist);
    }
	
	public void drive(double x, double y, double twist){
		x = Math.min(x, 0.7);
		y = Math.min(y, 0.7);
		twist = Math.min(twist, 0.7);
    	mecanumDrive.mecanumDrive_Cartesian(x*SIDEWAYS_DRIVE_SPEED_SCALE, y*FORWARD_DRIVE_SPEED_SCALE, twist*TWIST_SPEED_SCALE, 0);

	}
	
}
