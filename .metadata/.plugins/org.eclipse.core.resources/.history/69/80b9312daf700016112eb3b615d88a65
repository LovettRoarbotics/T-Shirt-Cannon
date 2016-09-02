package org.usfirst.frc.team5482.robot;

import org.usfirst.frc.team5482.lib.util.RoboSpeedController;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.VictorSP;

public class HardwareAdapter {

	//Joysticks
	public static Joystick kMainStick = new Joystick(0);
	
	//Motors
	 static RoboSpeedController kLeftDriveMotor = new RoboSpeedController(
	            new VictorSP(Constants.kLeftDriveMotorPWM), new int[]{
	            Constants.kLeftDriveMotor1PDP,
	            Constants.kLeftDriveMotor2PDP});
	 static RoboSpeedController kRightDriveMotor = new RoboSpeedController(
	            new VictorSP(Constants.kRightDriveMotorPWM), new int[]{
	            Constants.kRightDriveMotor2PDP,
	            Constants.kRightDriveMotor2PDP});
	 static RoboSpeedController kAltitudeMotor = new RoboSpeedController(
	            new VictorSP(Constants.kAltitudeMotorPWM), new int[]{
	            Constants.kRightDriveMotor2PDP,
	            Constants.kRightDriveMotor2PDP});
	 
	 //Electrical Systems
	 public static PowerDistributionPanel kPDP = new PowerDistributionPanel();
}
