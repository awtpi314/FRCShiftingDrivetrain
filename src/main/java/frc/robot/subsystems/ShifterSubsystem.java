package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * <h3>ShifterSubsystem</h3>
 * 
 * Controls the solenoid for the shifting drivetrain
 */
public class ShifterSubsystem extends SubsystemBase {
    private Solenoid shifterSolenoid;

    public static final int shifterSolenoidID = 0;

    /**
     * <h3>ShifterSubsystem</h3>
     * 
     * Initializes a new {@link frc.robot.subsystems.ShifterSubsystem
     * ShifterSubsystem} with the passed solenoid ID.
     * 
     * @param solenoidID the ID of the solenoid
     */
    public ShifterSubsystem(int solenoidID) {
        shifterSolenoid = new Solenoid(solenoidID);
    }

    /**
     * <h3>setShifterState</h3>
     * 
     * Sets the shifter to the passed state
     * 
     * @param state the state to write to the piston
     */
    public void setShifterState(boolean state) {
        shifterSolenoid.set(state);
    }

    /**
     * <h3>getShifterState</h3>
     * 
     * Reads the state of the shifting piston
     * 
     * @return the piston state
     */
    public boolean getShifterState() {
        return shifterSolenoid.get();
    }
}
