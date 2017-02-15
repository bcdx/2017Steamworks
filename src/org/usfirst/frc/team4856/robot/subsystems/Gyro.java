package org.usfirst.frc.team4856.robot.subsystems;


import com.ctre.CANTalon;
import java.math.*;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
//
///**
// *
// */
public class Gyro extends Subsystem {
//	public static CANTalon left1= new CANTalon(1);
//	public static CANTalon left2= new CANTalon(2);
//	public static CANTalon right1= new CANTalon(3);
//	public static CANTalon right2= new CANTalon(4);
//	public RobotDrive myRobot = new RobotDrive(1, 2, 3, 4);
//	private AnalogGyro gyro;
//	private static final double kVoltsPerDegreePerSecond = 0.0128;
	Timer timer;
/*     Put methods for controlling this subsystem
     here. Call these from Commands.*/
	
	public Gyro(int AnalogPort){
//		gyro = new AnalogGyro(AnalogPort);
//		gyro.setSensitivity(kVoltsPerDegreePerSecond);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }
    
    public void turn(int degrees) {
//    	gyro.reset();
//    	double turningValue = degrees * 0.005; //0.005 is proportional turning constant.
//    	while (gyro.getAngle() < 30) {
//        	myRobot.drive(0, Math.pow(Math.E, 1/0.9));
//    	}
//    	Timer.delay(0.004);
    }
}
