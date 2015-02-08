// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3932;
    
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveSystemLeftFront;
    public static CANTalon driveSystemRightBack;
    public static CANTalon driveSystemLeftBack;
    public static CANTalon driveSystemRightFront;
    public static RobotDrive driveSystemMecanumDrive;
    public static DoubleSolenoid driveSystemLeftTransmissionDblSolenoid;
    public static DoubleSolenoid driveSystemRightTransmissionDblSolenoid;
    public static AnalogInput driveSystemmaxbotixLvMaxSonarEz;
    public static CANTalon elevatorElevatorCANTalon;
    public static Encoder gatesLeftGateEncoder;
    public static Encoder gatesRightGateEncoder;
    public static SpeedController gatesRightGateTalon;
    public static SpeedController gatesLeftGateTalon;
    public static Relay tabsLeftTabSpike;
    public static Relay tabsRightTabSpike;
    public static SpeedController armsLeftArmTalon;
    public static SpeedController armsRightArmTalon;
    public static DoubleSolenoid armsLongPistonsDblSolenoid;
    public static DoubleSolenoid armsShortPistonDblSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveSystemLeftFront = new CANTalon(2);
        
        
        driveSystemRightBack = new CANTalon(3);
        
        
        driveSystemLeftBack = new CANTalon(4);
        
        
        driveSystemRightFront = new CANTalon(5);
        
        
        driveSystemMecanumDrive = new RobotDrive(driveSystemLeftFront, driveSystemLeftBack,
              driveSystemRightFront, driveSystemRightBack);
        
        driveSystemMecanumDrive.setSafetyEnabled(true);
        driveSystemMecanumDrive.setExpiration(0.1);
        driveSystemMecanumDrive.setSensitivity(0.5);
        driveSystemMecanumDrive.setMaxOutput(1.0);
        driveSystemMecanumDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveSystemMecanumDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveSystemLeftTransmissionDblSolenoid = new DoubleSolenoid(0, 0, 1);      
        LiveWindow.addActuator("DriveSystem", "LeftTransmissionDblSolenoid", driveSystemLeftTransmissionDblSolenoid);
        
        driveSystemRightTransmissionDblSolenoid = new DoubleSolenoid(0, 2, 3);      
        LiveWindow.addActuator("DriveSystem", "RightTransmissionDblSolenoid", driveSystemRightTransmissionDblSolenoid);
        
        driveSystemmaxbotixLvMaxSonarEz = new AnalogInput(0);
        LiveWindow.addSensor("DriveSystem", "maxbotixLvMaxSonarEz", driveSystemmaxbotixLvMaxSonarEz);
        
        elevatorElevatorCANTalon = new CANTalon(6);
        
        
        gatesLeftGateEncoder = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("Gates", "LeftGateEncoder", gatesLeftGateEncoder);
        gatesLeftGateEncoder.setDistancePerPulse(1.0);
        gatesLeftGateEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        gatesRightGateEncoder = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("Gates", "RightGateEncoder", gatesRightGateEncoder);
        gatesRightGateEncoder.setDistancePerPulse(1.0);
        gatesRightGateEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        gatesRightGateTalon = new Talon(3);
        LiveWindow.addActuator("Gates", "RightGateTalon", (Talon) gatesRightGateTalon);
        
        gatesLeftGateTalon = new Talon(4);
        LiveWindow.addActuator("Gates", "LeftGateTalon", (Talon) gatesLeftGateTalon);
        
        tabsLeftTabSpike = new Relay(0);
        LiveWindow.addActuator("Tabs", "LeftTabSpike", tabsLeftTabSpike);
        
        tabsRightTabSpike = new Relay(1);
        LiveWindow.addActuator("Tabs", "RightTabSpike", tabsRightTabSpike);
        
        armsLeftArmTalon = new Talon(0);
        LiveWindow.addActuator("Arms", "LeftArmTalon", (Talon) armsLeftArmTalon);
        
        armsRightArmTalon = new Talon(1);
        LiveWindow.addActuator("Arms", "RightArmTalon", (Talon) armsRightArmTalon);
        
        armsLongPistonsDblSolenoid = new DoubleSolenoid(0, 4, 5);      
        LiveWindow.addActuator("Arms", "LongPistonsDblSolenoid", armsLongPistonsDblSolenoid);
        
        armsShortPistonDblSolenoid = new DoubleSolenoid(0, 6, 7);      
        LiveWindow.addActuator("Arms", "ShortPistonDblSolenoid", armsShortPistonDblSolenoid);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
