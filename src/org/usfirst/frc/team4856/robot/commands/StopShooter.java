//package org.usfirst.frc.team4856.robot.commands;
//
//import edu.wpi.first.wpilibj.command.Command;
//
//import org.usfirst.frc.team4856.robot.Robot;
//
///**
// *
// */
//public class StopShooter extends Command {
//
//    public StopShooter() {
//        // Use requires() here to declare subsystem dependencies
//        requires(Robot.shooter);
//        setTimeout(1);
//    }
//
//    // Called just before this Command runs the first time
//    protected void initialize() {
//    	Robot.shooter.stop();
//    }
//
//    // Called repeatedly when this Command is scheduled to run
//    protected void execute() {
//    }
//
//    // Make this return true when this Command no longer needs to run execute()
//    protected boolean isFinished() {
//        return isTimedOut();
//
//    }
//
//    // Called once after isFinished returns true
//    protected void end() {
//    	Robot.shooter.stop();
//    }
//
//    // Called when another command which requires one or more of the same
//    // subsystems is scheduled to run
//    protected void interrupted() {
//    	end();
//    }
//}