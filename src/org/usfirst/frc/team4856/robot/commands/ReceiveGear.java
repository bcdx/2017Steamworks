package org.usfirst.frc.team4856.robot.commands;

import org.usfirst.frc.team4856.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ReceiveGear extends Command {
	
    public ReceiveGear() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.scoop);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	//Robot.scoop.initializeCounter();
    	Robot.scoop.up();
    	System.out.println("receive gear command called");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

//    // Make this return true when this Command no longer needs to run execute()
//    protected boolean isFinished() {
//    	return Robot.scoop.isSwitch1Set() == true && Robot.scoop.isSwitch2Set() == true;
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
}
