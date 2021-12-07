// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class DriveControl extends CommandBase {
  /** Creates a new DriveControl. */
  public DriveControl() {
    addRequirements(Robot.drivetrain);
    // Use addRequirements() here to declare subsystem dependencies.
  }
  

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double LeftSpeed = Robot.drivetrain.GetControllerAxis(Constants.LeftStick_Y);
    double RightSpeed = Robot.drivetrain.GetControllerAxis(Constants.RightStick_Y);
    Robot.drivetrain.setLeftMotors(LeftSpeed);
    Robot.drivetrain.setRightMotors(RightSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
