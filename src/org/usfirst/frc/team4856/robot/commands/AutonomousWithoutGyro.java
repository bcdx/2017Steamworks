package org.usfirst.frc.team4856.robot.commands;

import org.usfirst.frc.team4856.robot.Robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonomousWithoutGyro extends Command {
	
	CANTalon left1= new CANTalon(0);
	CANTalon left2= new CANTalon(1);
	CANTalon right1= new CANTalon(2);
	CANTalon right2= new CANTalon(3);

	Timer timer;

    public AutonomousWithoutGyro() {
    	timer = new Timer();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.reset();
    	timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (timer.get() < 7){
    		left1.set(-0.365);
    		left2.set(-0.365);
    		right1.set(0.5);
    		right2.set(0.5);
    	}
    	
    	left1.set(0.365 * 0.866);//cosine of 30 = 0.866
    	left2.set(0.365 * 0.866);
    	right1.set(0.5  * 0.5);//sine of 30 = 0.5
    	right2.set(0.5 * 0.5);
    	
    	if (timer.get() > 10) {
    		left1.set(-0.365);
    		left2.set(-0.365);
    		right1.set(0.5);
    		right2.set(0.5);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return timer.get()>15; //stops autonomous mode when timer is longer than 15 seconds
//        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.left1.set(0);
        Robot.right1.set(0);
        Robot.left2.set(0);
        Robot.right2.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
