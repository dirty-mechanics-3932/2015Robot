package org.usfirst.frc3932;

import edu.wpi.first.wpilibj.Timer;

public class USBCameraPeriodic extends USBCamera {
	private Timer timer = new Timer();
	public static final double PERIOD = 100d;
	private double period = PERIOD;
	public static final int MAX_FPS = 20;
	public static final int CYCLES_PER_SECOND = 50; //1 cycle every 20 ms so 50 * 20 = 1000
	
	public USBCameraPeriodic() {
		period = PERIOD;
	}
	
	public USBCameraPeriodic(int fps) {
		if (fps > MAX_FPS) {
			System.out.println(fps + " exceeds max of " + MAX_FPS);
			period = PERIOD;
		} else {
			//50 cycles per second
			//fps is frames per second
			// so fps/50 = periods per second
			period = (int) fps / CYCLES_PER_SECOND;
		}
	}
	
	
	
	@Override
	public void executeCamera() {
		if (timer.hasPeriodPassed(period)) {
			super.executeCamera();
		}
	}
	
}
