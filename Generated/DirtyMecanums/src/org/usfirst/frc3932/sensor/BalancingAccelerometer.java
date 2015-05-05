package org.usfirst.frc3932.sensor;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.PIDSource;

public class BalancingAccelerometer extends BuiltInAccelerometer implements PIDSource {
	double level = 0d;
	
	public BalancingAccelerometer(Range k4g) {
		super(k4g);
	}

	public void setLevel() {
		level = calculateRelativeAngle();
	}
	
	public double calculateRelativeAngle() {
		double asinYRadians = Math.asin(getY());
		double yAxisRelativeAngle = asinYRadians * (180/Math.PI);
		return yAxisRelativeAngle;
	}
	
	public double calculateAbsoluteAngle() {
		return level - calculateRelativeAngle();
	}

	@Override
	public double pidGet() {
		return calculateAbsoluteAngle();
	}

}
