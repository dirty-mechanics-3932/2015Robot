// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3932.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc3932.Robot;
import org.usfirst.frc3932.RobotMap;

/**
 *
 */
public class  Teleop extends Command {

    public Teleop() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveSystem);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Joystick joystick = Robot.oi.getDriverJoy1();
    	Joystick twist = Robot.oi.getDriverJoy2();
    	Robot.driveSystem.drive(joystick.getX(), joystick.getY(), twist.getRawAxis(3));
    	SmartDashboard.putNumber("Left Front", RobotMap.driveSystemLeftFront.getSpeed());
    	SmartDashboard.putNumber("Left Back", RobotMap.driveSystemLeftBack.getSpeed());
    	SmartDashboard.putNumber("Right Front", RobotMap.driveSystemRightFront.getSpeed());
    	SmartDashboard.putNumber("Right Back", RobotMap.driveSystemRightBack.getSpeed());
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}