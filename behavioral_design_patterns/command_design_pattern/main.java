package behavioral_design_patterns.command_design_pattern;

public class main {
    public static void main(String[] args) {
        TV tv=new TV();
        Command turnOn=new TurnOnCommand(tv);
        Command turnOff=new TurnOffCommand(tv);
        Command channelChange=new ChangeChannelCommand(tv,622);
        Command volumeChange=new VolumeChangeCommand(tv,50);

        RemoteControl remote=new RemoteControl();
        remote.setOnCommand(turnOn);
        remote.setOffCommand(turnOff);
        remote.setChannelChangeCommand(channelChange);
        remote.setVolumeChangeCommand(volumeChange);

        remote.pressOnButton();
        remote.pressVolumeChangeCommand();
    }
}
