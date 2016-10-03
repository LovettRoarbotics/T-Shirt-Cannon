package org.usfirst.frc.team5482.robot.subsystems;

import org.usfirst.frc.team5482.robot.Constants;
import org.usfirst.frc.team5482.robot.Robot;
import org.usfirst.frc.team5482.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Controls the DriveTrain.
 * 
 * @author Byron Lathi
 */
public class DriveTrain extends Subsystem {

	RobotDrive robotDrive = new RobotDrive(0, 1);

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoystick());
	}

	public void arcadeDrive(GenericHID stick) {
		double moveValue = stick.getRawAxis(Constants.throttleAxis) * Constants.maxSpeed;
		double rotateValue = stick.getRawAxis(Constants.rotateAxis);
		robotDrive.arcadeDrive(moveValue, rotateValue);
		if (moveValue > 0){
			log("FORWARDS");
		} else if (moveValue < 0){
			log("REVERSE");
		} else if (moveValue == 0){
			log("STOPPED");
		}
	}
	
	private void log(String message){
		Robot.log("DriveTrain Status", message);
	}

}
