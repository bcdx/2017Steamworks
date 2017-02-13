package org.usfirst.frc.team4856.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;

public class Bucket extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Servo servo;
	
	public Bucket(int servo_port) {
		super();
		servo = new Servo(servo_port);
	}
	
	public void open() {
		servo.set(1.0);
	}
	
	public void close() {
		servo.set(0.5);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

