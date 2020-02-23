package by.epam.javatraining.texthandler.service.parser;

import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.entity.TextComponentType;

public class LexemeToWordParser implements ChainTextParser {
    private ChainTextParser nextParser;

    @Override
    public void setNextParser(ChainTextParser parser) {
        nextParser = parser;
    }

    @Override
    public TextComponent parse(TextComponent textComponent, String text) {
        if (textComponent.getTextComponentType() == TextComponentType.LEXEME) {
            //parse
        } else {
            nextParser.parse(textComponent);
        }

        return null;
    }
}
