package frc.robot.subsystems;

import com.ctre.phoenix6.configs.MotionMagicConfigs;
import com.ctre.phoenix6.configs.Slot0Configs;

public class MotorConfig {
    private static final double kP = 0;
    private static final double kI = 0;
    private static final double kD = 0;
    private static final double kS = 0;
    private static final double kV = 0;
    private static final double kA = 0;

    public static final Slot0Configs SLOT_0 = new Slot0Configs()
    .withKP(kP)
    .withKI(kI)
    .withKD(kD)
    .withKS(kS)
    .withKV(kV);
    public static final MotionMagicConfigs MOTION_MAGIC_CONFIG = new MotionMagicConfigs()
    .withMotionMagicAcceleration(1)
    .withMotionMagicCruiseVelocity(1);
    
}
