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
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.AnalogInput;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

enum grabState{
    OPEN, CLOSED, OPENING, CLOSING;
}

enum pot_val{
    OPEN (0.99),
    CLOSED (0.01);
    private final double value;

    pot_val(double value){
        this.value = value;
    }
    public double value(){ return value; }
}

/**
 *
 */
public class grabber extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Spark grabbermotor;
    private DigitalInput limit_top_1;
    private DigitalInput limit_top_2;
    private DigitalInput limit_bot_1;
    private DigitalInput limit_bot_2;
    

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Encoder grabber_encoder;
    private AnalogInput string_pot;
    private grabState state;

    public grabber() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        grabbermotor = new Spark(4);
        addChild("grabber motor",grabbermotor);
        grabbermotor.setInverted(false);
        
        limit_top_1 = new DigitalInput(0);
        addChild("limit_top_1",limit_top_1);
        
        
        limit_top_2 = new DigitalInput(1);
        addChild("limit_top_2",limit_top_2);
        
        
        limit_bot_1 = new DigitalInput(2);
        addChild("limit_bot_1",limit_bot_1);
        
        
        limit_bot_2 = new DigitalInput(3);
        addChild("limit_bot_2",limit_bot_2);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        grabber_encoder = new Encoder(4, 5);
        addChild("grabber_encoder", grabber_encoder);

        string_pot = new AnalogInput(6);
        addChild("string_pot", string_pot);

        state = grabState.OPENING;

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

}

