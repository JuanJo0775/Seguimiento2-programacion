package ComputerStatus;


public class ComputerStatus {
    private final boolean beeps;
    private final boolean hardDriveSpins;

    public ComputerStatus(boolean beeps, boolean hardDriveSpins) {
        this.beeps = beeps;
        this.hardDriveSpins = hardDriveSpins;
    }

    public String determineStatus() {
        if (this.beeps) {
            return this.hardDriveSpins ? "Contact technical support." : "Check drive connections.";
        } else {
            return this.hardDriveSpins ? "Check speaker connections." : "Bring the computer in for repair.";
        }
    }
}