package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RUn extends SubsystemBase{
    WPI_TalonFX motor;
    public RUn(){
        motor =new WPI_TalonFX(2);


    }

    public WPI_TalonFX getMotor() {
        return motor;
    }
    // Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.








}
