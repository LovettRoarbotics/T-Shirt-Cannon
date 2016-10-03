package org.usfirst.frc.team5482.robot.utilities;

/**
 * The System Manager class is used to assign and read the status of any system
 * which implements it. It can be usefull for automatically turning off systems
 * once they reach a state of error, or it can be used to warn the driver about
 * systems starting to fail.
 * 
 * @author Byron Lathi
 */
public class SystemManager {
	/**
	 * These are the 4 states that SystemManager implements. Feel free to add
	 * more if you desire.
	 * 
	 * @author Byron Lathi
	 *
	 */
	public enum RobotStatus {
		OK, WARNING, ERROR, FATAL
	}

	/**
	 * This is the status that is used by the program.
	 */
	private RobotStatus status;

	/**
	 * The name of the system (not used).
	 */
	String systemName;

	/**
	 * Creates an object of SystemManager with the name of systemName
	 * 
	 * @author Byron Lathi
	 * @param systemName
	 *            The name that you want the system to be called. (not used)
	 */
	public SystemManager(String systemName) {
		this.systemName = systemName;
	}

	/**
	 * Gets the current status of the robot.
	 * 
	 * @author Byron Lathi
	 * @return The enumerated status of the system
	 */
	public RobotStatus getStatus() {
		return status;
	}

	/**
	 * Sets the current status of the robot.
	 * 
	 * @author Byron Lathi
	 * @param status
	 *            the enumerated status of the system
	 */
	public void setStatus(RobotStatus status) {
		this.status = status;
	}

	/**
	 * Returns the current status of the robot in string form. This may be more
	 * useful than an enumerated value for putting data on the SmartDashboard,
	 * for example.
	 * 
	 * @return the status of the system in string form.
	 */
	public String toString() {
		switch (status) {
		case OK:
			return "OK";
		case WARNING:
			return "WARNING";
		case ERROR:
			return "ERROR";
		case FATAL:
			return "FATAL";
		}
		return "Operation Failed! Check your inputs.";
	}

}
