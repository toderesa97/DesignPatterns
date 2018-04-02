package command;

@FunctionalInterface
public interface Command {
    // functional interface only applies to interfaces with one single method.
    public void apply();    
}
