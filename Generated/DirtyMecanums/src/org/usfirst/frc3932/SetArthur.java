package org.usfirst.frc3932;

import org.usfirst.frc3932.subsystems.ArthurDriveSystem;

public class SetArthur implements SetRobot {
	private final static int TICKS_PER_UPDATE = 700;
	private final static int MIN_TICKS = 50;
	private final static int MAX_TICKS = 8650;

	@Override
	public void config() {
		Robot.driveSystem = new ArthurDriveSystem();
		Robot.elevator.setTicksPerUpdate(TICKS_PER_UPDATE);
		Robot.elevator.setMinTicks(MIN_TICKS);
		Robot.elevator.setMaxTicks(MAX_TICKS);

	}

}
