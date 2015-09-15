package org.usfirst.frc3932.subsystems;

import edu.wpi.first.wpilibj.CANTalon.ControlMode;

public class ArthurElevator extends Elevator {
	private final static int TICKS_PER_UPDATE = 30;
	private final static int MIN_TICKS = 50;
	private final static int MAX_TICKS = 8650;
	
	public ArthurElevator() {
		elevatorCANTalon.changeControlMode(ControlMode.Position);
		elevatorCANTalon.setPosition(0);
		trajectory.setDestination(MIN_TICKS);
		trajectory.setCurrentTarget(MIN_TICKS);
		trajectory.setTicksPerUpdate(TICKS_PER_UPDATE);
	}
	
	public void move(double scale) {
		int newDestination = trajectory.getCurrentTarget() + (int) (scale * TICKS_PER_UPDATE);
		if (newDestination < MIN_TICKS) {
			newDestination = MIN_TICKS;
		}
		if (newDestination > MAX_TICKS-20) {
			newDestination = MAX_TICKS-20;
		}
		trajectory.goToDestination(newDestination);

	}
	
	public boolean isFinished() {
		return trajectory.isFinished();
	}

}
