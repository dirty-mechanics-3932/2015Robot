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
import org.usfirst.frc3932.Settable;
import org.usfirst.frc3932.commands.ArmManualControl;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Arms extends Subsystem implements Settable{

	private static final double PID_MARGIN_OF_ERROR = 0.001;
	
	
	public static final double WIDE = 3.8;
	public static final double BACKOUT = 3.6;
	public static final double GRAB = 3.24;
	public static final double START = 3.2;
	
	
	public static final double VOLTS_PER_UPDATE = 0.02;

			
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    CANTalon armWidthCANTalon = RobotMap.armsArmWidthCANTalon;
    AnalogInput armEncoder = RobotMap.armsArmEncoder;
    PIDController armPIDController = RobotMap.armsArmPIDController;
    SpeedController leftWheel = RobotMap.armsLeftWheel;
    SpeedController rightWheel = RobotMap.armsRightWheel;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
//    TrajectoryGenerator tragGenerator = new TrajectoryGenerator();
	public static double JOYSTICK_SCALE = 0.4d;

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new ArmManualControl());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
//    	armWidthCANTalon.setPID(PID_P, 0d, 0d);
//        tragGenerator.setDestination((int)GRAB*1000);
//        tragGenerator.setCurrentTarget((int)GRAB*1000);
//        tragGenerator.setTicksPerUpdate((int)(VOLTS_PER_UPDATE*1000));
    
    	armPIDController.setSetpoint(GRAB);
    	armPIDController.enable();
    	armWidthCANTalon.reverseOutput(true);
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setLocation(double setpoint) {

//    	tragGenerator.goToDestination((int)setpoint*1000);
    	armsPIDEnable();
    	armPIDController.setSetpoint(setpoint);
    }
    
    
    public void armsClose() // START position
    {
    	// at 250
    	setLocation(START);
    }
    
    public void armsHalfOpen() // GRAB position
    {
    	setLocation(GRAB);
    }
    
    public void armsBackout() // BACKOUT position
    {
    	setLocation(BACKOUT);
    }
    
    public void armsFullOpen() // WIDE position
    {
    	// at 0
		setLocation(WIDE);
    }
    
    public void set(int setpoint){
    	armPIDController.setSetpoint(setpoint/1000.0);
    	armWidthCANTalon.set(armPIDController.get());
    	
    }

    public void execute(){
//    	tragGenerator.execute(this);
    	if (isPidEnabled()){
    		armWidthCANTalon.set(armPIDController.get());
    	}
    }

	private boolean isPidEnabled() {
		return armPIDController.isEnable();
	}
	public boolean atSetpoint() {
//		return tragGenerator.isFinished() && 
		return Math.abs(armPIDController.getError()) < PID_MARGIN_OF_ERROR;
	}
	
	public void wheelsIn() {
		leftWheel.set(-1);
		rightWheel.set(1);
	}
	
	public void wheelsOut() {
		leftWheel.set(1);
		rightWheel.set(-1);
	}
	
	public void manualDrive(double val) {
		armWidthCANTalon.set(val);
	}
	
	public void wheelsOff() {
		leftWheel.set(0);
		rightWheel.set(0);
	}
	
	public void wheelsSkew() {
		leftWheel.set(1);
		rightWheel.set(1);
	}
	
	public void armsOpenManual(){
		armWidthCANTalon.set(-1d * JOYSTICK_SCALE);
	}
	
	public void armsCloseManual(){
		armWidthCANTalon.set(JOYSTICK_SCALE);
	}
	
	public void armsOff(){
		armWidthCANTalon.set(0);
	}
	
	public void armsCancel(){
		armPIDController.disable();
	}
	
	public void armsPIDEnable(){
		if (!isPidEnabled()){
			armPIDController.enable();
		}
	}
}

