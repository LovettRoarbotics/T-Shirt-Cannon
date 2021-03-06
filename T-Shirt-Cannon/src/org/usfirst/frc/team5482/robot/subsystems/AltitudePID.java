package org.usfirst.frc.team5482.robot.subsystems;

import org.usfirst.frc.team5482.robot.Constants;
import org.usfirst.frc.team5482.robot.HardwareAdapter;
import org.usfirst.frc.team5482.robot.utilities.SystemManager;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 * This is the updated <strong>PID</strong> version of the class previously known as Altitude.
 * @author Byron Lathi
 */
public class AltitudePID extends PIDSubsystem {

	SystemManager altitudeSystemManager = new SystemManager("Altitude");
	
	public static double setpoint;

	public AltitudePID() {
		super("Altitude", 1, 1, 1);
	}
	
	public void setDegrees(double degrees){
		setpoint = (Constants.kAltitudeEncoderPPR / 360) * degrees;
	}

	public void set() {
		setSetpoint(setpoint);
	}

	public void initDefaultCommand() {

	}

	protected double returnPIDInput() {
		return HardwareAdapter.kAltitudeEncoder.getDistance();
	}

	protected void usePIDOutput(double output) {
		// Use output to drive your system, like a motor
		// e.g. yourMotor.set(output);
		HardwareAdapter.kAltitudeMotor.set(output);
	}

	public void init() {
		enable();
		HardwareAdapter.kAltitudeEncoder.reset();
	}
	
	public double error(){
		return Math.abs(getSetpoint()-getPosition());
	}
}
