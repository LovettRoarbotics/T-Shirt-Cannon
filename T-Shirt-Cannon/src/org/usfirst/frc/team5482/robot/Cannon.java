package org.usfirst.frc.team5482.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Cannon {

	Joystick joystick = HardwareAdapter.kMainStick;

	public void altitudeControl(int pov) {

		double altitudePWM = 0.5;

		if (pov != -1) {
			altitudePWM = ((((pov / -180) + 1) - 0.5) / 2) + 0.5;
		}

		HardwareAdapter.kAltitudeMotor.set(altitudePWM);
	}

	public void update(boolean trigger, boolean safety) {
		if (safety) {
			SmartDashboard.putString("Cannon Status: ", "Armed!");
			if (trigger) {
				SmartDashboard.putString("Cannon Status: ", "Firing...");
			}
		} else {
			SmartDashboard.putString("Cannon Status: ", "Safe.");
		}
	}

	void fireCannon() {

	}
}
