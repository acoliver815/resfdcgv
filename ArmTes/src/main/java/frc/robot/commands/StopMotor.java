package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.RUn;

public class StopMotor extends CommandBase {
    public static RUn MotorRun;
    public StopMotor(RUn run){
        MotorRun = run;
    }

    @Override
    public void execute() {
        MotorRun.getMotor().set(0);
    }

    public void end() {
    }

}
