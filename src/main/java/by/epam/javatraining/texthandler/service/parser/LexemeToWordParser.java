package by.epam.javatraining.texthandler.service.parser;

import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.entity.TextComponentType;
import by.epam.javatraining.texthandler.entity.TextComposite;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeToWordParser implements ChainTextParser {
    private ChainTextParser nextParser;

    @Override
    public void setNextParser(ChainTextParser parser) {
        nextParser = parser;
    }

    @Override
    public TextComponent parse(TextComponent textComponent, String text) {
        if (textComponent.getTextComponentType() == TextComponentType.LEXEME) {
            TextComponent word = new TextComposite(TextComponentType.WORD);

            Pattern pattern = Pattern.compile(word.getTextComponentType().getComponentRegex());
            Matcher matcher = pattern.matcher(text);

            while(matcher.find()) {
                textComponent.addComponent(nextParser.parse(word, matcher.group()));
            }
        } else {
            nextParser.parse(textComponent, text);
        }

        return textComponent;
    }
}
