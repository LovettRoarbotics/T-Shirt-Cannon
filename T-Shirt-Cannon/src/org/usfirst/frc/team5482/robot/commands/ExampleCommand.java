
package org.usfirst.frc.team5482.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5482.robot.HardwareAdapter;
import org.usfirst.frc.team5482.robot.Robot;

/**
 *
 */
public class ExampleCommand extends Command {

    public ExampleCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.exampleSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	HardwareAdapter.kLeftDriveMotor.set(-1);
		HardwareAdapter.kRightDriveMotor.set(1);
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
}
