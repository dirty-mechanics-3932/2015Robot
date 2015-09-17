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

import org.usfirst.frc3932.commands.BackAwaySlowly;
import org.usfirst.frc3932.commands.ClearAll;
import org.usfirst.frc3932.commands.ElevatorManualControl;
import org.usfirst.frc3932.commands.ElevatorToFourTotes;
import org.usfirst.frc3932.commands.ElevatorToOneTote;
import org.usfirst.frc3932.commands.ElevatorToStart;
import org.usfirst.frc3932.commands.ElevatorToThreeTotes;
import org.usfirst.frc3932.commands.ElevatorToTwoTotes;
import org.usfirst.frc3932.commands.PneumaticArmsClose;
import org.usfirst.frc3932.commands.PneumaticArmsOpen;
import org.usfirst.frc3932.commands.ResetElevatorPosition;
import org.usfirst.frc3932.commands.SwitchLights;
import org.usfirst.frc3932.commands.UltraDock;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


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
    public JoystickButton switchLights2;
    public JoystickButton backAwaySlowly2;
    public JoystickButton dock1;
    public Joystick driverJoy1;
    public JoystickButton elevator1T;
    public JoystickButton elevator2T;
    public JoystickButton elevator3T;
    public JoystickButton elevator4T;
    public JoystickButton armsOpen;
    public JoystickButton armsClosed;
    public JoystickButton elevatorToStartButton;
    public Joystick operatorJoy1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        operatorJoy1 = new Joystick(1);
        
        elevatorToStartButton = new JoystickButton(operatorJoy1, 8);
        elevatorToStartButton.whenPressed(new ElevatorToStart());
        armsClosed = new JoystickButton(operatorJoy1, 6);
        armsClosed.whenPressed(new PneumaticArmsClose());
        armsOpen = new JoystickButton(operatorJoy1, 5);
        armsOpen.whenPressed(new PneumaticArmsOpen());
        elevator4T = new JoystickButton(operatorJoy1, 3);
        elevator4T.whenPressed(new ElevatorToFourTotes());
        elevator3T = new JoystickButton(operatorJoy1, 4);
        elevator3T.whenPressed(new ElevatorToThreeTotes());
        elevator2T = new JoystickButton(operatorJoy1, 2);
        elevator2T.whenPressed(new ElevatorToTwoTotes());
        elevator1T = new JoystickButton(operatorJoy1, 1);
        elevator1T.whenPressed(new ElevatorToOneTote());
        driverJoy1 = new Joystick(0);
        
        dock1 = new JoystickButton(driverJoy1, 1);
        dock1.whileHeld(new UltraDock());
        backAwaySlowly2 = new JoystickButton(driverJoy1, 2);
        backAwaySlowly2.whenPressed(new BackAwaySlowly());
        switchLights2 = new JoystickButton(driverJoy1, 1);
        switchLights2.whenPressed(new SwitchLights());

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("ElevatorToStart", new ElevatorToStart());

        SmartDashboard.putData("ElevatorToOneTote", new ElevatorToOneTote());

        SmartDashboard.putData("ElevatorToTwoTotes", new ElevatorToTwoTotes());

        SmartDashboard.putData("ElevatorToThreeTotes", new ElevatorToThreeTotes());

        SmartDashboard.putData("ElevatorToFourTotes", new ElevatorToFourTotes());

        SmartDashboard.putData("ResetElevatorPosition", new ResetElevatorPosition());

        SmartDashboard.putData("ElevatorManualControl", new ElevatorManualControl());

        SmartDashboard.putData("ClearAll", new ClearAll());

        SmartDashboard.putData("PneumaticArmsOpen", new PneumaticArmsOpen());

        SmartDashboard.putData("PneumaticArmsClose", new PneumaticArmsClose());


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriverJoy1() {
        return driverJoy1;
    }

    public Joystick getOperatorJoy1() {
        return operatorJoy1;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    
    public void execute() {
    }
}

