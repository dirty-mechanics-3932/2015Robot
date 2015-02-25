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

import org.usfirst.frc3932.commands.ArmsBackout;
import org.usfirst.frc3932.commands.ArmsClosed;
import org.usfirst.frc3932.commands.ArmsFullOpen;
import org.usfirst.frc3932.commands.ArmsHalfOpen;
import org.usfirst.frc3932.commands.AutoMoveBackwards;
import org.usfirst.frc3932.commands.AutonomousCommand;
import org.usfirst.frc3932.commands.AutonomousPickup;
import org.usfirst.frc3932.commands.AutonomousSetDown;
import org.usfirst.frc3932.commands.BackAwaySlowly;
import org.usfirst.frc3932.commands.CanTabsClose;
import org.usfirst.frc3932.commands.CanTabsOpen;
import org.usfirst.frc3932.commands.CrabLeftOverCan;
import org.usfirst.frc3932.commands.CrabLeftOverTote;
import org.usfirst.frc3932.commands.ElevatorToCan;
import org.usfirst.frc3932.commands.ElevatorToCanBottom;
import org.usfirst.frc3932.commands.ElevatorToCanStep;
import org.usfirst.frc3932.commands.ElevatorToHang;
import org.usfirst.frc3932.commands.ElevatorToLowCan;
import org.usfirst.frc3932.commands.ElevatorToPlatform;
import org.usfirst.frc3932.commands.ElevatorToScoring;
import org.usfirst.frc3932.commands.ElevatorToStack;
import org.usfirst.frc3932.commands.ElevatorToStart;
import org.usfirst.frc3932.commands.ElevatorToTabs;
import org.usfirst.frc3932.commands.ElevatorToTop;
import org.usfirst.frc3932.commands.ElevatorToTransport;
import org.usfirst.frc3932.commands.ElevatorToWeightBearing;
import org.usfirst.frc3932.commands.GatesClosed;
import org.usfirst.frc3932.commands.GatesFullOpen;
import org.usfirst.frc3932.commands.GatesHalfOpen;
import org.usfirst.frc3932.commands.GetFromStep;
import org.usfirst.frc3932.commands.GrabCan;
import org.usfirst.frc3932.commands.GrabRecievedTote;
import org.usfirst.frc3932.commands.GrabTote;
import org.usfirst.frc3932.commands.HangTote;
import org.usfirst.frc3932.commands.LeftSideMoveForward;
import org.usfirst.frc3932.commands.LightsOff;
import org.usfirst.frc3932.commands.LightsOn;
import org.usfirst.frc3932.commands.LockGatesAroundCan;
import org.usfirst.frc3932.commands.LookForFirstTote;
import org.usfirst.frc3932.commands.LookForTote;
import org.usfirst.frc3932.commands.LowerArmsToStart;
import org.usfirst.frc3932.commands.RaiseArmsToTabs;
import org.usfirst.frc3932.commands.RaiseArmsToUnload;
import org.usfirst.frc3932.commands.RaiseCan;
import org.usfirst.frc3932.commands.RaiseStackToScoring;
import org.usfirst.frc3932.commands.RecieveFirstTote;
import org.usfirst.frc3932.commands.RecieveTote;
import org.usfirst.frc3932.commands.ResetElevatorPosition;
import org.usfirst.frc3932.commands.RightSideMoveForward;
import org.usfirst.frc3932.commands.SetStackOnPlatform;
import org.usfirst.frc3932.commands.StackCan;
import org.usfirst.frc3932.commands.StashFirstTote;
import org.usfirst.frc3932.commands.StashGroundTote;
import org.usfirst.frc3932.commands.StashTote;
import org.usfirst.frc3932.commands.SwitchCameras;
import org.usfirst.frc3932.commands.SwitchLights;
import org.usfirst.frc3932.commands.ToteTabsClose;
import org.usfirst.frc3932.commands.ToteTabsOpen;
import org.usfirst.frc3932.commands.Teleop;
import org.usfirst.frc3932.commands.TransportStack;
import org.usfirst.frc3932.commands.WaitFor;
import org.usfirst.frc3932.commands.WheelsOff;
import org.usfirst.frc3932.commands.WheelsOut;
import org.usfirst.frc3932.commands.WheelsSkew;
import org.usfirst.frc3932.commands.WheelsIn;

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
    public JoystickButton joystickTrigger;
    public JoystickButton button2Lights;
    public Joystick driverJoy1;
    public Joystick logitechJoy;
    public JoystickButton g1;
    public JoystickButton g2;
    public JoystickButton g3;
    public JoystickButton g4;
    public JoystickButton g5;
    public JoystickButton g6;
    public JoystickButton g7;
    public JoystickButton g8;
    public JoystickButton g9;
    public JoystickButton g10;
    public JoystickButton g11;
    public JoystickButton g13;
    public Joystick buttonsTo13;
    public JoystickButton g14;
    public JoystickButton g15;
    public JoystickButton g16;
    public JoystickButton g17;
    public JoystickButton g18;
    public JoystickButton thumb23;
    public JoystickButton thumb24;
    public Joystick buttonsTo24;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        buttonsTo24 = new Joystick(3);
        
        thumb24 = new JoystickButton(buttonsTo24, 11);
        thumb24.whenPressed(new GatesClosed());
        thumb23 = new JoystickButton(buttonsTo24, 10);
        thumb23.whenPressed(new GatesFullOpen());
        g18 = new JoystickButton(buttonsTo24, 5);
        g18.whenPressed(new StackCan());
        g17 = new JoystickButton(buttonsTo24, 4);
        g17.whenPressed(new RaiseCan());
        g16 = new JoystickButton(buttonsTo24, 3);
        g16.whenPressed(new GetFromStep());
        g15 = new JoystickButton(buttonsTo24, 2);
        g15.whenPressed(new GrabCan());
        g14 = new JoystickButton(buttonsTo24, 1);
        g14.whenPressed(new SetStackOnPlatform());
        buttonsTo13 = new Joystick(2);
        
        g13 = new JoystickButton(buttonsTo13, 13);
        g13.whenPressed(new RaiseStackToScoring());
        g11 = new JoystickButton(buttonsTo13, 11);
        g11.whenPressed(new StashGroundTote());
        g10 = new JoystickButton(buttonsTo13, 10);
        g10.whenPressed(new HangTote());
        g9 = new JoystickButton(buttonsTo13, 9);
        g9.whenPressed(new GrabTote());
        g8 = new JoystickButton(buttonsTo13, 8);
        g8.whenPressed(new LookForTote());
        g7 = new JoystickButton(buttonsTo13, 7);
        g7.whenPressed(new TransportStack());
        g6 = new JoystickButton(buttonsTo13, 6);
        g6.whenPressed(new StashTote());
        g5 = new JoystickButton(buttonsTo13, 5);
        g5.whenPressed(new RecieveTote());
        g4 = new JoystickButton(buttonsTo13, 4);
        g4.whenPressed(new StashFirstTote());
        g3 = new JoystickButton(buttonsTo13, 3);
        g3.whenPressed(new GrabRecievedTote());
        g2 = new JoystickButton(buttonsTo13, 2);
        g2.whenPressed(new RecieveFirstTote());
        g1 = new JoystickButton(buttonsTo13, 1);
        g1.whenPressed(new LockGatesAroundCan());
        logitechJoy = new Joystick(1);
        
        driverJoy1 = new Joystick(0);
        
        button2Lights = new JoystickButton(driverJoy1, 2);
        button2Lights.whenPressed(new SwitchLights());
        joystickTrigger = new JoystickButton(driverJoy1, 1);
        joystickTrigger.whenPressed(new SwitchCameras());

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("CrabLeftOverCan", new CrabLeftOverCan());

        SmartDashboard.putData("AutonomousCommand", new AutonomousCommand());

        SmartDashboard.putData("AutonomousPickup", new AutonomousPickup());

        SmartDashboard.putData("AutonomousSetDown", new AutonomousSetDown());

        SmartDashboard.putData("AutoMoveBackwards", new AutoMoveBackwards());

        SmartDashboard.putData("Teleop", new Teleop());

        SmartDashboard.putData("ArmsClosed", new ArmsClosed());

        SmartDashboard.putData("ArmsHalfOpen", new ArmsHalfOpen());

        SmartDashboard.putData("ArmsFullOpen", new ArmsFullOpen());

        SmartDashboard.putData("ArmsBackout", new ArmsBackout());

        SmartDashboard.putData("BackAwaySlowly", new BackAwaySlowly());

        SmartDashboard.putData("CrabLeftOverTote", new CrabLeftOverTote());

        SmartDashboard.putData("CanTabsOpen", new CanTabsOpen());

        SmartDashboard.putData("CanTabsClose", new CanTabsClose());

        SmartDashboard.putData("GatesClosed", new GatesClosed());

        SmartDashboard.putData("GatesHalfOpen", new GatesHalfOpen());

        SmartDashboard.putData("GatesFullOpen", new GatesFullOpen());

        SmartDashboard.putData("LowerArmsToStart", new LowerArmsToStart());

        SmartDashboard.putData("ElevatorToStart", new ElevatorToStart());

        SmartDashboard.putData("ElevatorToTransport", new ElevatorToTransport());

        SmartDashboard.putData("ElevatorToPlatform", new ElevatorToPlatform());

        SmartDashboard.putData("ElevatorToScoring", new ElevatorToScoring());

        SmartDashboard.putData("ElevatorToCanStep", new ElevatorToCanStep());

        SmartDashboard.putData("ElevatorToCanBottom", new ElevatorToCanBottom());

        SmartDashboard.putData("ElevatorToWeightBearing", new ElevatorToWeightBearing());

        SmartDashboard.putData("ElevatorToLowCan", new ElevatorToLowCan());

        SmartDashboard.putData("ElevatorToTabs", new ElevatorToTabs());

        SmartDashboard.putData("ElevatorToHang", new ElevatorToHang());

        SmartDashboard.putData("ElevatorToCan", new ElevatorToCan());

        SmartDashboard.putData("ElevatorToStack", new ElevatorToStack());

        SmartDashboard.putData("ElevatorToTop", new ElevatorToTop());

        SmartDashboard.putData("RaiseArmsToTabs", new RaiseArmsToTabs());

        SmartDashboard.putData("RaiseArmsToUnload", new RaiseArmsToUnload());

        SmartDashboard.putData("ResetElevatorPosition", new ResetElevatorPosition());

        SmartDashboard.putData("LockGatesAroundCan", new LockGatesAroundCan());

        SmartDashboard.putData("RecieveFirstTote", new RecieveFirstTote());

        SmartDashboard.putData("GrabRecievedTote", new GrabRecievedTote());

        SmartDashboard.putData("StashFirstTote", new StashFirstTote());

        SmartDashboard.putData("RecieveTote", new RecieveTote());

        SmartDashboard.putData("StashTote", new StashTote());

        SmartDashboard.putData("TransportStack", new TransportStack());

        SmartDashboard.putData("RaiseStackToScoring", new RaiseStackToScoring());

        SmartDashboard.putData("SetStackOnPlatform", new SetStackOnPlatform());

        SmartDashboard.putData("LookForFirstTote", new LookForFirstTote());

        SmartDashboard.putData("HangTote", new HangTote());

        SmartDashboard.putData("GrabTote", new GrabTote());

        SmartDashboard.putData("StashGroundTote", new StashGroundTote());

        SmartDashboard.putData("LookForTote", new LookForTote());

        SmartDashboard.putData("GrabCan", new GrabCan());

        SmartDashboard.putData("GetFromStep", new GetFromStep());

        SmartDashboard.putData("RaiseCan", new RaiseCan());

        SmartDashboard.putData("StackCan", new StackCan());

        SmartDashboard.putData("LeftSideMoveForward", new LeftSideMoveForward());

        SmartDashboard.putData("WaitFor", new WaitFor());

        SmartDashboard.putData("RightSideMoveForward", new RightSideMoveForward());

        SmartDashboard.putData("SwitchCameras", new SwitchCameras());

        SmartDashboard.putData("WheelsOff", new WheelsOff());

        SmartDashboard.putData("WheelsIn", new WheelsIn());

        SmartDashboard.putData("WheelsSkew", new WheelsSkew());

        SmartDashboard.putData("WheelsOut", new WheelsOut());

        SmartDashboard.putData("LightsOn", new LightsOn());

        SmartDashboard.putData("LightsOff", new LightsOff());

        SmartDashboard.putData("SwitchLights", new SwitchLights());

        SmartDashboard.putData("ToteTabsOpen", new ToteTabsOpen());

        SmartDashboard.putData("ToteTabsClose", new ToteTabsClose());


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getDriverJoy1() {
        return driverJoy1;
    }

    public Joystick getLogitechJoy() {
        return logitechJoy;
    }

    public Joystick getButtonsTo13() {
        return buttonsTo13;
    }

    public Joystick getButtonsTo24() {
        return buttonsTo24;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

