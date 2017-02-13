package org.usfirst.frc.team4856.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4856.robot.Robot;
import org.usfirst.frc.team4856.robot.subsystems.*;


/**
 *
 */
public class PlaceGear extends Command {

<<<<<<< HEAD
    public PlaceGear() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.scoop);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    //	Robot.scoop.initializeCounter();
    	Robot.scoop.down();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
//    protected boolean isFinished() {
//   //	return Robot.scoop.isSwitch1Set() == false && Robot.scoop.isSwitch2Set() == false;
//    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.scoop.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    	end();

    }

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
=======
	 public PlaceGear() {
	        // Use requires() here to declare subsystem dependencies
	        requires(Robot.scoop);
	    }

	    // Called just before this Command runs the first time
	    protected void initialize() {
	    	Robot.scoop.down();
	    }

	    // Called repeatedly when this Command is scheduled to run
	    protected void execute() {
	    }

	    // Make this return true when this Command no longer needs to run execute()
	    protected boolean isFinished() {
	    	return Robot.scoop.LS_down.getState();
	    }

	    // Called once after isFinished returns true
	    protected void end() {
	    	Robot.scoop.stop();
	    	
	    }

	    // Called when another command which requires one or more of the same
	    // subsystems is scheduled to run
	    protected void interrupted() {
	    	end();

	    }

>>>>>>> 35b95008abc37479387f9bb9920b59b7cb9b02b3
}
