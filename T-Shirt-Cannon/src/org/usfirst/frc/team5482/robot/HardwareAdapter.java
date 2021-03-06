package org.usfirst.frc.team5482.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

public class HardwareAdapter {

	// Joysticks
	public static Joystick kMainStick = new Joystick(0);

	// Motors
	public static Talon kLeftDriveMotor = new Talon(Constants.kLeftDriveMotorPWM);
	public static Talon kRightDriveMotor = new Talon(Constants.kRightDriveMotorPWM);
	public static Victor kAltitudeMotor = new Victor(Constants.kAltitudeMotorPWM);
	
	// Sensors
	public static AnalogInput kFireTankPressure = new AnalogInput(Constants.kPressureSensor);
	public static AnalogInput kOneTankPressure = new AnalogInput(Constants.kPressureSensor);
	public static Encoder kAltitudeEncoder = new Encoder(0, 1);

	// Electrical Systems
	public static PowerDistributionPanel kPDP = new PowerDistributionPanel();

	// Pneumatics
	public static Solenoid kRegulatorValve = new Solenoid(Constants.kRegulatorValvePort);
	public static Victor kFiringValve = new Victor(Constants.kFiringValvePort);
	public static Compressor kCompressor = new Compressor();

	// Variables? I guess? I did not no where else to put this so it will stay
	// here. Eh, I could probably put it in
	// Firing system, but im to lazy and its not worth an entire commit.
	public static double kFiringPressure;
}
