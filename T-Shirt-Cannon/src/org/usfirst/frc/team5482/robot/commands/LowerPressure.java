package org.usfirst.frc.team5482.robot.commands;

import org.usfirst.frc.team5482.robot.HardwareAdapter;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LowerPressure extends Command {

    public LowerPressure() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	HardwareAdapter.kFiringPressure--;
    	Timer.delay(0.1);
    	SmartDashboard.putNumber("Firing Pressure", HardwareAdapter.kFiringPressure);
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
