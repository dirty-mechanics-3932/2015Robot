// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3932.subsystems;

import org.usfirst.frc3932.RobotMap;
import org.usfirst.frc3932.commands.Teleop;

import edu.wpi.first.wpilibj.AccumulatorResult;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveSystem extends Subsystem {
	private boolean crabLeftDone;
	public static final double VOLTAGE_AT_WALL_DOCK = .7d;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    CANTalon leftFront = RobotMap.driveSystemLeftFront;
    CANTalon rightBack = RobotMap.driveSystemRightBack;
    CANTalon leftBack = RobotMap.driveSystemLeftBack;
    CANTalon rightFront = RobotMap.driveSystemRightFront;
    RobotDrive mecanumDrive = RobotMap.driveSystemMecanumDrive;
    AnalogInput leftForwardIR = RobotMap.driveSystemLeftForwardIR;
    AnalogInput rightForwardIR = RobotMap.driveSystemRightForwardIR;
    AnalogInput leftDownIR = RobotMap.driveSystemLeftDownIR;
    AnalogInput rightDownIR = RobotMap.driveSystemRightDownIR;
    AnalogInput gyro = RobotMap.driveSystemGyro;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
//    Gyro gyroOutput = new Gyro(gyro);
    private final static double DRIVE_SPEED_SCALE = 0.50d;

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new Teleop());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        
//        gyroOutput.reset();
    }
    
    public void drive(double x, double y, double twist){
    	mecanumDrive.mecanumDrive_Cartesian(adjust(x)*DRIVE_SPEED_SCALE, adjust(y)*DRIVE_SPEED_SCALE, adjust(twist)*DRIVE_SPEED_SCALE, 0);
    }
    
    protected double adjust(double val){
    	return adjust(val, 50);
    }

    protected double adjust(double val, double factor){
    	return (val<0?-1:1) * (Math.pow(factor, Math.abs(val)) - 1) / (factor-1);
    }
    
    public void crabLeft(){
    	if(isUnderneathClear())
    	{
    		setCrabLeftDone(false);
    		drive(0.5d,0d,0d);
    	}
    	
    	else
    	{
    		setCrabLeftDone(true);
    	}
    }
    
    public boolean isUnderneathClear()
    {
    	return (leftDownIR.getAverageVoltage() <= 1 || rightDownIR.getAverageVoltage() <= 1);
    }

	public boolean isCrabLeftDone() {
		return crabLeftDone;
	}

	private void setCrabLeftDone(boolean crabLeftDone) {
		this.crabLeftDone = crabLeftDone;
	}

	public void stop() {
		drive(0d,0d,0d);
	}
	
	public boolean isLeftSideTargetReached()
	{
		return (leftForwardIR.getAverageVoltage() > VOLTAGE_AT_WALL_DOCK);
	}
	
	public boolean isRightSideTargetReached()
	{
		return (rightForwardIR.getAverageVoltage() > VOLTAGE_AT_WALL_DOCK);
	}
//	public double getGyroAngleDegrees(){
//		return gyroOutput.getAngle();
//	}
	
}

