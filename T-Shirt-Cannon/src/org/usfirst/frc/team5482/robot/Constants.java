package org.usfirst.frc.team5482.robot;

/**
 * Contains the basic constants that are used by the robot. <p>
 * based on <a href="https://github.com/Team254/FRC-2015/blob/master/src/com/team254/frc2015/Constants.java">Constants.java</a> by Team 254.	 
 * @author Byron Lathi based on Team 254
 */

// Yes i know all of this stuff should be in robotmap but i'm to lazy to change all of it. If anybody else wants to then feel free.

public class Constants {
	
	// CONSTANTS
	public static double fireDelay = 0.1;
	
	// JOYSTICKS
	public static int kThrottleAxis = 2;
	public static int kSteeringAxis = 3;
	
	public static int kTrigger = 1;
	public static int kSafety = 2;
	public static int kPressureUp = 3;
	public static int kPressureDown = 4;
	public static int kAltitudeUp = 5;
	public static int kAltitudeDown = 6;
	
	// MOTORS
	public static int kLeftDriveMotorPWM = 0;
    public static int kLeftDriveMotor1PDP = 0;
    public static int kLeftDriveMotor2PDP = 1;

    public static int kRightDriveMotorPWM = 1;
    public static int kRightDriveMotor1PDP = 2;
    public static int kRightDriveMotor2PDP = 3;
    
    public static int kAltitudeMotorPWM = 2;
    public static int kAltitudeMotor1PDP = 4;
    
    public static int kRegulatorValvePort = 1;
    public static int kFiringValvePort = 3;
    
    public static int kPressureSensor = 1;
}
