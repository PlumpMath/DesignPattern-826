package designpatterns.command.macro;

public class LightOffCommand implements Command {
	Light light;
	int level;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		level = light.getLevel();
		light.off();

	}

	@Override
	public void undo() {
		light.dim(level);
	}

}
