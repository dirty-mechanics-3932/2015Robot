package org.usfirst.frc3932;

import org.usfirst.frc3932.commands.BackAwaySlowly;
import org.usfirst.frc3932.commands.LightsOff;
import org.usfirst.frc3932.commands.LightsOn;
import org.usfirst.frc3932.commands.SwitchLights;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class DriverJoystick extends Joystick{
	
	JoystickButton button1;
	JoystickButton button2;
	JoystickButton button3;
	JoystickButton button4;
	JoystickButton button5;
	JoystickButton button6;
	JoystickButton hatUp;
	JoystickButton toggle;
	
	public DriverJoystick(int port) {
		super(port);
		
		button1 = new JoystickButton(this, 1);
		button2 = new JoystickButton(this, 2);
		button3 = new JoystickButton(this, 3);
		button4 = new JoystickButton(this, 4);
		button5 = new JoystickButton(this, 5);
		button6 = new JoystickButton(this, 6);
		hatUp = new JoystickButton(this,7);// id number to be verified
		toggle = new JoystickButton(this, 8); // id number to be verified
		
		button1.whenPressed(new SwitchLights());
		button2.whenPressed(new BackAwaySlowly());
		toggle.whenPressed(new LightsOn());
		toggle.whenReleased(new LightsOff());
	}
	
}
