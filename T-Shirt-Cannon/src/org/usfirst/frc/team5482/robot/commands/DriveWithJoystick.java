package org.usfirst.frc.team5482.robot.commands;

import org.usfirst.frc.team5482.robot.Constants;
import org.usfirst.frc.team5482.robot.OI;
import org.usfirst.frc.team5482.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveWithJoystick extends Command {
	
	DriveTrain drivetrain = new DriveTrain();

    public DriveWithJoystick() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	log("Initializing Joystick Drive");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	log("Driving with Arcade Drive");
    	DriveTrain.arcadeDrive(OI.mainStick.getRawAxis(Constants.kThrottleAxis), OI.mainStick.getRawAxis(Constants.kSteeringAxis));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
    private void log(String message){
    	SmartDashboard.putString("Drive Status", message);
    }
}
