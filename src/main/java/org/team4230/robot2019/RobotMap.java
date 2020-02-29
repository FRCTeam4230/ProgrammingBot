package org.team4230.robot2019;


public class RobotMap {
    /**
     * Contains the mappings for the analog inputs.
     */
    public static class AnalogIn { 
        public static int pressureSensor = 0;
        public static int ultrasonicSensor = 1;
    }

    /**
     * Contains the mappings for devices on the CAN bus
     */
    public static class CAN {
        //public static int compressor = 0;
        public static int driveLH1 = 1;
        public static int driveLH2 = 2;
        public static int driveRH1 = 3;
        public static int driveRH2 = 4;
        public static int driveClimber = 5;
        public static int ballIntake = 6;
        public static int linSlide = 7;
    }

    /**
     * Contains constants used by various bits of robot code
     */
    public static class Constants {
        public static double intake = 0.8;
        public static double climberDriveSpeedMult = 0.7;
        public static double liftSpeedMult = 0.8;
        // from the datasheet http://www.revrobotics.com/content/docs/REV-11-1107-DS.pdf
        // formula: Pressure = inVolts * pressureMult + pressureAdd
        // At Calibration pressure p_0 and output voltage v_0: pressureMult = 250/(V_0/(0.004*p_0+0.1))
        // pressureAdd is constant; is 25
        public static double pressureMult = 54.3071;
        public static double pressureSub =  25;
    }

    /**
     * Contains mappings for devices (solenoids) controlled by the PCM
     */
    public static class PCM {
        public static int hatchReleaseForward = 0;
        public static int hatchReleaseReverse = 1;
        public static int guide = 6;
        public static int hatchLower = 3;
        public static int climberFront = 5;
        public static int climberBack = 4;
    }
}
