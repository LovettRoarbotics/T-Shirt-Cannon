package org.usfirst.frc.team5482.robot;

import org.usfirst.frc.team5482.lib.util.RoboSpeedController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

public class HardwareAdapter {

	//Joysticks
	public static Joystick kMainStick = new Joystick(0);
	
	//Motors
	public static RoboSpeedController kLeftDriveMotor = new RoboSpeedController(
	            new Talon(Constants.kLeftDriveMotorPWM), new int[]{
	            Constants.kLeftDriveMotor1PDP,
	            Constants.kLeftDriveMotor2PDP});
	public static RoboSpeedController kRightDriveMotor = new RoboSpeedController(
	            new Talon(Constants.kRightDriveMotorPWM), new int[]{
	            Constants.kRightDriveMotor2PDP,
	            Constants.kRightDriveMotor2PDP});
	public static RoboSpeedController kAltitudeMotor = new RoboSpeedController(
	            new Victor(Constants.kAltitudeMotorPWM), new int[]{
	            Constants.kRightDriveMotor2PDP,
	            Constants.kRightDriveMotor2PDP});
	 
	 //Electrical Systems
	 public static PowerDistributionPanel kPDP = new PowerDistributionPanel();
}
