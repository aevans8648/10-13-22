package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
    CANSparkMax rearRight =
        new CANSparkMax(Constants.Motors.rearRightID, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax frontLeft =
        new CANSparkMax(Constants.Motors.frontLeftID, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax frontRight =
        new CANSparkMax(Constants.Motors.frontRightID, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax rearLeft =
        new CANSparkMax(Constants.Motors.rearLeftID, CANSparkMaxLowLevel.MotorType.kBrushless);

    MotorControllerGroup leftMCG = new MotorControllerGroup(frontLeft, rearLeft);
    MotorControllerGroup rightMCG = new MotorControllerGroup(frontRight, rearRight);
    DifferentialDrive diffDrOne = new DifferentialDrive(leftMCG, rightMCG);

    public Drivetrain() {
        leftMCG.setInverted(true);

    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        diffDrOne.tankDrive(leftSpeed, rightSpeed);
    }
}
