package by.epam.javatraining.texthandler.service.parser;

import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.entity.TextComponentType;
import by.epam.javatraining.texthandler.entity.TextComposite;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextToParagraphParser implements ChainTextParser {
    private ChainTextParser nextParser;

    @Override
    public void setNextParser(ChainTextParser parser) {
        nextParser = parser;
    }

    @Override
    public TextComponent parse(TextComponent textComponent, String text) {

        if (textComponent.getTextComponentType() == TextComponentType.TEXT) {
            TextComponent paragraph = new TextComposite(TextComponentType.PARAGRAPH);

            Pattern pattern = Pattern.compile(paragraph.getTextComponentType().getComponentRegex());
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                textComponent.addComponent(nextParser.parse(paragraph, matcher.group()));
            }

        } else {
            nextParser.parse(textComponent, text);
        }

        return textComponent;
    }
}
