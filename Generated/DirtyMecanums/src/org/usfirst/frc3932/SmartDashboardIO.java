package org.usfirst.frc3932;

import java.text.DecimalFormat;

import org.usfirst.frc3932.subsystems.Elevator;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
	

public class SmartDashboardIO {
	
	public static final String LEFT_DRIVE_TALON = "LeftDriveTalon";
	public static final String RIGHT_DRIVE_TALON = "RightDriveTalon";
	public static final String DRIVE = "DriveSystem";
	public static final String DRIVE_LEFT_DOWN_IR = DRIVE + "LeftDownIR";
	public static final String DRIVE_RIGHT_DOWN_IR = DRIVE + "RightDownIR";
	public static final String CURRENT = "Current";
	public static final String POSITION = "Position";
	public static final String SPEED = "Speed";
	public static final String DELIM = ".";
	public static final String ELEVATOR = "Elevator";
	
	public void execute() {
		DecimalFormat df = new DecimalFormat("#.000"); 
		
		SmartDashboard.putNumber(label(LEFT_DRIVE_TALON, CURRENT), RobotMap.driveSystemLeftBack.getOutputCurrent());
    	SmartDashboard.putNumber(label(LEFT_DRIVE_TALON, POSITION), RobotMap.driveSystemLeftBack.getPosition());
    	SmartDashboard.putNumber(label(LEFT_DRIVE_TALON, POSITION), RobotMap.driveSystemLeftBack.getSpeed());
    	SmartDashboard.putBoolean(label(DRIVE, "CrabLeftDone"), Robot.driveSystem.isCrabLeftDone());
    	SmartDashboard.putNumber(label(DRIVE_LEFT_DOWN_IR, "AvgVolts"), RobotMap.driveSystemLeftDownIR.getAverageVoltage());
    	SmartDashboard.putNumber(label(DRIVE_RIGHT_DOWN_IR, "AvgVolts"), RobotMap.driveSystemRightDownIR.getAverageVoltage());
    	
    	//ELEVATOR
    	for (Elevator.Position position : Elevator.Position.values()) {
    		StringBuffer sb = new StringBuffer();
    		sb.append(df.format(position.getInches()));
    		sb.append(":inches = ");
    		sb.append(position.getTicks());
    		sb.append(" ticks ");
    		SmartDashboard.putString(label(ELEVATOR, position.toString()), sb.toString() );
    	}
    	
    	SmartDashboard.putNumber(label("LeftGate", "Encoder"), RobotMap.gatesLeftGateCANTalon.get());
    	SmartDashboard.putNumber(label("RightGate", "Encoder"), RobotMap.gatesRightGateCANTalon.get());
    	SmartDashboard.putNumber(label("Elevator", "Encoder"), RobotMap.elevatorElevatorCANTalon.getEncPosition());
    	SmartDashboard.putNumber(label("Elevator", "Setpoint"), RobotMap.elevatorElevatorCANTalon.getSetpoint());
    	SmartDashboard.putNumber(label("Elevator", "Output"), RobotMap.elevatorElevatorCANTalon.getOutputCurrent());
    	
	}
	
	public String label(String component, String measure) {
		return component + DELIM + measure;
	}

}
