package frc.robot.Commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.Drivetrain;

public class drivecommand extends CommandBase {
    XboxController drive;
    Drivetrain dt;

    public drivecommand(XboxController drive, Drivetrain dt) {
        this.drive = drive;
        this.dt = dt;
        addRequirements(dt);
    }

    @Override
    public void execute() {
        dt.tankDrive(drive.getLeftY(), drive.getRightY());
    }
}
