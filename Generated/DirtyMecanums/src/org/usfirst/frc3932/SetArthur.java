package org.usfirst.frc3932;

import org.usfirst.frc3932.subsystems.ArthurDriveSystem;
import org.usfirst.frc3932.subsystems.ArthurElevator;

public class SetArthur implements SetRobot {

	@Override
	public void config() {
		Robot.driveSystem = new ArthurDriveSystem();
		Robot.elevator = new ArthurElevator();

	}

}
