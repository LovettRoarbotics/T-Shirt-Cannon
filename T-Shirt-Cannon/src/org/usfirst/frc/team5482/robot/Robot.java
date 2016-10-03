
package org.usfirst.frc.team5482.robot;

import org.usfirst.frc.team5482.robot.utilities.SystemManager;
import org.usfirst.frc.team5482.robot.utilities.SystemManager.RobotStatus;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	public SystemManager mainSystemsManager = new SystemManager("Main");

	public static OI oi;

	public void robotInit() {
		oi = new OI();
		mainSystemsManager.setStatus(RobotStatus.OK);
	}
	public void disabledInit() {

	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousInit() {
	}

	public void autonomousPeriodic() {
	}

	public void teleopInit() {
	}
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		log(mainSystemsManager.toString());
	}

	public void testPeriodic() {
		LiveWindow.run();
	}

	private void log(String message) {
		log("Robot Status", message);
	}

	private void log(String key, String message) {
		SmartDashboard.putString(key, message);
	}
}
