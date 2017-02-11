package org.usfirst.frc.team4856.robot.subsystems;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LimitSwitch extends Subsystem {
	public DigitalInput lSwitch;

	
	public LimitSwitch (int dio_port){
		super();
		lSwitch = new DigitalInput(dio_port);
		
	}
	
	public boolean getState(){
		
		return lSwitch.get();
	}


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
//    public boolean getState() {
//    	return lSwitch.get();
//    }
}

