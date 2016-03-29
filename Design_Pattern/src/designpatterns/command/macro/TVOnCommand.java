package designpatterns.command.macro;

public class TVOnCommand implements Command {

	TV tv;

	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	public void execute() {
		tv.on();
	}

	public void undo() {
		tv.off();
	}
}
