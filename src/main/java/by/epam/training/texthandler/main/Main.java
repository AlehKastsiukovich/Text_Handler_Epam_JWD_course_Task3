package by.epam.training.texthandler.main;

import by.epam.javatraining.texthandler.util.TextFileReader;


public class Main {

    public static void main(String[] args) {
        TextFileReader fileReader = TextFileReader.getInstance();

        String text = fileReader.readFile();

        System.out.println(text);
    }
}
