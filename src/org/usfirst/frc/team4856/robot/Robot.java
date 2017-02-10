package org.usfirst.frc.team4856.robot;
import java.io.IOException; //from newer GRIP code

//CANTalon support package
import com.ctre.CANTalon;

import edu.wpi.cscore.AxisCamera;
import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.vision.GripPipeline;

//import org.usfirst.frc.team4856.robot.commands.TankDriveWithJoysticks;

import org.usfirst.frc.team4856.robot.subsystems.Shooter;
import org.usfirst.frc.team4856.robot.subsystems.Scaler;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.usfirst.frc.team4856.robot.commands.AutonomousMode;
import org.usfirst.frc.team4856.robot.commands.AutonomousWithShoot;
//import org.usfirst.frc.team4856.robot.subsystems.Pusher;
//import org.usfirst.frc.team4856.robot.subsystems.Gyro;
import org.usfirst.frc.team4856.robot.subsystems.Scoop;

/**
 * The VM (virtual machine) is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	//NetworkTable table; // older GRIP code
	/**
	 * Declaration of variables. (e.g., chassis is an instance of DriveTrain)
	 */
	public NetworkTable table;

	public static OI oi;
	public static Shooter shooter;
//	public static Pusher pusher;
	public static Scaler scaler;
	public static Scoop scoop;
	
	public static CANTalon left1= new CANTalon(1);
	public static CANTalon left2= new CANTalon(2);
	public static CANTalon right1= new CANTalon(3);
	public static CANTalon right2= new CANTalon(4);
	
	//Thread visionThread;

	Joystick leftstick = new Joystick(0);
	Joystick rightstick = new Joystick(1);
	Joystick thirdstick = new Joystick(2);


	public static Command autonomousCommand;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    
    
    
    public void robotInit() {
//    	
//    	visionThread = new Thread(() -> {
//			// Get the Axis camera from CameraServer
//			AxisCamera camera = CameraServer.getInstance().addAxisCamera("axis-accc8e2708a3.local");
//			// Set the resolution
//			camera.setResolution(640, 480);
//
//			// Get a CvSink. This will capture Mats from the camera
//			CvSink cvSink = CameraServer.getInstance().getVideo();
//			// Setup a CvSource. This will send images back to the Dashboard
//			CvSource outputStream = CameraServer.getInstance().putVideo("Rectangle", 640, 480);
//
//			// Mats are very memory expensive. Lets reuse this Mat.
//			Mat mat = new Mat();
//			GripPipeline gp = new GripPipeline();
//
//			// This cannot be 'true'. The program will never exit if it is. This
//			// lets the robot stop this thread when restarting robot code or
//			// deploying.
//			while (!Thread.interrupted()) {
//				// Tell the CvSink to grab a frame from the camera and put it
//				// in the source mat.  If there is an error notify the output.
//				if (cvSink.grabFrame(mat) == 0) {
//					// Send the output the error.
//					outputStream.notifyError(cvSink.getError());
//					// skip the rest of the current iteration
//					continue;
//				}
//				// Put a rectangle on the image
//				Imgproc.rectangle(mat, new Point(100, 100), new Point(400, 400),
//						new Scalar(255, 255, 255), 5);
//				// Give the output stream a new image to display
//				outputStream.putFrame(mat);
//				gp.process(mat);
//				System.out.print("mat: " + mat);
//				
//			}
//		});
//		visionThread.setDaemon(true);
//		visionThread.start();
    	
		
	//	shooter = new Shooter();
//		pusher = new Pusher();
		//scaler = new Scaler();
		scoop = new Scoop();
		scaler = new Scaler();
		
		
		oi = new OI();
		autonomousCommand = new AutonomousMode(); 
        left2.changeControlMode(CANTalon.TalonControlMode.Follower);
        right2.changeControlMode(CANTalon.TalonControlMode.Follower);

		//		double[] defaultValue = new double[0];
//////		while (true) {
//////			
//		System.out.println("starting robotInit");
//			double[] widths = table.getNumberArray("width", defaultValue);
//			System.out.println("width table created" + widths.length);
//			for (double width : widths) {
//				System.out.println("width: "+ width);
//			}
////				double distance = -0.000002*width*width*width*width+0.000277*width*width*width-0.011785*width*width-0.019093*width+10.0866;
////				//converting from pixels to meters
////				angle = 0.052*distance*distance*distance*distance-1.03*distance*distance*distance+8.49*distance*distance-37.29*distance+93.64;
//////				//find angle from distance (using regression if v0 = 30)
////				System.out.println("width: "+ width);
////				System.out.println("distance: "+ distance);
////				System.out.println("angle: "+ angle);
////////			}
//////			
//////			Timer.delay(1);
////		} //END of older GRIP code
}
			
		
		
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    /**
     * This function is called periodically during autonomous
     */
	

    public void autonomousInit() {
        // schedule the autonomous command (example)
    	//if (the autonomousCommand does not return a null set (is not teleop), then run the autonomousCommand
    	 
    	 autonomousCommand.start();
    	 
    }

    @Override //newer GRIP code
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        
        /*
    //START of newer GRIP code:
        // Get published values from GRIP using NetworkTables
        double angle = 0;
        for (double width : grip.getNumberArray("targets/width", new double[0])) {
        	double distance = -0.000002*width*width*width*width+0.000277*width*width*width-0.011785*width*width-0.019093*width+10.0866;
			//converting from pixels to meters
        	
			angle = 0.052*distance*distance*distance*distance-1.03*distance*distance*distance+8.49*distance*distance-37.29*distance+93.64;
			//find angle from distance (using regression if v0 = 30)
			
			System.out.println("Got contour with width=" + width);
			System.out.print(angle);
			
		} //END of newer GRIP code
		*/
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
       autonomousCommand.cancel();

    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        double leftAxis = leftstick.getY();
        left1.set(1*leftAxis);
        left2.changeControlMode(CANTalon.TalonControlMode.Follower);
        left2.set(left1.getDeviceID());
        double rightAxis = rightstick.getY();
        right1.set(-1*rightAxis);
        right2.changeControlMode(CANTalon.TalonControlMode.Follower);
        right2.set(right1.getDeviceID());
    	
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}

