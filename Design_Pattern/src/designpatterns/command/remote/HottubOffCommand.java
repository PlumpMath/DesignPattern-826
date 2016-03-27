package designpatterns.command.remote;

import designpatterns.command.simpleRemote.Command;

public class HottubOffCommand implements Command {
	Hottub hottub;
	
	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.cool();
		hottub.off();
	}

}
