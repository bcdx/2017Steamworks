package org.usfirst.frc.team4856.robot.commands;

import org.usfirst.frc.team4856.robot.Robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

import edu.wpi.first.wpilibj.command.Subsystem;
//
///**
// *
// */
public class AutonomousWithoutGyro extends CommandGroup {
	
	CANTalon left1= new CANTalon(3);
	CANTalon left2= new CANTalon(4);
	CANTalon right1= new CANTalon(1);
	CANTalon right2= new CANTalon(2);

	Timer timer;
	Servo servo;
//
    public AutonomousWithoutGyro() {
    	timer = new Timer();
        // Use requires() here to declare subsystem dependencies; eg. requires(chassis);
    }

//    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.reset();
    	timer.start();
    }
//
//    // Called repeatedly when this Command is scheduled to run
    protected void execute() {	
    	new CloseServo(); //to keep the servo open during autonomous mode at all times
    	
    	while(timer.get() < 1.5){ //move forward
    		left1.set(0.5);
    		left2.set(0.5);
    		right1.set(-0.5);
    		right2.set(-0.5);
    	}
    	
    	while(timer.get() > 1.5 && timer.get() < 1.80){ //move forward
    		left1.set(-0.5);
    		left2.set(-0.5);
    		right1.set(-0.5);
    		right2.set(-0.5);
    	}
    	
    	while(timer.get() > 1.80 && timer.get() < 3){ //move forward
    		left1.set(0.2);
    		left2.set(0.2);
    		right1.set(-0.2);
    		right2.set(-0.2);
    	}
    	
    		left1.set(0);
    		left2.set(0); //.365
    		right1.set(0);
    		right2.set(0);
    	
    	//Timer.delay(2);
    	
//    	if(timer.get() > 3 && timer.get() < 5){ //turn
//    		left1.set(0.365);
//    		left2.set(0.365);
//    		right1.set(0.5);
//    		right2.set(0.5);
//    	}
//    	
//    	if(timer.get() > 5 && timer.get() < 7){ //move forward
//    		left1.set(-0.365);
//    		left2.set(-0.365);
//    		right1.set(0.5);
//    		right2.set(0.5);
//    	}
    	
    	/*
    	 
    	 new OpenServo(); 
    	 
    	 */
    	
    }
//
//    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return timer.get()>15; //stops autonomous mode when timer is longer than 15 seconds
    	// return false;
    }
//
//    // Called once after isFinished returns true
    protected void end() {
    	Robot.left1.set(0);
        Robot.right1.set(0);
        Robot.left2.set(0);
        Robot.right2.set(0);
    }
//
//    // Called when another command which requires one or more of the same subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
//
}
//*/