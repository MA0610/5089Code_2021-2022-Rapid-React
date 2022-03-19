// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class hangUp extends CommandBase {
  /** Creates a new hangUp. */
  public hangUp() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.mHangSub);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
 // RobotContainer.mHangSub.leftHangUp();
RobotContainer.mHangSub.hangUp();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
//    RobotContainer.mHangSub.leftHangStop();
RobotContainer.mHangSub. hangStop();

}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
