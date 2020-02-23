package by.epam.javatraining.texthandler.service.parser;

import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.entity.TextComponentType;
import by.epam.javatraining.texthandler.entity.TextComposite;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphToSentenceParser implements ChainTextParser {
    private ChainTextParser nextParser;

    @Override
    public void setNextParser(ChainTextParser parser) {
        nextParser = parser;
    }

    @Override
    public TextComponent parse(TextComponent textComponent, String text) {
        if (textComponent.getTextComponentType() == TextComponentType.PARAGRAPH) {
            TextComponent sentence = new TextComposite(TextComponentType.SENTENCE);

            Pattern pattern = Pattern.compile(sentence.getTextComponentType().getComponentRegex());
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                textComponent.addComponent(nextParser.parse(sentence, matcher.group()));
            }
        } else {
            nextParser.parse(textComponent, text);
        }

        return textComponent;
    }
}
