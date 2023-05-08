package edu.examples.java_classes.input;

import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.logic.NotebookLogic;
import edu.examples.java_classes.output.NotebookOutput;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		ConsoleMenu menu = new ConsoleMenu();

		NotebookLogic logic = new NotebookLogic();

		logic.add("title1", "content1");
		logic.add("title2", "content2");
		logic.add("title3", "content3");

		List<Note> myNotes = logic.allNotes();

		NotebookOutput output = new NotebookOutput();

		output.printSepаrator();
		menu.execute();
		output.printSepаrator();

	}

}
