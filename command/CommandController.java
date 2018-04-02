package command;

import java.util.HashMap;
import java.util.Map;

public class CommandController {
    
    private Map<String, Command> commands;
    
    public CommandController () {
        commands = new HashMap<>();
    }
    
    public boolean addCommand (String commandName, Command command) {
        if (commands.containsKey(commandName)) {
            return false;
        } 
        return commands.put(commandName, command) != null;
    }
    
    public void executeCommand (String commandName) {
        if (commands.containsKey(commandName)) {
            commands.get(commandName).apply();
        }
    }
    
    /* Factory pattern */
    public static CommandController init() {
        final CommandController cf = new CommandController();

        // Note the use of a functional interface which allows us specified directly what the
        // method apply should execute. Only a method can be used.
        cf.addCommand("turn_on_light", new TurnOnLight());
        cf.addCommand("turn_off_light", () -> System.out.println("Light turned off"));
        cf.addCommand("unplug_light", () -> System.out.println("Light unplugged"));
        cf.addCommand("plug_light", () -> System.out.println("Light plugged"));

        return cf;
    }
    
}
