package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.RUn;

public class RunMotorFast extends CommandBase {
    public static RUn MotorRun;
    public RunMotorFast(RUn run){
        MotorRun = run;
    }

    @Override
    public void execute() {
        MotorRun.getMotor().set(.7);
    }

    public void end(boolean interrupted) {
        MotorRun.getMotor().set(0);
    }

}
