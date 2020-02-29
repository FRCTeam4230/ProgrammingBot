package org.team4230.robot2019;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.team4230.robot2019.commands.AutonomousCommand;
import org.team4230.robot2019.commands.intake.IntakeWheel;
import org.team4230.robot2019.commands.intake.StopIntake;
import org.team4230.lib.utils.AnalogAxis;
import org.team4230.lib.utils.ControllerMap;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    // Declares the joystick objects
    public Joystick driverController;
    //public Joystick operatorController;

    public OI() {
        // Initialize the objects Joystick(R and L)
        driverController = new Joystick(0);
        //operatorController = new Joystick(1);
        // Set the channels on the Joysticks
        driverController.setXChannel(ControllerMap.analog.RY);
        driverController.setYChannel(ControllerMap.analog.RX);

        /* operatorController.setXChannel(ControllerMap.analog.LY);
        operatorController.setYChannel(ControllerMap.analog.LX); */

        bindDefButtons();

        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
    }


    /**
     * Bind the default buttons on both controllers
     */
    private void bindDefButtons() {

        Button spinIn = new JoystickButton(driverController, 5);
        spinIn.whenPressed(new IntakeWheel());
        spinIn.whenReleased(new StopIntake());

        // climber button mappings
        /* Button lowerB = new JoystickButton(operatorController, ControllerMap.buttons.Y);
        Button raiseB = new JoystickButton(operatorController, ControllerMap.buttons.X);
        Button raiseFrontB = new JoystickButton(operatorController, ControllerMap.buttons.B);
        Button raiseBackB = new JoystickButton(operatorController, ControllerMap.buttons.A);
 */
        /* lowerB.whenPressed(new org.team4230.robot2019.commands.climber.Lower());
        raiseB.whenPressed(new org.team4230.robot2019.commands.climber.Raise());
        raiseFrontB.whenPressed(new org.team4230.robot2019.commands.climber.RaiseFront());
        raiseBackB.whenPressed(new org.team4230.robot2019.commands.climber.RaiseBack());
 */
        // operator hatch button mappings
        /* Button oHatchLower = new JoystickButton(operatorController, ControllerMap.buttons.RS);
        Button oHatchRelease = new JoystickButton(operatorController, ControllerMap.buttons.LS); */

        /* oHatchLower.whenPressed(new org.team4230.robot2019.commands.hatch.LowerHatch());
        oHatchLower.whenReleased(new org.team4230.robot2019.commands.hatch.RaiseHatch());
        oHatchRelease.whenPressed(new org.team4230.robot2019.commands.hatch.Release());
        oHatchRelease.whenReleased(new org.team4230.robot2019.commands.hatch.Reset()); */

    }

    /**
     * Gets the drive speed value from the stick. Input sensitivity curves
     * should be applied here.
     *
     * @return a value between -1 and 1 porportional to drivetrain speed
     */
    public double getDriveSpeed() {
        return driverController.getRawAxis(ControllerMap.analog.LY);
    }

    /**
     * Gets the drivetrain rotation from the stick. Input sensitivity curves
     * should be applied here.
     *
     * @return a value between -1 and 1 porportional to the drivetrain rotation
     *         rate
     */
    public double getDriveRot() {
        return driverController.getRawAxis(ControllerMap.analog.RX);
    }

    /**
     * Scale a raw input from the controller to new desired range. The input
     * sensitivity curve is applied here.
     *
     * @param rawSpeed The raw speed input from the stick
     * @param speedMult The multiplier that should be applied to the raw input
     * @return a value between -1 and 1 representing the scaled speed
     */

    /**
     * Gets the climber speed from the control stick.
     *
     * @return a value between -1 and 1 proportional to the climber motor speed
     */
    /* public double getClimberDriveSpeed() {
        return scaleRawSpeed(operatorController.getRawAxis(ControllerMap.analog.RY),
                             RobotMap.Constants.climberDriveSpeedMult);
    } */

    /**
     * Gets the lift speed from the control stick
     *
     * @return a value between -1 and 1 porportional to the desired speed of
     *         the climber motor
     */
    /* public double getLiftSpeed() {
        return scaleRawSpeed(operatorController.getRawAxis(ControllerMap.analog.LY),
                             RobotMap.Constants.liftSpeedMult);
    } */
        //IDK
    public Joystick getJoystick1() {
        return driverController;
    }
}
