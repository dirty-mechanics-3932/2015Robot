package org.usfirst.frc3932;

import org.usfirst.frc3932.commands.GetFromStep;
import org.usfirst.frc3932.commands.GrabCan;
import org.usfirst.frc3932.commands.GrabRecievedTote;
import org.usfirst.frc3932.commands.GrabTote;
import org.usfirst.frc3932.commands.HangTote;
import org.usfirst.frc3932.commands.LockGatesAroundCan;
import org.usfirst.frc3932.commands.LookForTote;
import org.usfirst.frc3932.commands.RaiseCan;
import org.usfirst.frc3932.commands.RaiseStackToScoring;
import org.usfirst.frc3932.commands.RecieveFirstTote;
import org.usfirst.frc3932.commands.RecieveTote;
import org.usfirst.frc3932.commands.SetStackOnPlatform;
import org.usfirst.frc3932.commands.StackCan;
import org.usfirst.frc3932.commands.StashFirstTote;
import org.usfirst.frc3932.commands.StashGroundTote;
import org.usfirst.frc3932.commands.StashTote;
import org.usfirst.frc3932.commands.TransportStack;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OperatorJoyStick extends Joystick{

	 public JoystickButton g1;
	 public JoystickButton g2;
	 public JoystickButton g3;
	 public JoystickButton g4;
	 public JoystickButton g5;
	 public JoystickButton g6;
	 public JoystickButton g7;
	 public JoystickButton g8;
	 public JoystickButton g9;
	 public JoystickButton g10;
	 public JoystickButton g11;
	 public JoystickButton g13;
	 public JoystickButton g14;
	 public JoystickButton g15;
	 public JoystickButton g16;
	 public JoystickButton g17;
	 public JoystickButton g18;
	 
	    
	public OperatorJoyStick(int port) {
		super(port);
		 g18 = new JoystickButton(this, 5);
	        g18.whenPressed(new StackCan());
	        g17 = new JoystickButton(buttonsTo24, 4);
	        g17.whenPressed(new RaiseCan());
	        g16 = new JoystickButton(buttonsTo24, 3);
	        g16.whenPressed(new GetFromStep());
	        g15 = new JoystickButton(buttonsTo24, 2);
	        g15.whenPressed(new GrabCan());
	        g14 = new JoystickButton(buttonsTo24, 1);
	        g14.whenPressed(new SetStackOnPlatform());
	        buttonsTo13 = new Joystick(2);
	        
	        g13 = new JoystickButton(buttonsTo13, 13);
	        g13.whenPressed(new RaiseStackToScoring());
	        g11 = new JoystickButton(buttonsTo13, 11);
	        g11.whenPressed(new StashGroundTote());
	        g10 = new JoystickButton(buttonsTo13, 10);
	        g10.whenPressed(new HangTote());
	        g9 = new JoystickButton(buttonsTo13, 9);
	        g9.whenPressed(new GrabTote());
	        g8 = new JoystickButton(buttonsTo13, 8);
	        g8.whenPressed(new LookForTote());
	        g7 = new JoystickButton(buttonsTo13, 7);
	        g7.whenPressed(new TransportStack());
	        g6 = new JoystickButton(buttonsTo13, 6);
	        g6.whenPressed(new StashTote());
	        g5 = new JoystickButton(buttonsTo13, 5);
	        g5.whenPressed(new RecieveTote());
	        g4 = new JoystickButton(buttonsTo13, 4);
	        g4.whenPressed(new StashFirstTote());
	        g3 = new JoystickButton(buttonsTo13, 3);
	        g3.whenPressed(new GrabRecievedTote());
	        g2 = new JoystickButton(buttonsTo13, 2);
	        g2.whenPressed(new RecieveFirstTote());
	        g1 = new JoystickButton(buttonsTo13, 1);
	        g1.whenPressed(new LockGatesAroundCan());
		
	}
	
	

	

}
