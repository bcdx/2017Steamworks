package org.usfirst.frc.team4856.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;



/**
 *
 */
public class Scoop extends Subsystem {
	private SpeedController scoopMotor;
		
	public Scoop () {
		super();                                                                                                                                                                                      
		scoopMotor = new Victor(3);
		System.out.println("made victor scoopmotor");
	}
	
	 public void up() {
		  scoopMotor.set(0.8);
	   }
	 
	 public void down() {
		 scoopMotor.set(-0.8);
		 System.out.println("set motor to -0.5");

	 }
	 public void stop() {
		 scoopMotor.set(0);
	 }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

