package org.usfirst.frc.team4856.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;

public class Bucket extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Servo servo;
	
	public Bucket() {
		super();
		servo = new Servo (4);
	}
	
	public void open() {
		servo.set(0.05);
// DONT CHANGE THESE ANGLES
	}
	
	public void close() {
		servo.set(0.3);
//DONT CHANGE THESE ANGLES
	}
	
	public void stop() {
		
	}

	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

