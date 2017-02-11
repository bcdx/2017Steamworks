package org.usfirst.frc.team4856.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gyro extends Subsystem {
	public static CANTalon left1= new CANTalon(1);
	public static CANTalon left2= new CANTalon(2);
	public static CANTalon right1= new CANTalon(3);
	public static CANTalon right2= new CANTalon(4);
	private AnalogGyro gyro;
	private static final double kVoltsPerDegreePerSecond = 0.0128;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public Gyro(int AnalogPort){
		gyro = new AnalogGyro(AnalogPort);
		gyro.setSensitivity(kVoltsPerDegreePerSecond);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    
    public void turn30Degrees() {
    	gyro.reset();
    	while (gyro.getAngle() < 30) {
    		double turningValue = 30 * 0.005; //0.005 is proportional turning constant.
    		myRobot.
    	}
    }
}

