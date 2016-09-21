package org.usfirst.frc.team5482.robot.subsystems;

import org.usfirst.frc.team5482.robot.Constants;
import org.usfirst.frc.team5482.robot.HardwareAdapter;
import org.usfirst.frc.team5482.robot.OI;
import org.usfirst.frc.team5482.robot.commands.PollFiringSystem;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class FiringSystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public boolean fired;

    public void initDefaultCommand() {
    	setDefaultCommand(new PollFiringSystem());
    }
    
    public void fire(){
    	if (OI.fireSafety.get()){
    		// If we get the relays then we will have to figure something else out, rn we are just going to use a victor 888
    		HardwareAdapter.kFiringValve.set(1);
    		Timer.delay(Constants.fireDelay);
    		HardwareAdapter.kFiringValve.set(0);
    		resetPressure();
    		
    	}
    }
    
    public double getPressure(){
    	return fireTankPressure(HardwareAdapter.kFireTankPressure.getVoltage());
    }
    
    private void resetPressure(){
    	fired = true;
    	log("Resetting Pressure...");
    	setPressure();
    	Timer.delay(0.01);
    	fired = false;
    }
    
    public void setPressure(){
    	if (fireTankPressure(HardwareAdapter.kFireTankPressure.getVoltage()) <= HardwareAdapter.kFiringPressure){
    		HardwareAdapter.kRegulatorValve.set(true);
    	} else {
    		HardwareAdapter.kRegulatorValve.set(false);
    	}
    }
    
    private void log(String message){
    	SmartDashboard.putString("Pneumatic Status", message);
    }
    
    private double fireTankPressure(double sensorIn){
    	double PSI;
    	PSI = 250*(sensorIn/5)-25;
		return PSI;
    	
    }
}

