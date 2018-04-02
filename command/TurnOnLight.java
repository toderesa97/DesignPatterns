package command;

public class TurnOnLight implements Command {

    @Override
    public void apply() {
        System.out.println("Light turned on");
    }
    
}
