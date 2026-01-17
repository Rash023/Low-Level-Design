package structural_design_patterns.adapter_design_pattern;

public class SmartLight {
    public void connectToWiFi() {
        System.out.println("Smart Light connected to Wi-Fi.");
    }

    public void switchOn() {
        System.out.println("Smart Light is now ON.");
    }

    public void switchOff() {
        System.out.println("Smart Light is now OFF.");
    }

    public void disconnectWiFi() {
        System.out.println("Smart Light disconnected from Wi-Fi.");
    }
}
