package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.logic.NotebookLogic;
import edu.examples.java_classes.output.NotebookOutput;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ConsoleFindItemByDate implements Command {
    private NotebookLogic logic = new NotebookLogic();
    private NotebookOutput notebookOutput = new NotebookOutput();

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);

        notebookOutput.printEnterYear();
        notebookOutput.printBegin();
        int year = sc.nextInt();
        notebookOutput.printEnterMonth();
        notebookOutput.printBegin();
        int month = sc.nextInt();
        notebookOutput.printEnterDate();
        notebookOutput.printBegin();
        int date = sc.nextInt();


        Date dateInput = new Date(year - 1900, month-1, date);
        dateInput.setHours(0);
        dateInput.setMinutes(0);
        dateInput.setSeconds(0);

        List<Note> result = logic.findByDate(dateInput);

        notebookOutput.printSepаrator();

        notebookOutput.print("Found notes: ", result);

        notebookOutput.printSepаrator();

    }
}
