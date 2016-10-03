package org.usfirst.frc.team5482.robot.subsystems;

import org.usfirst.frc.team5482.robot.HardwareAdapter;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/** @deprecated Use {@link AltitudePID} instead. <p>
 * Controls the Altitude of the Cannon. <p> <strike>You should probably make the PID and slap on an encoder or a potentiometer.</strike><p>
 * Yeah I did that, so don't use this anymore.
 * 
 * @author Byron Lathi
 *
 */
public class Altitude extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void up(){
    	HardwareAdapter.kAltitudeMotor.set(0.5);
    	Timer.delay(0.1);
    	HardwareAdapter.kAltitudeMotor.set(0);
    }
    
    public static void down(){
    	HardwareAdapter.kAltitudeMotor.set(-0.5);
    	Timer.delay(0.1);
    	HardwareAdapter.kAltitudeMotor.set(0);
    }
}

