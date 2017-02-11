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
	
	DigitalInput limitswitch1;
	DigitalInput limitswitch2;
//    SpeedController armMotor = new Victor(1);
    Counter counter1;
    Counter counter2;
		
	public Scoop (int pwm_port,int dio_port1,int dio_port2) {
		super();                                                                                                                                                                                      
		scoopMotor = new Victor(pwm_port);
		limitswitch1 = new DigitalInput(dio_port1);
		limitswitch2 = new DigitalInput(dio_port2);
		counter1 = new Counter(limitswitch1);
		counter2 = new Counter(limitswitch2);
		
	}
	
	 public boolean isSwitch1Set() {
		 return counter1.get() > 0;
	 }
	 
	 public boolean isSwitch2Set() {
		 return counter2.get() > 0;
	 }

	 public void initializeCounter() {
	        counter1.reset();
	        counter2.reset();
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

