package org.usfirst.frc.team4856.robot.subsystems;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;



/**
 *
 */
public class Scoop extends Subsystem {
	private SpeedController scoopMotor;
	
	DigitalInput limitSwitch = new DigitalInput(1);
    //SpeedController armMotor = new Victor(1);
    Counter counter = new Counter(limitSwitch);
		
	public Scoop (int pwm_port) {
		super();                                                                                                                                                                                      
		scoopMotor = new Victor(pwm_port);
	}
	
	 public boolean isSwitchSet() {
	        return counter.get() > 0;
	 }

	 public void initializeCounter() {
	        counter.reset();
	 } //for limit switch 2.10.17 
	
	 public void up() {
		  scoopMotor.set(0.9);
	   }
	 
	 public void down() {
		 scoopMotor.set(-0.9);

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

