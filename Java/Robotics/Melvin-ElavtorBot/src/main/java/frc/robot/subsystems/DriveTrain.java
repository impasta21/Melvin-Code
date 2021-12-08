// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.DriveControl;

public class DriveTrain extends SubsystemBase {
  //Motor Controllers
  private TalonFX MotorFrontL;
  private TalonFX MotorBackL;
  private TalonFX MotorFrontR;
  private TalonFX MotorBackR;

  private XboxController DriverController;

  //DifferentialDrive drive;
  //DifferentialDrive drive = DifferentialDrive(MotorFrontR, MotorFrontL);

  //Creates a new DriveTrain.
  public DriveTrain() {
    MotorFrontL = new TalonFX(Constants.MotorFrontL_);//Front Left Motor
    MotorFrontL.setInverted(true);
    MotorBackL = new TalonFX(Constants.MotorBackL_);//Back Left Motor
    
    MotorBackL.setInverted(true);
    MotorBackL.follow(MotorFrontL);
    
    MotorFrontR = new TalonFX(Constants.MotorFrontR_);//Front Right Motor
    MotorFrontR.setInverted(false);
    
    MotorBackR = new TalonFX(Constants.MotorBackR_);//Back Right Motor
    MotorBackR.setInverted(false);
    MotorBackR.follow(MotorFrontR);
    
    //drive = new DifferentialDrive(MotorFrontL, MotorFrontR);
  }
  public double GetControllerAxis(int Axis) {
    return DriverController.getRawAxis(Axis);
  }

  public void setLeftMotors(double speed) {
      MotorFrontL.set(ControlMode.PercentOutput, speed);
      MotorBackL.set(ControlMode.PercentOutput, speed);
    }

    public void setRightMotors(double speed) {
      MotorFrontR.set(ControlMode.PercentOutput, speed);
      MotorBackR.set(ControlMode.PercentOutput, speed);
    }

  @Override
  public void periodic() {
    
    // This method will be called once per scheduler run
    setDefaultCommand(new DriveControl());
  }
  
}