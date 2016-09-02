package org.usfirst.frc.team5482.robot.subsystems;

import org.usfirst.frc.team5482.robot.HardwareAdapter;
import org.usfirst.frc.team5482.robot.commands.LedColor;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Led extends Subsystem {

	public byte rgb[] = new byte[3];

	public void setColor(byte a, byte b, byte c) {
		byte color[] = { a, b, c };
		rgb = color;
		HardwareAdapter.kI2C.transaction(color, 3, null, 0);
		Timer.delay(0.1);
	}

	public byte[] getColor() {
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
