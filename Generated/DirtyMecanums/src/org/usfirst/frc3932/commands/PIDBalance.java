package org.usfirst.frc3932.commands;

import org.usfirst.frc3932.RobotMap;

public class PIDBalance extends Balance {
	

	protected double returnPIDInput() {
	    return RobotMap.balancingAccelerometer.calculateAbsoluteAngle();
	}
	
	protected void usePIDOutput(double output) {
	    RobotMap.driveSystemLeftFront.pidWrite(output);
	    RobotMap.driveSystemRightFront.pidWrite(output);
	}
	


}
