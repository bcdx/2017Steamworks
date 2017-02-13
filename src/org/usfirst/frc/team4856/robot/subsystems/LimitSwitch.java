package org.usfirst.frc.team4856.robot.subsystems;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LimitSwitch extends Subsystem {
<<<<<<< HEAD
	public DigitalInput limitswitch;
	
	public LimitSwitch (int dio_port){
		super();
		limitswitch = new DigitalInput(dio_port);
=======
	public DigitalInput lSwitch;

	
	public LimitSwitch (int dio_port){
		super();
		lSwitch = new DigitalInput(dio_port);
		
	}
	
	public boolean getState(){
		
		return lSwitch.get();
>>>>>>> 35b95008abc37479387f9bb9920b59b7cb9b02b3
	}


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public boolean getState() {
    	return (boolean)limitswitch.get();
    }
}

