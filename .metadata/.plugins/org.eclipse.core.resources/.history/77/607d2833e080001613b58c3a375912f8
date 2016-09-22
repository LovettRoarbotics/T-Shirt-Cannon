package org.usfirst.frc.team5482.robot.subsystems;

import org.usfirst.frc.team5482.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoystick());
    }
    
    /** Drives with one joystick
     * @author Byron Lathi
     * @param throttle
     * @param steering
     */
    public static void arcadeDrive(double throttle, double steering) {

		double turnVal = steering - 0.5;

		double leftPWM;
		double rightPWM;

		leftPWM = throttle;
		rightPWM = throttle;

		leftPWM = leftPWM + turnVal;
		rightPWM = rightPWM - turnVal;

		if (throttle == 0) {
			leftPWM = steering;
			rightPWM = steering;
		}
	}
}

