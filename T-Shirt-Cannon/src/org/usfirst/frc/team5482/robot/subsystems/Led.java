package org.usfirst.frc.team5482.robot.subsystems;

import org.usfirst.frc.team5482.robot.HardwareAdapter;
import org.usfirst.frc.team5482.robot.commands.LedColor;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Led extends Subsystem {

	public int rgb[] = new int[3];
	
	void sendData(int[] color){
		
		for (int i = 0; i < color.length; i++){
			
		}
		
		byte rBits[] = {};
		byte gBits[] = {};
		byte bBits[] = {};
		HardwareAdapter.kLedI2C.transaction(rBits, 4, null, 0);
		HardwareAdapter.kLedI2C.transaction(gBits, 4, null, 0);
		HardwareAdapter.kLedI2C.transaction(bBits, 4, null, 0);
		
	}

	public void setColor(int a, int b, int c) {
		int color[] = { a, b, c };
		rgb = color;
		sendData(color);
		Timer.delay(0.1);
	}

	public int[] getColor() {
		return rgb;
	}
	
	public void testLed(){
		byte a, b, c;
		a = 127;
		b = 127;
		c = 127;
		setColor(a, b, c);
		a = 0;
		b = 127;
		c = 127;
		setColor(a, b, c);
		a = 127;
		b = 0;
		c = 127;
		setColor(a, b, c);
		a = 127;
		b = 127;
		c = 0;
		setColor(a, b, c);
		a = 127;
		b = 127;
		c = 127;
		setColor(a, b, c);
		a = 127;
		b = 0;
		c = 0;
		setColor(a, b, c);
		a = 0;
		b = 127;
		c = 0;
		setColor(a, b, c);
		a = 0;
		b = 0;
		c = 127;
		setColor(a, b, c);
		a = 0;
		b = 0;
		c = 0;
		setColor(a, b, c);
		a = 127;
		b = 127;
		c = 127;
		setColor(a, b, c);
		
	}

	public void initDefaultCommand() {
		setDefaultCommand(new LedColor());
	}
}
