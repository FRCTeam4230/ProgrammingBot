package org.team4230.robot2019.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import org.team4230.robot2019.RobotMap;
import org.team4230.robot2019.commands.drivetrain.DriveTeleop;
import org.team4230.robot2019.commands.intake.IntakeWheel;

import java.util.function.DoubleSupplier;

public class Intake extends Subsystem {

    private DifferentialDrive driveSys;
    private TalonSRX intake;

    public Intake() {

        intake = new TalonSRX(5);

    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new IntakeWheel());
    }

    public void spinIn() {
        intake.set(ControlMode.PercentOutput, 0.5);
    }

    public void spinOut() {
        intake.set(ControlMode.PercentOutput, -0.5);
    }

    public void stop() {
        intake.set(ControlMode.PercentOutput, 0.0);
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
    }
}
