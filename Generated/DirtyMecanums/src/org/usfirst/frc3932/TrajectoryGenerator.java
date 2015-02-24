package org.usfirst.frc3932;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TrajectoryGenerator {
	
    private int destination = 0;
    private int currentTarget = 0;
    private boolean goingDown = false;
    private int ticksPerUpdate = 17;
    
    public TrajectoryGenerator(int setpoint, int currentPosition, int ticksPerUpdate){
    	this.setDestination(setpoint);
    	this.setCurrentTarget(currentPosition);
    	this.setTicksPerUpdate(ticksPerUpdate);
    }
    
    public TrajectoryGenerator(){}
    
    
    
    public void goToDestination(int pos) {
    	this.destination = pos;
    	if (destination > currentTarget) goingDown = true;
    	else goingDown = false;
    }
    
    public void execute(Settable output) {
    	if (currentTarget >= destination-ticksPerUpdate) {
			this.currentTarget = destination;
    	} else {
    		this.currentTarget = currentTarget + ticksPerUpdate;
    	}
    	output.set(getCurrentTarget());
    	SmartDashboard.putNumber("Trajectory.out", getCurrentTarget());
    	SmartDashboard.putNumber("Trajectory.destination", getDestination());
    	
    }
    
    public boolean isFinished() {
    	return currentTarget == destination;
    }

	private int getDestination() {
		return destination;
	}

	public void setDestination(int setpoint) {
		this.destination = setpoint;
	}

	public int getCurrentTarget() {
		return currentTarget;
	}

	public void setCurrentTarget(int target) {
		this.currentTarget = target;
	}

	public int getTicksPerUpdate() {
		return ticksPerUpdate;
	}

	public void setTicksPerUpdate(int TICKS_PER_UPDATE) {
		this.ticksPerUpdate = TICKS_PER_UPDATE;
	}

}
