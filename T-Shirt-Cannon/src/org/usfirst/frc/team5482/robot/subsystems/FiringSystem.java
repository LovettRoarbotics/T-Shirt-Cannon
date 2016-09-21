package org.usfirst.frc.team5482.robot.subsystems;

import org.usfirst.frc.team5482.robot.commands.PollFiringSystem;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FiringSystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	setDefaultCommand(new PollFiringSystem());
    }
    
    public void fire(){
    	
    }
    
    public void getPressure(){
    	
    }
    
    private void log(String message){
    	
    }
}

