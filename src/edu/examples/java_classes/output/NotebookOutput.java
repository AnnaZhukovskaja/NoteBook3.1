package edu.examples.java_classes.output;

import java.util.Date;
import java.util.List;

import edu.examples.java_classes.entity.Note;

public class NotebookOutput {
	
	public void print(String title, List<Note> notes) {
		
		System.out.println(title.toUpperCase());
		System.out.println();
		
		if(notes == null || notes.size() <= 0) {
			System.out.println("No notes to output");
			return;
		}
		
		for(Note n : notes) {
			System.out.println(n.getId() + " - " + n.getTitle());
		}
		
	}

	public void printSepаrator() {
		System.out.println("_________________________________________________________________________________________");
	}

	public void printBegin() {
		System.out.println("> ");
	}

	public void printEnterContent() {
		System.out.println("Please enter the content: ");
	}

	public void printEnterTitle() {
		System.out.println("Please enter the title: ");
	}


	public void printEnterYear() {
		System.out.println("Please enter year: ");
	}

	public void printEnterMonth() {
		System.out.println("Please enter month: ");
	}
	public void printEnterDate() {
		System.out.println("Please enter date: ");

	}

	public void printMessageAddNotes() {
		System.out.println("Notes added ");
	}

	public void printMessageNoAction() {
		System.out.println("Sorry, no action.");
	}
}
