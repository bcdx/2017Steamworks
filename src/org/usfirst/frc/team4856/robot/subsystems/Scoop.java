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


public class Scoop extends Subsystem {
	private SpeedController scoopMotor;
	public LimitSwitch LS_up; 
	public LimitSwitch LS_down; 
	
//    SpeedController armMotor = new Victor(1);
  
		
	public Scoop (int pwm_port, int dio_port_1, int dio_port_2) {
		super();                                                                                                                                                                                      
		scoopMotor = new Victor(pwm_port);
		LS_up = new LimitSwitch(dio_port_1);
		LS_down = new LimitSwitch(dio_port_2);
	}
	
//	 public boolean isSwitch1Set() {
//		 return counter1.get() > 0;
//	 }
//	 
//	 public boolean isSwitch2Set() {
//		 return counter2.get() > 0;
//	 }
//
//	 public void initializeCounter() {
//	        counter1.reset();
//	        counter2.reset();
//	 } //for limit switch 2.10.17 
	
	 public void up() {
		  scoopMotor.set(0.4);
		  System.out.println("receive gear method called");
	   }
	 
	 public void down() {
		 scoopMotor.set(-0.4);

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

