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


import org.usfirst.frc7196.kenjis_mower.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.Timer;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 */
public class BallConveyer extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Spark conveyerMotor;
    private AnalogInput ballDetector;
    private Timer timeout;

    public BallConveyer() {
        conveyerMotor = new Spark(0);
        addChild("conveyerMotor",conveyerMotor);
        conveyerMotor.setInverted(false);

        ballDetector = new AnalogInput(7);
    }

    @Override
    public void initDefaultCommand() {

        // setDefaultCommand(new ConveyerCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void intakeBall(){
        //TODO: Determine ideal speed to run conveyer motor at
        conveyerMotor.set(-0.5);
        // if (ballDetector.getValue() > 3){
        //     timeout.start();
        //     while((ballDetector.getValue() > 3) && timeout.get() < 0.75){
        //         //TODO: Work on robot to determine actual threshold value
        //     }
        //     conveyerMotor.set(0);
        //     timeout.reset();
        // }

        // boolean ballOnSensor = ballDetector.getValue() > 3;
        // conveyerMotor.set(0.5);
        // if(ballOnSensor){}
    }

    public void doNotRun() {
        conveyerMotor.set(0);
    }

    public void reverseBall(){
        conveyerMotor.set(0.5);
    }
}
