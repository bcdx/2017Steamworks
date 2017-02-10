package org.usfirst.frc.team4856.robot.commands;
import org.usfirst.frc.team4856.robot.Robot;

//CAN Talon support package
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;

/**
 *
 */
public class AutonomousMode extends CommandGroup {

	
	CANTalon left1= new CANTalon(0);
	CANTalon left2= new CANTalon(1);
	CANTalon right1= new CANTalon(2);
	CANTalon right2= new CANTalon(3);

	Timer timer;
	//AnalogGyro gyro;
	
	
    public AutonomousMode() {
    	timer = new Timer();
<<<<<<< HEAD
//    	gyro = new AnalogGyro(1);
=======
    	//gyro = new AnalogGyro(1);
>>>>>>> 7591b2b6c7be9f9be5c0cf1d103052d2cb4814af
    	

//    	requires(Robot.shooter);
//    	requires(Robot.pusher);
        // Use requires() here to declare subsystem dependencies
//    	 Scheduler.getInstance().run();
         //drives forward for certain amount of time
//    	 long t= System.currentTimeMillis();
//    	 long end = t+5000;
//    	 while(System.currentTimeMillis() < end){
//    		 left1.set(0.45);
//             left2.changeControlMode(CANTalon.TalonControlMode.Follower);
//             left2.set(left1.getDeviceID());
//             right1.set(-0.5);
//             right2.changeControlMode(CANTalon.TalonControlMode.Follower);
//             right2.set(right1.getDeviceID()); 
//    	 	}   
             
//             left1.setSafetyEnabled(true); //hopefully will stop motors after 3 sec 2/26 AT
//             right1.setSafetyEnabled(true);
//             left1.setExpiration(3.0);
//             left1.set(0);
//             right1.setExpiration(3.0);
//             right1.set(0);
             
//             Robot.shooter.shoot();
//         	Timer.delay(3);
//         	Robot.pusher.push();
//         	Timer.delay(2);
//         	Robot.shooter.stop();
//         	Robot.pusher.stop();
           

}
    	 
    	 
    

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.reset();
    	timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    /*	if (timer.get()<7){
    		Robot.left1.set(0.99);
    		//Robot.right1.set(-0.99);
    	}
    	else {
    		Robot.shooter.shoot();
        	Timer.delay(3);
        	Robot.pusher.push();
        	Timer.delay(2);
        	Robot.shooter.stop();
        	Robot.pusher.stop();
        	end();
    	}*/    	
<<<<<<< HEAD
    	if (timer.get() < 7){
    		left1.set(0.365);
    		left2.set(0.365);
    		right1.set(0.5);
    		right2.set(0.5);
    	}
    	else {
    		left1.set(0.365 * 0.866);//cosine of 30 = 0.866
    		left2.set(0.365 * 0.866);
    		right1.set(0.5  * 0.5);//sine of 30 = 0.5
    		right2.set(0.5 * 0.5);
    	}
//    	while (timer.get() > 7){
=======

//    	while (timer.get() > 1){
>>>>>>> 7591b2b6c7be9f9be5c0cf1d103052d2cb4814af
//    		System.out.println(gyro.getAngle());
//    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return timer.get()>0.1;
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
