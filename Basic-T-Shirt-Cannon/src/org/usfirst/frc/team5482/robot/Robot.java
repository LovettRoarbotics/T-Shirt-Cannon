
package org.usfirst.frc.team5482.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	// public static final ExampleSubsystem exampleSubsystem = new exampleSubsystem();
	public static OI oi;

	Command autonomousCommand;
	SendableChooser chooser;

	public void robotInit() {
		log("Robot Initialized");
	}

	public void disabledInit() {

	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {

	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	public void testPeriodic() {
		LiveWindow.run();
	}
	
	public static void log(String system, String message){
		SmartDashboard.putString(system, message);
	}
	
	private void log(String message){
		Robot.log("Robot Status", message);
	}
}
