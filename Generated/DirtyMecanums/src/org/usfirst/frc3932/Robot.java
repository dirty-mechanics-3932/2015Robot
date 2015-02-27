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

import org.usfirst.frc3932.commands.AutoMoveBackwards;
import org.usfirst.frc3932.commands.AutonomousCommand;
import org.usfirst.frc3932.commands.WaitFor;
import org.usfirst.frc3932.subsystems.Arms;
import org.usfirst.frc3932.subsystems.CanTabs;
import org.usfirst.frc3932.subsystems.DriveSystem;
import org.usfirst.frc3932.subsystems.Elevator;
import org.usfirst.frc3932.subsystems.Gates;
import org.usfirst.frc3932.subsystems.Lights;
import org.usfirst.frc3932.subsystems.ToteTabs;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    Command autonomousCommand;

   
    


    public static OI oi;
    public static SmartDashboardIO smartDashboardIO;
    SendableChooser autoChooser;
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DriveSystem driveSystem;
    public static Elevator elevator;
    public static Gates gates;
    public static ToteTabs toteTabs;
    public static Arms arms;
    public static CanTabs canTabs;
    public static Lights lights;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    static CameraFeeds cameras;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    RobotMap.init();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveSystem = new DriveSystem();
        elevator = new Elevator();
        gates = new Gates();
        toteTabs = new ToteTabs();
        arms = new Arms();
        canTabs = new CanTabs();
        lights = new Lights();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // OI must be constructed after subsystems. If the OI creates Commands 
        //(which it very likely will), subsystems are not guaranteed to be 
        // constructed yet. Thus, their requires() statements may grab null 
        // pointers. Bad news. Don't move it.
        oi = new OI();
                // instantiate the command used for the autonomous period
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        autonomousCommand = new AutonomousCommand();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        
        
        //*******************************//
        //KEEP CLEAR OF THE ABOVE AREA!!!//
        //  OUR CODE GOES BELOW!         //
        //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
        //*******************************//
        initCameras();
        initDashboardIO();
        initSendableChooser();
        
       
        
        
    }

	private void initDashboardIO() {
		smartDashboardIO = new SmartDashboardIO();
        smartDashboardIO.execute();
	}

	private void initCameras() {
		try {
        	cameras = new CameraFeeds();
        	cameras.init();
        }
        catch (Exception e) {}
	}

	private void initSendableChooser() {
		autoChooser = new SendableChooser();
        autoChooser.addDefault("Default", new AutonomousCommand());
        autoChooser.addObject("MoveBackwards", new AutoMoveBackwards());
        autoChooser.addObject("Nothing", new WaitFor());
	}

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    public void disabledPeriodic() {
    	Robot.smartDashboardIO.execute();
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
    	readAutonomousFromChooser();
    	if (autonomousCommand != null) autonomousCommand.start();
    }

	private void readAutonomousFromChooser() {
		Command commandFromChooser = (Command) autoChooser.getSelected();
    	if (commandFromChooser != null) {
    		autonomousCommand = commandFromChooser;
    	}
	}

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	smartDashboardIO.execute();
        Scheduler.getInstance().run();
        
        }

    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	smartDashboardIO.execute();
        Scheduler.getInstance().run();
        oi.execute();
        try{cameras.run();} catch(Exception e){}
    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
        smartDashboardIO.execute();
    }
    
    public static void switchCameras() {
    	try{cameras.switchCams();}
    	catch(Exception e){}
    }
    
    public static void frontCamera(){
    	try {
    		cameras.changeCam(cameras.camFront);
    	}
    	catch (Exception e){}
    }
    
    public static void rearCamera(){
    	try {
    		cameras.changeCam(cameras.camRear);
    	}
    	catch (Exception e){}
    }
}
