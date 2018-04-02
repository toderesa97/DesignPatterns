package command;

public class Main {
    
    public static void main(String[] args) {
        
        CommandController commandController = CommandController.init();
        
        commandController.executeCommand("plug_light");
        commandController.executeCommand("turn_on_light");
        commandController.executeCommand("turn_off_light");
        commandController.executeCommand("unplug_light");
        
    }
    
}
