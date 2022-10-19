package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
    public Drivetrain(CANSparkMax frontRight, CANSparkMax frontLeft, CANSparkMax rearLeft,
        CANSparkMax rearRight) {
        MotorControllerGroup leftMCG = new MotorControllerGroup(frontLeft, rearLeft);
        MotorControllerGroup rightMCG = new MotorControllerGroup(frontRight, rearRight);
        DifferentialDrive diffDrOne = new DifferentialDrive(leftMCG, rightMCG);
    }

    public void tankDrive() {

    }
}
