package behavioral_design_patterns.command_design_pattern;

public class RemoteControl {
    private Command onCommand;
    private Command offCommand;
    private Command channelChangeCommand;
    private Command volumeChangeCommand;

    public RemoteControl(){

    }

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }

    public void setChannelChangeCommand(Command channelChangeCommand) {
        this.channelChangeCommand = channelChangeCommand;
    }

    public void setVolumeChangeCommand(Command volumeChangeCommand) {
        this.volumeChangeCommand = volumeChangeCommand;
    }

    public void pressOnButton(){
        onCommand.execute();
    }
    public void pressOffButton(){
        offCommand.execute();
    }
    public void pressChannelChangeButton(){
        channelChangeCommand.execute();
    }
    public void pressVolumeChangeCommand(){
        volumeChangeCommand.execute();
    }
}
