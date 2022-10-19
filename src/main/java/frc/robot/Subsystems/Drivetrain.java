package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    public Drivetrain(CANSparkMax frontRight, CANSparkMax frontLeft, CANSparkMax rearLeft,
        CANSparkMax rearRight) {
        MotorControllerGroup leftControllerGroup = new MotorControllerGroup(frontLeft, rearLeft);
        MotorControllerGroup rightControllerGroup = new MotorControllerGroup(frontRight, rearRight);
        MotorControllerGroup DifferentialDrive = new MotorControllerGroup(frontRight, rearRight);
    }

    public Tankdrive()
    {

    }
}
