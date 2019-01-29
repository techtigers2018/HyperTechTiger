// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc7196.kenjis_mower.subsystems;


import org.usfirst.frc7196.kenjis_mower.Robot;
import org.usfirst.frc7196.kenjis_mower.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Drive extends Subsystem {
    enum RobotDirection 
    { 
        FORWARD, BACKWARD; 
    }
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Spark rightFront;
    private Spark rightRear;
    private SpeedControllerGroup rightMotors;
    private Spark leftFront;
    private Spark leftRear;
    private SpeedControllerGroup leftMotors;
    private DifferentialDrive diffDrive;
    private RobotDirection direction;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public Drive() {
        
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        rightFront = new Spark(0);
        addChild("rightFront",rightFront);
        rightFront.setInverted(false);
        
        rightRear = new Spark(1);
        addChild("rightRear",rightRear);
        rightRear.setInverted(false);
        
        rightMotors = new SpeedControllerGroup(rightFront, rightRear  );
        addChild("rightMotors",rightMotors);
        
        
        leftFront = new Spark(2);
        addChild("leftFront",leftFront);
        leftFront.setInverted(false);
        
        leftRear = new Spark(3);
        addChild("leftRear",leftRear);
        leftRear.setInverted(false);
        
        leftMotors = new SpeedControllerGroup(leftFront, leftRear  );
        addChild("leftMotors",leftMotors);
        
        
        diffDrive = new DifferentialDrive(rightMotors, rightFront);
        addChild("diffDrive",diffDrive);
        diffDrive.setSafetyEnabled(true);
        diffDrive.setExpiration(0.1);
        diffDrive.setMaxOutput(1.0);

        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        direction = RobotDirection.FORWARD;
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void setSpeed(double speed, double turn/*, double speedPercent, double turnPercent*/)
    {
        int i = 1;
        if (Robot.drive.direction != RobotDirection.FORWARD)  i = -1;
        diffDrive.arcadeDrive(speed*i, turn*i);
    }
}

