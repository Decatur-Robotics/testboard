// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.MotionMagicVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private TalonFX testMotor = new TalonFX(4);

  private MotionMagicVoltage motionProfileRequest = new MotionMagicVoltage(0);
  private static final double kP = 0;
  private static final double kI = 0;
   private static final double kD = 0;
  private static final double kS = 0;
   private static final double kV = 0;
  private static final double kA = 0;
  
  private Slot0Configs slot0 = new Slot0Configs()
  .withKP(kP)
  .withKI(kI)
  .withKD(kD)
  .withKS(kS)
  .withKV(kV);
  private TalonFXConfiguration config = new TalonFXConfiguration().withSlot0(slot0);
  public ExampleSubsystem() {
  testMotor.getConfigurator().apply(slot0);
  }
  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }
  public Command setPositionCommand(double position){

    return runOnce(() -> testMotor.setControl(motionProfileRequest.withPosition(position)));
  }
  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
