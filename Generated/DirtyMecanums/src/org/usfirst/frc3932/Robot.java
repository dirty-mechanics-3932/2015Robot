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
import org.usfirst.frc3932.commands.AutoMoveSideways;
import org.usfirst.frc3932.commands.AutonomousCommand;
import org.usfirst.frc3932.commands.WaitFor;
import org.usfirst.frc3932.subsystems.DriveSystem;
import org.usfirst.frc3932.subsystems.Elevator;
import org.usfirst.frc3932.subsystems.Lights;
import org.usfirst.frc3932.subsystems.PneumaticArms;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
	SendableChooser robotChooser, autoChooser;

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DriveSystem driveSystem;
    public static Elevator elevator;
    public static Lights lights;
    public static PneumaticArms pneumaticArms;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    


	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {
		RobotMap.init();
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveSystem = new DriveSystem();
        elevator = new Elevator();
        lights = new Lights();
        pneumaticArms = new PneumaticArms();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        try {
			initDashboardIO();
			initRobotSendableChooser();
			initAutoSendableChooser();
			setRobot();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		// OI must be constructed after subsystems. If the OI creates Commands
		// (which it very likely will), subsystems are not guaranteed to be
		// constructed yet. Thus, their requires() statements may grab null
		// pointers. Bad news. Don't move it.
		oi = new OI();
		// instantiate the command used for the autonomous period
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS
        autonomousCommand = new AutoMoveBackwards();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=AUTONOMOUS

		// *******************************//
		// KEEP CLEAR OF THE ABOVE AREA!!!//
		// OUR CODE GOES BELOW! //
		// vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv//
		// *******************************//
	}

	private void initDashboardIO() {
		smartDashboardIO = new SmartDashboardIO();
		smartDashboardIO.execute();
	}

	private void initAutoSendableChooser() {
		autoChooser = new SendableChooser();
		autoChooser.addDefault("Default", new AutonomousCommand());
		autoChooser.addObject("MoveBackwards", new AutoMoveBackwards());
		autoChooser.addObject("MoveRight", new AutoMoveSideways());
		autoChooser.addObject("Nothing", new WaitFor());
		SmartDashboard.putData("PickAuto", autoChooser);
	}
	
	private void initRobotSendableChooser() {
		robotChooser = new SendableChooser();
		robotChooser.addDefault("Rice Krispies", new SetRiceKrispies());
		robotChooser.addObject("Arthur", new SetArthur());
		SmartDashboard.putData("Choose Robot", robotChooser);
	}

	private void setRobot() {
		SetRobot robotFromChooser = (SetRobot) robotChooser.getSelected();
		if (robotFromChooser != null) {
			robotFromChooser.config();
		}
	}
	/**
	 * This function is called when the disabled button is hit. You can use it
	 * to reset subsystems before shutting down.
	 */
	public void disabledInit() {

	}

	public void disabledPeriodic() {
		try {
			Robot.smartDashboardIO.execute();
			Scheduler.getInstance().run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void autonomousInit() {
		setRobot();
		// schedule the autonomous command (example)

		try {
			 readAutonomousFromChooser();
			 if (autonomousCommand != null) autonomousCommand.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		setRobot();
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null) {
			autonomousCommand.cancel();
		}
		//Insure all commands stop
		Scheduler.getInstance().removeAll();
	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
		smartDashboardIO.execute();
		Scheduler.getInstance().run();
		oi.execute();
	}
	
	public void testInit() {
		setRobot();
	}

	/**
	 * This function is called periodically during test mode
	 */
	public void testPeriodic() {
		LiveWindow.run();
		smartDashboardIO.execute();
	}


}
