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

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Gates extends Subsystem {
	public int AM2816A_ENCODER_TICKS_PER_REVOLUTION = 1988;
	public double TICKS_PER_DEGREE = AM2816A_ENCODER_TICKS_PER_REVOLUTION/360d;
	private boolean areOpen;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    CANTalon leftGateCANTalon = RobotMap.gatesLeftGateCANTalon;
    CANTalon rightGateCANTalon = RobotMap.gatesRightGateCANTalon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	leftGateCANTalon.changeControlMode(ControlMode.Position);
    	rightGateCANTalon.changeControlMode(ControlMode.Position);
    	leftGateCANTalon.setPosition(0);
    	rightGateCANTalon.setPosition(0);
    	leftGateCANTalon.setPID(-20, 0.0, 0.0);
    	rightGateCANTalon.setPID(20, 0.0, 0.0);
    }
    
    public void setLocationByTicks(int ticks) {

    	leftGateCANTalon.set(ticks);
    	rightGateCANTalon.set(ticks);
    }
    
    public void gatesClosed()
    {
    	setLocationByTicks((int) (AM2816A_ENCODER_TICKS_PER_REVOLUTION/2));
    	areOpen = false;
    }

    public void gatesHalfOpen()
    {
    	setLocationByTicks(AM2816A_ENCODER_TICKS_PER_REVOLUTION/4);
    	areOpen = true;
    }

	public void gateFullOpen()
    {
    	// at 0
		setLocationByTicks(0);
		areOpen = true;
    }
	

	public boolean atSetpoint() {
		
		return leftGateCANTalon.get() == leftGateCANTalon.getPosition() && rightGateCANTalon.get() == rightGateCANTalon.getPosition();
	}
	
	public boolean gatesOpen() {
		return areOpen;
	}
}

