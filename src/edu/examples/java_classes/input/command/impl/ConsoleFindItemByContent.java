package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;
import edu.examples.java_classes.output.NotebookOutput;

import java.util.List;
import java.util.Scanner;

public class ConsoleFindItemByContent implements Command {

    private NotebookLogic logic = new NotebookLogic();
    private NotebookOutput notebookOutput = new NotebookOutput();

    @Override
    public void execute() {

        notebookOutput.printEnterContent();
        notebookOutput.printBegin();
        Scanner sc = new Scanner(System.in);
        String inputContent = sc.nextLine();

        List<Note> rezult = logic.findByText(inputContent);

        notebookOutput.printSepаrator();
        notebookOutput.print("All nouts: ", rezult);
        notebookOutput.printSepаrator();

    }

}
