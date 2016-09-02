package org.usfirst.frc.team5482.robot;

import org.usfirst.frc.team5482.robot.HardwareAdapter;

public class RoboDrive {

	public void tankTreads(double throttle, double steering) {

		double turnVal = steering + 0.5;

		double leftPWM;
		double rightPWM;

		leftPWM = throttle;
		rightPWM = throttle;

		leftPWM = leftPWM * turnVal;
		rightPWM = rightPWM / turnVal;

		if (throttle == 0) {
			leftPWM = steering;
			rightPWM = steering;
		}

		HardwareAdapter.kLeftDriveMotor.set(-leftPWM);
		HardwareAdapter.kRightDriveMotor.set(rightPWM);
	}
}