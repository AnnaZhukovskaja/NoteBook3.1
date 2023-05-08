package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.output.NotebookOutput;

public class ConsoleNoAction implements Command {

	private NotebookOutput notebookOutput = new NotebookOutput();

	@Override
	public void execute() {
		notebookOutput.printMessageNoAction();
		
	}

}
