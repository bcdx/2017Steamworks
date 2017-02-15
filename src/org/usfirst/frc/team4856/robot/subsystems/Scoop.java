package org.usfirst.frc.team4856.robot.subsystems;


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
	//public DigitalInput di_up; 
	//public DigitalInput di_down; 
	
//    SpeedController armMotor = new Victor(1);
  
		
	public Scoop () {
		super();                                                                                                                                                                                      
		scoopMotor = new Victor(0);
		//di_up = new DigitalInput(dio_port_1);
		//di_down = new DigitalInput(dio_port_2);
		
		
		
	
	}
	
 
	
	 public void up() {
		  scoopMotor.set(0.8);
		  System.out.println("receive gear method called");
	   }
	 
	 public void down() {
		 scoopMotor.set(-0.8);

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

