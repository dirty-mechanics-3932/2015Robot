package org.usfirst.frc3932;

import java.text.DecimalFormat;

import org.usfirst.frc3932.subsystems.Elevator;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
	

public class SmartDashboardIO {
	
	
	public void execute() {
    	putNumber("ElevEncoder", RobotMap.elevatorElevatorCANTalon.getEncPosition());
    	putNumber("ElevSet", RobotMap.elevatorElevatorCANTalon.getSetpoint());

    	putNumber("LFRangeFinderV", RobotMap.driveSystemLeftForwardUltra.getAverageVoltage());
    	putNumber("RFRangeFinderV", RobotMap.driveSystemRightForwardUltra.getAverageVoltage());
    	
    	
	}
	
	public void putBoolean(String key, boolean value) {
		SmartDashboard.putBoolean(key, value);
	}
	
	public void putString(String key, String value) {
		SmartDashboard.putString(key, value);
	}
	
	public void putNumber( String key, double value) {
		SmartDashboard.putNumber(key, value);
	}
	



}
