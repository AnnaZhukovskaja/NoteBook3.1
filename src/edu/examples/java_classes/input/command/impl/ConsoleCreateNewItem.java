package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;
import edu.examples.java_classes.output.NotebookOutput;

import java.util.Scanner;

public class ConsoleCreateNewItem implements Command{

	private NotebookLogic logic = new NotebookLogic();
	private NotebookOutput notebookOutput = new NotebookOutput();

	@Override
	public void execute() {

		notebookOutput.printEnterTitle();
		notebookOutput.printBegin();

		Scanner sc = new Scanner(System.in);
		String inputTitle = sc.nextLine();

		notebookOutput.printEnterContent();
		notebookOutput.printBegin();

		String inputContent = sc.nextLine();

		logic.add(inputTitle,inputContent);

		notebookOutput.printMessageAddNotes();
		notebookOutput.printSepаrator();
		
	}

}
