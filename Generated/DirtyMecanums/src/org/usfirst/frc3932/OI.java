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
import org.usfirst.frc3932.commands.ClearAll;
import org.usfirst.frc3932.commands.CrabLeftOverCan;
import org.usfirst.frc3932.commands.CrabLeftOverTote;
import org.usfirst.frc3932.commands.DisAbleCanTabSafety;
import org.usfirst.frc3932.commands.DisableToteTabSafety;
import org.usfirst.frc3932.commands.ElevatorManualControl;
import org.usfirst.frc3932.commands.ElevatorToCan;
import org.usfirst.frc3932.commands.ElevatorToCanBottom;
import org.usfirst.frc3932.commands.ElevatorToHang;
import org.usfirst.frc3932.commands.ElevatorToLowCan;
import org.usfirst.frc3932.commands.ElevatorToPlatform;
import org.usfirst.frc3932.commands.ElevatorToScoring;
import org.usfirst.frc3932.commands.ElevatorToStack;
import org.usfirst.frc3932.commands.ElevatorToStart;
import org.usfirst.frc3932.commands.ElevatorToStep;
import org.usfirst.frc3932.commands.ElevatorToTabs;
import org.usfirst.frc3932.commands.ElevatorToTop;
import org.usfirst.frc3932.commands.ElevatorToTransport;
import org.usfirst.frc3932.commands.ElevatorToWeightBearing;
import org.usfirst.frc3932.commands.EnableCanTabSafety;
import org.usfirst.frc3932.commands.EnableToteTabSafety;
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
import org.usfirst.frc3932.commands.Teleop;
import org.usfirst.frc3932.commands.ToteTabsClose;
import org.usfirst.frc3932.commands.ToteTabsOpen;
import org.usfirst.frc3932.commands.TransportStack;
import org.usfirst.frc3932.commands.WaitFor;
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
    public Joystick driverJoy1;
    public Joystick logitechJoy;
    public JoystickButton g1LockCan;
    public JoystickButton g2RecieveFirstT;
    public JoystickButton g3GrabRdT;
    public JoystickButton g4StashFirstT;
    public JoystickButton g5RecieveT;
    public JoystickButton g6StashT;
    public JoystickButton g7TransportStack;
    public JoystickButton g8LookFor;
    public JoystickButton g9GrabT;
    public JoystickButton g10HangT;
    public JoystickButton g11StashGroundT;
    public JoystickButton g12WheelsIn;
    public JoystickButton g13RaiseStack;
    public Joystick buttonsTo13;
    public JoystickButton g14SetStack;
    public JoystickButton g15GrabCan;
    public JoystickButton g16GetFromStep;
    public JoystickButton g17RaiseCan;
    public JoystickButton g18StackCan;
    public JoystickButton g19WheelsOff;
    public JoystickButton g20ArmsClosed;
    public JoystickButton g21ArmsGrab;
    public JoystickButton g22ArmsWide;
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
        g22ArmsWide = new JoystickButton(buttonsTo24, 9);
        g22ArmsWide.whileHeld(new ArmsFullOpen());
        g21ArmsGrab = new JoystickButton(buttonsTo24, 8);
        g21ArmsGrab.whenPressed(new ArmsHalfOpen());
        g20ArmsClosed = new JoystickButton(buttonsTo24, 7);
        g20ArmsClosed.whenPressed(new ArmsClosed());
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
        g14SetStack = new JoystickButton(buttonsTo24, 1);
        g14SetStack.whenPressed(new SetStackOnPlatform());
        buttonsTo13 = new Joystick(2);
        
        g13RaiseStack = new JoystickButton(buttonsTo13, 13);
        g13RaiseStack.whenPressed(new RaiseStackToScoring());
        g12WheelsIn = new JoystickButton(buttonsTo13, 12);
        g12WheelsIn.whenPressed(new WheelsIn());
        g11StashGroundT = new JoystickButton(buttonsTo13, 11);
        g11StashGroundT.whenPressed(new StashGroundTote());
        g10HangT = new JoystickButton(buttonsTo13, 10);
        g10HangT.whenPressed(new HangTote());
        g9GrabT = new JoystickButton(buttonsTo13, 9);
        g9GrabT.whenPressed(new GrabTote());
        g8LookFor = new JoystickButton(buttonsTo13, 8);
        g8LookFor.whenPressed(new LookForTote());
        g7TransportStack = new JoystickButton(buttonsTo13, 7);
        g7TransportStack.whenPressed(new TransportStack());
        g6StashT = new JoystickButton(buttonsTo13, 6);
        g6StashT.whenPressed(new StashTote());
        g5RecieveT = new JoystickButton(buttonsTo13, 5);
        g5RecieveT.whenPressed(new RecieveTote());
        g4StashFirstT = new JoystickButton(buttonsTo13, 4);
        g4StashFirstT.whenPressed(new StashFirstTote());
        g3GrabRdT = new JoystickButton(buttonsTo13, 3);
        g3GrabRdT.whenPressed(new GrabRecievedTote());
        g2RecieveFirstT = new JoystickButton(buttonsTo13, 2);
        g2RecieveFirstT.whenPressed(new RecieveFirstTote());
        g1LockCan = new JoystickButton(buttonsTo13, 1);
        g1LockCan.whenPressed(new LockGatesAroundCan());
        logitechJoy = new Joystick(1);
        
        driverJoy1 = new Joystick(0);
        
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

        SmartDashboard.putData("ElevatorToStep", new ElevatorToStep());

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

        SmartDashboard.putData("ElevatorManualControl", new ElevatorManualControl());

        SmartDashboard.putData("ClearAll", new ClearAll());

        SmartDashboard.putData("ToteTabsOpen", new ToteTabsOpen());

        SmartDashboard.putData("ToteTabsClose", new ToteTabsClose());

        SmartDashboard.putData("DisableToteTabSafety", new DisableToteTabSafety());

        SmartDashboard.putData("EnableToteTabSafety", new EnableToteTabSafety());

        SmartDashboard.putData("DisAbleCanTabSafety", new DisAbleCanTabSafety());

        SmartDashboard.putData("EnableCanTabSafety", new EnableCanTabSafety());


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
    	if (driverJoy1.getPOV() == 0){
    		Robot.frontCamera();
    	}
    	else if (driverJoy1.getPOV() == 180){
    		Robot.rearCamera();
    	}
    }
}

