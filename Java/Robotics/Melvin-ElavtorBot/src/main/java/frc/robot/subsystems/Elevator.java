// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Elevator extends SubsystemBase {
  private TalonFX ElevatorRight;
  private TalonFX ElevatorLeft;
  public XboxController DriverController = new XboxController(Constants.DriverController_);
  //private LimitSwitchNormal LimitSwitch = new LimitSwitchNormal(false);
   
  /** Creates a new Elevator. */
  public Elevator() {
    ElevatorLeft = new TalonFX(Constants.MotorElevatorLeft_);
    ElevatorRight = new TalonFX(Constants.MotorElevatorRight_);
  }
  public double GetControllerTrigger(int Trigger) {
    return DriverController.getRawAxis(Trigger);
  }
  public void Move(double speed) {
    ElevatorLeft.set(ControlMode.PercentOutput, speed);
    ElevatorRight.set(ControlMode.PercentOutput, speed);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
