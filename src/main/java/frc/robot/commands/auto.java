package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.driveTrain;

public class auto {

    public static CommandBase defaultAutonomous(driveTrain drive){
        return Commands.sequence(drive.C_driveInDistance(0), drive.C_drive(0, 0)); 
    }
    
    private auto(){
        throw new UnsupportedOperationException("This is where we contain our autos!");
      }
    
}