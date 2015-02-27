package org.usfirst.frc3932;

import java.text.DecimalFormat;

import org.usfirst.frc3932.subsystems.Elevator;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
	

public class SmartDashboardIO {
	
	private static final String OUTPUT = "Output";
	private static final String RIGHT_GATE = "RightGate";
	private static final String LEFT_GATE = "LeftGate";
	private static final String SETPOINT = "Setpoint";
	private static final String ENCODER = "Encoder";
	private static final String ARM = "Arm";
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
		
		putNumber(label(LEFT_DRIVE_TALON, CURRENT), RobotMap.driveSystemLeftBack.getOutputCurrent());
    	putNumber(label(LEFT_DRIVE_TALON, POSITION), RobotMap.driveSystemLeftBack.getPosition());
    	putNumber(label(LEFT_DRIVE_TALON, POSITION), RobotMap.driveSystemLeftBack.getSpeed());
    	SmartDashboard.putBoolean(label(DRIVE, "CrabLeftDone"), Robot.driveSystem.isCrabLeftDone());
    	putNumber(label(DRIVE_LEFT_DOWN_IR, "AvgVolts"), RobotMap.driveSystemLeftDownIR.getAverageVoltage());
    	putNumber(label(DRIVE_RIGHT_DOWN_IR, "AvgVolts"), RobotMap.driveSystemRightDownIR.getAverageVoltage());
    	
    	//ELEVATOR
    	enumerateElevatorPositions(df);
    	
    	putNumber(label(LEFT_GATE, ENCODER), RobotMap.gatesLeftGateCANTalon.get());
    	putNumber(label(LEFT_GATE, SETPOINT), RobotMap.gatesLeftGateCANTalon.getSetpoint());
    	putNumber(label(RIGHT_GATE, ENCODER), RobotMap.gatesRightGateCANTalon.get());
    	putNumber(label(RIGHT_GATE, SETPOINT), RobotMap.gatesRightGateCANTalon.getSetpoint());
    	putNumber(label(ELEVATOR, ENCODER), RobotMap.elevatorElevatorCANTalon.getEncPosition());
    	putNumber(label(ELEVATOR, SETPOINT), RobotMap.elevatorElevatorCANTalon.getSetpoint());
    	putNumber(label(ELEVATOR, OUTPUT), RobotMap.elevatorElevatorCANTalon.getOutputCurrent());
    	putNumber(label(ARM, ENCODER), RobotMap.armsArmEncoder.getAverageVoltage());
    	putNumber(label(ARM, SETPOINT), RobotMap.armsArmPIDController.getSetpoint());
    	putNumber(label(ARM, OUTPUT), RobotMap.armsArmPIDController.get());
    	putNumber(label(ARM, "LeftWheel"), RobotMap.armsLeftWheel.get());
    	putNumber(label(ARM, "RightWheel"), RobotMap.armsRightWheel.get());
    	
    	
    	
    	
	}

	private void enumerateElevatorPositions(DecimalFormat df) {
		for (Elevator.Position position : Elevator.Position.values()) {
    		StringBuffer sb = new StringBuffer();
    		sb.append(df.format(position.getInches()));
    		sb.append(":inches = ");
    		sb.append(position.getTicks());
    		sb.append(" ticks ");
    		SmartDashboard.putString(label(ELEVATOR, position.toString()), sb.toString() );
    	}
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
	
	public String label(String component, String measure) {
		return component + DELIM + measure;
	}

}
