package org.usfirst.frc.team5482.robot;

import org.usfirst.frc.team5482.robot.commands.FireCannon;
import org.usfirst.frc.team5482.robot.commands.LowerAltitude;
import org.usfirst.frc.team5482.robot.commands.LowerPressure;
import org.usfirst.frc.team5482.robot.commands.RaiseAltitude;
import org.usfirst.frc.team5482.robot.commands.RaisePressure;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public static Joystick mainStick = HardwareAdapter.kMainStick;
	public static Button fireTrigger = new JoystickButton(mainStick, Constants.kTrigger);
	public static Button fireSafety = new JoystickButton(mainStick, Constants.kSafety);
	public static Button raisePressure = new JoystickButton(mainStick, Constants.kPressureUp);
	public static Button lowerPressure = new JoystickButton(mainStick, Constants.kPressureDown);
	public static Button raiseAltitude = new JoystickButton(mainStick, Constants.kAltitudeUp);
	public static Button lowerAltitude = new JoystickButton(mainStick, Constants.kAltitudeDown);

	public OI() {
		fireTrigger.whenPressed(new FireCannon());
		raisePressure.whileHeld(new RaisePressure());
		lowerPressure.whileHeld(new LowerPressure());
		raiseAltitude.whileHeld(new RaiseAltitude());
		lowerAltitude.whileHeld(new LowerAltitude());
	}

}
