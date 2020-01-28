// package org.usfirst.frc7196.kenjis_mower.subsystems;

// import org.usfirst.frc7196.kenjis_mower.Robot;
// import org.usfirst.frc7196.kenjis_mower.commands.*;
// import edu.wpi.first.wpilibj.livewindow.LiveWindow;
// import edu.wpi.first.wpilibj.command.Subsystem;
// import edu.wpi.first.wpilibj.DigitalOutput;
// import edu.wpi.first.wpilibj.PIDOutput;
// import edu.wpi.first.wpilibj.PIDSource;
// import edu.wpi.first.wpilibj.Spark;
// import edu.wpi.first.wpilibj.SpeedController;
// import edu.wpi.first.wpilibj.SpeedControllerGroup;
// import edu.wpi.first.wpilibj.drive.DifferentialDrive;
// import java.util.LinkedList;
// import java.util.Queue;
// import edu.wpi.first.wpilibj.TimedRobot;
// import edu.wpi.first.wpilibj.I2C;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.first.wpilibj.util.Color;


// public class ColorWheel extends Subsystem {
//     private final I2C.Port i2cPort = I2C.Port.kOnboard;
//     private final ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);


    
//     public void getSensorInfo(){
//         Color detectedColor = m_colorSensor.getColor();
//         double IR = m_colorSensor.getIR();
//         int proximity = m_colorSensor.getProximity();
//     }
// }