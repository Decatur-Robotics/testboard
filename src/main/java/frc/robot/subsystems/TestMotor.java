// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.configs.MotionMagicConfigs;
import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.MotionMagicVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TestMotor extends SubsystemBase {

  private TalonFX testMotor = new TalonFX(4);

  private MotionMagicVoltage motionProfileRequest = new MotionMagicVoltage(0);
  
  private TalonFXConfiguration config = new TalonFXConfiguration()
  .withSlot0(MotorConfig.SLOT_0)
  .withMotionMagic(MotorConfig.MOTION_MAGIC_CONFIG);

  public TestMotor() {
  testMotor.getConfigurator().apply(config);
  }

 
  public Command setPositionCommand(double position){

    return runOnce(() -> testMotor.setControl(motionProfileRequest.withPosition(position)));
  }


}
