package org.usfirst.frc.team5482.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	Joystick mainStick = new Joystick(RobotMap.mainStickPort);
    Button fire = new JoystickButton(mainStick, RobotMap.fire);
    Button safety = new JoystickButton(mainStick, RobotMap.safety);
	
}

