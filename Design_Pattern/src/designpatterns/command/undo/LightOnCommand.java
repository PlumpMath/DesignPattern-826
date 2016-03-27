package designpatterns.command.undo;

public class LightOnCommand implements Command {
	Light light;
	int level;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		level = light.getLevel();
		light.on();
	}

	@Override
	public void undo() {
		light.dim(level);
		
	}

}
