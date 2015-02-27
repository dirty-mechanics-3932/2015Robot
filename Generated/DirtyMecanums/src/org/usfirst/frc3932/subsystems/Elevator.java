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
import org.usfirst.frc3932.Settable;
import org.usfirst.frc3932.TrajectoryGenerator;
import org.usfirst.frc3932.commands.ElevatorManualControl;
import org.usfirst.frc3932.field.RecycleBin;
import org.usfirst.frc3932.field.Tote;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem implements Settable {

	private static final double PID_P = 4d;
	private static final double PID_I = 0.007d; // .2

	private static final int TICKS_PER_UPDATE = 76;
	private static final double PLATFORM_HEIGHT = 2d;
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalInput bottomLimitSwitch = RobotMap.elevatorbottomLimitSwitch;
    CANTalon elevatorCANTalon = RobotMap.elevatorElevatorCANTalon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	protected int initialPosition = 0;
	public static final double TICKS_PER_INCH = 211.92d;

	public static final double LOW_TAB_HEIGHT = 41.125d;
	public static final double HIGH_TAB_HEIGHT = 58.25d;

	// public static final int GROUND = 0; // on the ground
	private static final double START = 9.5d; // on the ground
	private static final double TRANSPORT = START + 1d; // 1" above start
	private static final double PLATFORM = START + PLATFORM_HEIGHT; // 2" above
																	// start
	private static final double SCORING = PLATFORM_HEIGHT + 1d; // 3" above
																// start
	private static final double STEP = START + 6d; // at start height with
													// respect to a can on
													// the step
	private static final double CAN_BOTTOM = LOW_TAB_HEIGHT - RecycleBin.BOTTOM_TO_LIP; // at
																						// the
																						// bottom
																						// of
																						// the
																						// can,
																						// below
																						// the
																						// low
																						// tabs
	private static final double WEIGHT_BEARING = LOW_TAB_HEIGHT - (2d * Tote.HEIGHT_INCHES); // two
																								// totes
																								// below
																								// the
																								// low
																								// tabs
	private static final double LOW_CAN = LOW_TAB_HEIGHT - RecycleBin.BOTTOM_TO_LIP + START; // can
																								// at
																								// the
																								// low
																								// tabs
	private static final double TABS = LOW_TAB_HEIGHT - Tote.HEIGHT_INCHES; // one
																			// tote
																			// below
																			// the
																			// tabs
	private static final double HANG = LOW_TAB_HEIGHT - Tote.LIP_RIB; // around
																		// a
																		// half
																		// inch
																		// below
																		// the
																		// tabs
	private static final double CAN = HIGH_TAB_HEIGHT - RecycleBin.BOTTOM_TO_LIP + START; // can
																							// at
																							// the
																							// cantabs
	private static final double TOP = 76.125d; // at the very tippy top
	private static final double STACK = TOP - 1d; // one inch below top

	private TrajectoryGenerator trajectory = new TrajectoryGenerator();

	public static enum Position {
		START(Elevator.START), TRANSPORT(Elevator.TRANSPORT), PLATFORM(Elevator.PLATFORM), SCORING(Elevator.SCORING), STEP(Elevator.STEP), CAN_BOTTOM(
				Elevator.CAN_BOTTOM), WEIGHT_BEARING(Elevator.WEIGHT_BEARING), LOW_CAN(Elevator.LOW_CAN), TABS(Elevator.TABS), HANG(Elevator.HANG), CAN(
				Elevator.CAN), STACK(Elevator.STACK), TOP(Elevator.TOP);

		private double inches;

		Position(double inches) {
			this.inches = inches;
		}

		public double getInches() {
			return inches;
		}

		public int getTicks() {
			return inchesToTicks(inches);

		}
	}

	public Elevator() {
		elevatorCANTalon.changeControlMode(ControlMode.Position);
		elevatorCANTalon.setPosition(0);
		trajectory.setDestination(0);
		trajectory.setCurrentTarget(0);
		trajectory.setTicksPerUpdate(TICKS_PER_UPDATE);
	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new ElevatorManualControl());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());

		elevatorCANTalon.setPID(PID_P, PID_I, 0);
		elevatorCANTalon.set(0);
	}

	// /**
	// * Used by ResetElevatorPosition
	// * @return the value of the limit switch
	// */
	// public boolean isLimitSwitchReached(){
	// return bottomLimitSwitch.get();
	// }
	//
	// /**
	// * Used by ResetElevatorPosition. Causes the elevator to go down, without
	// setting a position.
	// */
	// public void findBottom(){
	// elevatorCANTalon.changeControlMode(ControlMode.Speed);
	// elevatorCANTalon.set(-.5);
	// }
	//
	// /**
	// * Used by ResetElevatorPosition. Cleans up after findBottom() and sets
	// the ground position.
	// */
	// public void foundBottom(){
	// elevatorCANTalon.changeControlMode(ControlMode.Position);
	// setInitialPosition();
	// goToPositionInInches(Position.START.getInches());
	// }
	//
	// /**
	// * Sets the ground position of the elevator.
	// */
	// public void setInitialPosition(){
	// elevatorCANTalon.setPosition(0);
	// }

	// public void goToPosition(Position position) {
	// goToPositionInInches(position.getInches());
	// }
	//
	// private void goToPositionInInches(double inches) {
	// int ticks = inchesToTicks(inches);
	// goToAbsolutePosition(ticks);
	// }
	//
	public static int inchesToTicks(double inches) {
		return (int) Math.floor((inches - Position.START.getInches()) * TICKS_PER_INCH);
	}

	/**
	 * Goes to a certain height.
	 * 
	 * @param pos
	 *            the height target
	 */
	public void set(int setpoint) {
		elevatorCANTalon.set(setpoint);
	}

	public double getHeight() {
		return elevatorCANTalon.get() / TICKS_PER_INCH + 9.5;
	}

	public boolean isFinished() {
		return trajectory.isFinished();
	}

	public void goToPosition(int destinationTicks) {
		trajectory.goToDestination(destinationTicks);
	}

	public void goToPosition(Position setpoint) {
		int ticks = inchesToTicks(setpoint.getInches());
		goToPosition(ticks);
	}

	public void execute() {
		trajectory.execute(this);
	}

	public void move(double scale) {
		int newDestination = trajectory.getCurrentTarget() + (int) (scale * TICKS_PER_UPDATE);
		if (newDestination < 0) {
			newDestination = 0;
		}
		if (newDestination > Position.TOP.getTicks()) {
			newDestination = Position.TOP.getTicks();
		}
		trajectory.goToDestination(newDestination);

	}

}
