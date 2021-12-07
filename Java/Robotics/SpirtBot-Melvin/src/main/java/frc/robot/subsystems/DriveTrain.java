// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  //Motor Controllers
  //    Left
  private Spark MotorFrontL;
  private Spark MotorBackL;
  //    Right
  private Spark MotorFrontR;
  private Spark MotorBackR;


  /** Creates a new DriveTrain. */
  public DriveTrain() {
    MotorFrontL = new Spark(Constants.MotorFrontL);
    MotorFrontL.setInverted(Constants.LeftInverted);

    MotorBackL = new Spark(Constants.MotorBackL);
    MotorBackL.setInverted(Constants.LeftInverted);

    MotorFrontR = new Spark(Constants.MotorFrontR);
    MotorFrontR.setInverted(Constants.RightInverted);

    MotorBackR = new Spark(Constants.MotorBackR);
    MotorBackR.setInverted(Constants.RightInverted);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
