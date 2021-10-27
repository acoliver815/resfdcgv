package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.RUn;

public class RunMotor extends CommandBase {
    public static RUn MotorRun;
    public RunMotor(RUn run){
        MotorRun = run;
    }

    @Override
    public void execute() {
        MotorRun.getMotor().set(.5);
    }
}
