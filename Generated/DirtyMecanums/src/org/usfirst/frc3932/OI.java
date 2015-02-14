// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3932;

import org.usfirst.frc3932.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick driverJoy1;
    public Joystick driverJoy2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        driverJoy2 = new Joystick(1);
        
        driverJoy1 = new Joystick(0);
        

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());

        SmartDashboard.putData("Teleop", new Teleop());

        SmartDashboard.putData("ArmsClosed", new ArmsClosed());

        SmartDashboard.putData("GatesClosed", new GatesClosed());

        SmartDashboard.putData("GatesHalfOpen", new GatesHalfOpen());

        SmartDashboard.putData("GatesFullOpen", new GatesFullOpen());

        SmartDashboard.putData("ArmsHalfOpen", new ArmsHalfOpen());

        SmartDashboard.putData("ArmsFullOpen", new ArmsFullOpen());

        SmartDashboard.putData("ElevatorToTabs", new ElevatorToTabs());

        SmartDashboard.putData("LowerArmsToStart", new LowerArmsToStart());

        SmartDashboard.putData("ElevatorToTransport", new ElevatorToTransport());

        SmartDashboard.putData("RaiseArmsToUnload", new RaiseArmsToUnload());

        SmartDashboard.putData("LowerArmsToScoring", new LowerArmsToScoring());

        SmartDashboard.putData("BackAwaySlowly", new BackAwaySlowly());

        SmartDashboard.putData("CrabLeftOverTote", new CrabLeftOverTote());

        SmartDashboard.putData("TabsOpen", new TabsOpen());

        SmartDashboard.putData("TabsClose", new TabsClose());

        SmartDashboard.putData("MoveForward", new MoveForward());

        SmartDashboard.putData("RaiseArmsToTabs", new RaiseArmsToTabs());


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriverJoy1() {
        return driverJoy1;
    }

    public Joystick getDriverJoy2() {
        return driverJoy2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

