package by.epam.javatraining.texthandler.main;

import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.entity.TextComponentType;
import by.epam.javatraining.texthandler.entity.TextComposite;
import by.epam.javatraining.texthandler.service.parser.*;
import by.epam.javatraining.texthandler.util.reader.TextFileReader;

public class Main {

    public static void main(String[] args) {
        String text = TextFileReader.getInstance().readFile();
        System.out.println(text);

        TextComponent textComponent = new TextComposite(TextComponentType.TEXT);
        ChainTextParser chainTextParser = new TextToParagraphParser();
        ChainTextParser chainParagraphParser = new ParagraphToSentenceParser();
        ChainTextParser chainSentenceParser = new SentenceToLexemeParser();
        ChainTextParser chainLexemeParser = new LexemeToWordParser();
        ChainTextParser chainWordParser = new WordToSymbolParser();
        chainTextParser.setNextParser(chainParagraphParser);
        chainParagraphParser.setNextParser(chainSentenceParser);
        chainSentenceParser.setNextParser(chainLexemeParser);
        chainLexemeParser.setNextParser(chainWordParser);

        chainTextParser.parse(textComponent, text);

        System.out.print(textComponent.toString());
    }
}
