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

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Arms extends Subsystem {
	public static final double MOTOR_HEIGHT = 0d; //unknown 
			
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController leftMotorTalon = RobotMap.armsLeftMotorTalon;
    SpeedController rightMotorTalon = RobotMap.armsRightMotorTalon;
    DoubleSolenoid longPistonsDblSolenoid = RobotMap.armsLongPistonsDblSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	longPistonsDblSolenoid.set(DoubleSolenoid.Value.kOff);
    }
    
    public void armsFullOpen(){
    	longPistonsDblSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public void armsClose(){
    	longPistonsDblSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
}

