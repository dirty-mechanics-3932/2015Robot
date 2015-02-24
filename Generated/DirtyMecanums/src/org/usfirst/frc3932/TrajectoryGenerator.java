package org.usfirst.frc3932;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class TrajectoryGenerator {
	
    protected int destination = 0;
    protected int currentTarget = 0;
    protected boolean goingDown = false;
    protected int ticksPerUpdate = 17;
    public static final int REVERSE = -1;
    public static final int FORWARD = 1;
    public int direction = FORWARD;
    
    public TrajectoryGenerator(int setpoint, int currentPosition, int ticksPerUpdate){
    	this.setDestination(setpoint);
    	this.setCurrentTarget(currentPosition);
    	this.setTicksPerUpdate(ticksPerUpdate);
    }
    
    public TrajectoryGenerator(){}
    
    
    
    public void goToDestination(int pos) {
    	this.destination = pos;
    	if (destination > currentTarget) {
    		direction = FORWARD;
    	} else {
    		direction = REVERSE;
    	}
    }
    
    public void execute(Settable output) {
    	int increment = ticksPerUpdate*direction;
		if (currentTarget >= destination-ticksPerUpdate && currentTarget <= destination+ticksPerUpdate) {
			this.currentTarget = destination;
    	} else {
    		this.currentTarget = currentTarget + increment;
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
