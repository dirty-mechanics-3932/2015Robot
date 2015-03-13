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

import org.usfirst.frc3932.commands.ArmManualControl;
import org.usfirst.frc3932.commands.ArmsBackout;
import org.usfirst.frc3932.commands.ArmsCloseButton;
import org.usfirst.frc3932.commands.ArmsClosed;
import org.usfirst.frc3932.commands.ArmsFullOpen;
import org.usfirst.frc3932.commands.ArmsHalfOpen;
import org.usfirst.frc3932.commands.ArmsOpenButton;
import org.usfirst.frc3932.commands.AutoMoveBackwards;
import org.usfirst.frc3932.commands.AutoMoveSideways;
import org.usfirst.frc3932.commands.AutonomousCommand;
import org.usfirst.frc3932.commands.BackAwaySlowly;
import org.usfirst.frc3932.commands.CanTabsClose;
import org.usfirst.frc3932.commands.CanTabsOpen;
import org.usfirst.frc3932.commands.ClearAll;
import org.usfirst.frc3932.commands.CrabLeftOverCan;
import org.usfirst.frc3932.commands.CrabLeftOverTote;
import org.usfirst.frc3932.commands.DisAbleCanTabSafety;
import org.usfirst.frc3932.commands.DisableToteTabSafety;
import org.usfirst.frc3932.commands.Dock;
import org.usfirst.frc3932.commands.ElevatorManualControl;
import org.usfirst.frc3932.commands.ElevatorToCan;
import org.usfirst.frc3932.commands.ElevatorToCanBottom;
import org.usfirst.frc3932.commands.ElevatorToFourTotes;
import org.usfirst.frc3932.commands.ElevatorToHang;
import org.usfirst.frc3932.commands.ElevatorToLowCan;
import org.usfirst.frc3932.commands.ElevatorToOneTote;
import org.usfirst.frc3932.commands.ElevatorToPlatform;
import org.usfirst.frc3932.commands.ElevatorToScoring;
import org.usfirst.frc3932.commands.ElevatorToStack;
import org.usfirst.frc3932.commands.ElevatorToStart;
import org.usfirst.frc3932.commands.ElevatorToStep;
import org.usfirst.frc3932.commands.ElevatorToTabs;
import org.usfirst.frc3932.commands.ElevatorToThreeTotes;
import org.usfirst.frc3932.commands.ElevatorToTop;
import org.usfirst.frc3932.commands.ElevatorToTransport;
import org.usfirst.frc3932.commands.ElevatorToTwoTotes;
import org.usfirst.frc3932.commands.ElevatorToWeightBearing;
import org.usfirst.frc3932.commands.EnableCanTabSafety;
import org.usfirst.frc3932.commands.EnableToteTabSafety;
import org.usfirst.frc3932.commands.GatesClosed;
import org.usfirst.frc3932.commands.GatesFullOpen;
import org.usfirst.frc3932.commands.GatesHalfOpen;
import org.usfirst.frc3932.commands.GetFromStep;
import org.usfirst.frc3932.commands.GrabCan;
import org.usfirst.frc3932.commands.LeftSideDock;
import org.usfirst.frc3932.commands.LeftSideUltraDock;
import org.usfirst.frc3932.commands.LockGatesAroundCan;
import org.usfirst.frc3932.commands.LookForFirstTote;
import org.usfirst.frc3932.commands.LookForTote;
import org.usfirst.frc3932.commands.RaiseCan;
import org.usfirst.frc3932.commands.RaiseStackToScoring;
import org.usfirst.frc3932.commands.RecieveTote;
import org.usfirst.frc3932.commands.ResetElevatorPosition;
import org.usfirst.frc3932.commands.RightSideUltraDock;
import org.usfirst.frc3932.commands.StackCan;
import org.usfirst.frc3932.commands.StashGroundTote;
import org.usfirst.frc3932.commands.StashTote;
import org.usfirst.frc3932.commands.SwitchLights;
import org.usfirst.frc3932.commands.Teleop;
import org.usfirst.frc3932.commands.UltraDock;
import org.usfirst.frc3932.commands.WheelsIn;
import org.usfirst.frc3932.commands.WheelsOff;
import org.usfirst.frc3932.commands.WheelsOut;
import org.usfirst.frc3932.commands.WheelsSkew;

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
    public JoystickButton crabLeftOverCan3;
    public JoystickButton lookForFirstT4;
    public JoystickButton crabLeftOverT5;
    public JoystickButton lookForTote6;
    public JoystickButton dock1;
    public Joystick driverJoy1;
    public Joystick logitechJoy;
    public JoystickButton g1Elevator1T;
    public JoystickButton g2Elevator2T;
    public JoystickButton g3Elevator3T;
    public JoystickButton g4Elevator4T;
    public JoystickButton g5RecieveT;
    public JoystickButton g6StashT;
    public JoystickButton g7ArmsOpen;
    public JoystickButton g8ArmsWide;
    public JoystickButton g9ArmsGrab;
    public JoystickButton g10ArmsClosed;
    public JoystickButton g11StashGroundT;
    public JoystickButton g12WheelsIn;
    public JoystickButton g13RaiseStack;
    public Joystick buttonsTo13;
    public JoystickButton g14ArmsClose;
    public JoystickButton g15GrabCan;
    public JoystickButton g16GetFromStep;
    public JoystickButton g17RaiseCan;
    public JoystickButton g18StackCan;
    public JoystickButton g19WheelsOff;
    public JoystickButton g20WheelsIn;
    public JoystickButton g21WheelsSkew;
    public JoystickButton g22WheelsOut;
    public JoystickButton thumb23GatesOpen;
    public JoystickButton thumb24GatesClose;
    public Joystick buttonsTo24;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        buttonsTo24 = new Joystick(3);
        
        thumb24GatesClose = new JoystickButton(buttonsTo24, 11);
        thumb24GatesClose.whenPressed(new GatesClosed());
        thumb23GatesOpen = new JoystickButton(buttonsTo24, 10);
        thumb23GatesOpen.whenPressed(new GatesFullOpen());
        g22WheelsOut = new JoystickButton(buttonsTo24, 9);
        g22WheelsOut.whenPressed(new WheelsOut());
        g21WheelsSkew = new JoystickButton(buttonsTo24, 8);
        g21WheelsSkew.whenPressed(new WheelsSkew());
        g20WheelsIn = new JoystickButton(buttonsTo24, 7);
        g20WheelsIn.whenPressed(new WheelsIn());
        g19WheelsOff = new JoystickButton(buttonsTo24, 6);
        g19WheelsOff.whenPressed(new WheelsOff());
        g18StackCan = new JoystickButton(buttonsTo24, 5);
        g18StackCan.whenPressed(new StackCan());
        g17RaiseCan = new JoystickButton(buttonsTo24, 4);
        g17RaiseCan.whenPressed(new RaiseCan());
        g16GetFromStep = new JoystickButton(buttonsTo24, 3);
        g16GetFromStep.whenPressed(new GetFromStep());
        g15GrabCan = new JoystickButton(buttonsTo24, 2);
        g15GrabCan.whenPressed(new GrabCan());
        g14ArmsClose = new JoystickButton(buttonsTo24, 1);
        g14ArmsClose.whileHeld(new ArmsCloseButton());
        buttonsTo13 = new Joystick(2);
        
        g13RaiseStack = new JoystickButton(buttonsTo13, 13);
        g13RaiseStack.whenPressed(new RaiseStackToScoring());
        g12WheelsIn = new JoystickButton(buttonsTo13, 12);
        g12WheelsIn.whenPressed(new WheelsIn());
        g11StashGroundT = new JoystickButton(buttonsTo13, 11);
        g11StashGroundT.whenPressed(new StashGroundTote());
        g10ArmsClosed = new JoystickButton(buttonsTo13, 10);
        g10ArmsClosed.whenPressed(new ArmsClosed());
        g9ArmsGrab = new JoystickButton(buttonsTo13, 9);
        g9ArmsGrab.whenPressed(new ArmsHalfOpen());
        g8ArmsWide = new JoystickButton(buttonsTo13, 8);
        g8ArmsWide.whenPressed(new ArmsFullOpen());
        g7ArmsOpen = new JoystickButton(buttonsTo13, 7);
        g7ArmsOpen.whileHeld(new ArmsOpenButton());
        g6StashT = new JoystickButton(buttonsTo13, 6);
        g6StashT.whenPressed(new StashTote());
        g5RecieveT = new JoystickButton(buttonsTo13, 5);
        g5RecieveT.whenPressed(new RecieveTote());
        g4Elevator4T = new JoystickButton(buttonsTo13, 4);
        g4Elevator4T.whenPressed(new ElevatorToFourTotes());
        g3Elevator3T = new JoystickButton(buttonsTo13, 3);
        g3Elevator3T.whenPressed(new ElevatorToThreeTotes());
        g2Elevator2T = new JoystickButton(buttonsTo13, 2);
        g2Elevator2T.whenPressed(new ElevatorToTwoTotes());
        g1Elevator1T = new JoystickButton(buttonsTo13, 1);
        g1Elevator1T.whenPressed(new ElevatorToOneTote());
        logitechJoy = new Joystick(1);
        
        driverJoy1 = new Joystick(0);
        
        dock1 = new JoystickButton(driverJoy1, 1);
        dock1.whileHeld(new UltraDock());
        lookForTote6 = new JoystickButton(driverJoy1, 6);
        lookForTote6.whenPressed(new LookForTote());
        crabLeftOverT5 = new JoystickButton(driverJoy1, 5);
        crabLeftOverT5.whenPressed(new CrabLeftOverTote());
        lookForFirstT4 = new JoystickButton(driverJoy1, 4);
        lookForFirstT4.whenPressed(new LookForFirstTote());
        crabLeftOverCan3 = new JoystickButton(driverJoy1, 3);
        crabLeftOverCan3.whenPressed(new CrabLeftOverCan());
        backAwaySlowly2 = new JoystickButton(driverJoy1, 2);
        backAwaySlowly2.whenPressed(new BackAwaySlowly());
        switchLights2 = new JoystickButton(driverJoy1, 1);
        switchLights2.whenPressed(new SwitchLights());

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("AutonomousCommand", new AutonomousCommand());

        SmartDashboard.putData("AutoMoveBackwards", new AutoMoveBackwards());

        SmartDashboard.putData("AutoMoveSideways", new AutoMoveSideways());

        SmartDashboard.putData("Teleop", new Teleop());

        SmartDashboard.putData("ArmsClosed", new ArmsClosed());

        SmartDashboard.putData("ArmsHalfOpen", new ArmsHalfOpen());

        SmartDashboard.putData("ArmsFullOpen", new ArmsFullOpen());

        SmartDashboard.putData("ArmsBackout", new ArmsBackout());

        SmartDashboard.putData("CanTabsOpen", new CanTabsOpen());

        SmartDashboard.putData("CanTabsClose", new CanTabsClose());

        SmartDashboard.putData("GatesClosed", new GatesClosed());

        SmartDashboard.putData("GatesHalfOpen", new GatesHalfOpen());

        SmartDashboard.putData("GatesFullOpen", new GatesFullOpen());

        SmartDashboard.putData("ElevatorToStart", new ElevatorToStart());

        SmartDashboard.putData("ElevatorToTransport", new ElevatorToTransport());

        SmartDashboard.putData("ElevatorToPlatform", new ElevatorToPlatform());

        SmartDashboard.putData("ElevatorToScoring", new ElevatorToScoring());

        SmartDashboard.putData("ElevatorToStep", new ElevatorToStep());

        SmartDashboard.putData("ElevatorToCanBottom", new ElevatorToCanBottom());

        SmartDashboard.putData("ElevatorToWeightBearing", new ElevatorToWeightBearing());

        SmartDashboard.putData("ElevatorToLowCan", new ElevatorToLowCan());

        SmartDashboard.putData("ElevatorToTabs", new ElevatorToTabs());

        SmartDashboard.putData("ElevatorToHang", new ElevatorToHang());

        SmartDashboard.putData("ElevatorToCan", new ElevatorToCan());

        SmartDashboard.putData("ElevatorToStack", new ElevatorToStack());

        SmartDashboard.putData("ElevatorToTop", new ElevatorToTop());

        SmartDashboard.putData("ElevatorToOneTote", new ElevatorToOneTote());

        SmartDashboard.putData("ElevatorToTwoTotes", new ElevatorToTwoTotes());

        SmartDashboard.putData("ElevatorToThreeTotes", new ElevatorToThreeTotes());

        SmartDashboard.putData("ElevatorToFourTotes", new ElevatorToFourTotes());

        SmartDashboard.putData("ResetElevatorPosition", new ResetElevatorPosition());

        SmartDashboard.putData("LockGatesAroundCan", new LockGatesAroundCan());

        SmartDashboard.putData("RecieveTote", new RecieveTote());

        SmartDashboard.putData("StashTote", new StashTote());

        SmartDashboard.putData("LookForTote", new LookForTote());

        SmartDashboard.putData("GrabCan", new GrabCan());

        SmartDashboard.putData("StackCan", new StackCan());

        SmartDashboard.putData("WheelsOff", new WheelsOff());

        SmartDashboard.putData("WheelsIn", new WheelsIn());

        SmartDashboard.putData("WheelsSkew", new WheelsSkew());

        SmartDashboard.putData("WheelsOut", new WheelsOut());

        SmartDashboard.putData("SwitchLights", new SwitchLights());

        SmartDashboard.putData("ElevatorManualControl", new ElevatorManualControl());

        SmartDashboard.putData("ClearAll", new ClearAll());

        SmartDashboard.putData("DisableToteTabSafety", new DisableToteTabSafety());

        SmartDashboard.putData("EnableToteTabSafety", new EnableToteTabSafety());

        SmartDashboard.putData("DisAbleCanTabSafety", new DisAbleCanTabSafety());

        SmartDashboard.putData("EnableCanTabSafety", new EnableCanTabSafety());

        SmartDashboard.putData("ArmManualControl", new ArmManualControl());

        SmartDashboard.putData("ArmsOpenButton", new ArmsOpenButton());

        SmartDashboard.putData("ArmsCloseButton", new ArmsCloseButton());

        SmartDashboard.putData("Dock", new Dock());

        SmartDashboard.putData("LeftSideUltraDock", new LeftSideUltraDock());

        SmartDashboard.putData("RightSideUltraDock", new RightSideUltraDock());

        SmartDashboard.putData("UltraDock", new UltraDock());


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
    
    public void execute() {
//    	if (driverJoy1.getPOV() == 0){
//    		Robot.frontCamera();
//    	}
//    	else if (driverJoy1.getPOV() == 180){
//    		Robot.rearCamera();
//    	}
    }
}

