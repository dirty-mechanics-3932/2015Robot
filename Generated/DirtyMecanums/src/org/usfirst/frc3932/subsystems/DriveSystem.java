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

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 *
 */
public class DriveSystem extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    CANTalon leftFront = RobotMap.driveSystemLeftFront;
    CANTalon rightBack = RobotMap.driveSystemRightBack;
    CANTalon leftBack = RobotMap.driveSystemLeftBack;
    CANTalon rightFront = RobotMap.driveSystemRightFront;
    RobotDrive mecanumDrive = RobotMap.driveSystemMecanumDrive;
    DoubleSolenoid leftTransmissionDblSolenoid = RobotMap.driveSystemLeftTransmissionDblSolenoid;
    DoubleSolenoid rightTransmissionDblSolenoid = RobotMap.driveSystemRightTransmissionDblSolenoid;
    AnalogInput rangeFinder = RobotMap.driveSystemRangeFinder;
    AnalogInput leftForwardIR = RobotMap.driveSystemLeftForwardIR;
    AnalogInput rightForwardIR = RobotMap.driveSystemRightForwardIR;
    AnalogInput leftDownIR = RobotMap.driveSystemLeftDownIR;
    AnalogInput rightDownIR = RobotMap.driveSystemRightDownIR;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new Teleop());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void drive(double x, double y, double twist){
    	mecanumDrive.mecanumDrive_Cartesian(adjust(x), adjust(y), adjust(twist), 0);
    	SmartDashboard.putNumber("LeftDriveTalon-Output", leftFront.getOutputCurrent());
    	SmartDashboard.putNumber("LeftDriveTalon-Postion", leftFront.getPosition());
    	SmartDashboard.putNumber("LeftDriveTalon-Speed", leftFront.getSpeed());
    }
    
    protected double adjust(double val){
    	return adjust(val, 50);
    }

    protected double adjust(double val, double factor){
    	return (val<0?-1:1) * (Math.pow(factor, Math.abs(val)) - 1) / (factor-1);
    }
    
    public void crabLeft(){
    	
    }
    
    
}

