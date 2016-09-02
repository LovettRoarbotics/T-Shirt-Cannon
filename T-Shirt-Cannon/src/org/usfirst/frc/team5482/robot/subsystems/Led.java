package org.usfirst.frc.team5482.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Led extends Subsystem {
    
    public void rainBow(){
    	
    }
    
    public void pulse(double a, double b, double c, double x, double y, double z){
    	double colorA[] = {a, b, c};
    	double colorB[] = {x, y, z};
    }
    
    public void color(double a, double b, double c){
    	double colora[] = {a, b, c};
    }
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

