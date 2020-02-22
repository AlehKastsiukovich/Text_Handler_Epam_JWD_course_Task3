package by.epam.javatraining.texthandler.service.parser;

import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.entity.TextComponentType;

public class SentenceToLexemeParser implements ChainTextParser {
    private ChainTextParser nextParser;

    @Override
    public void setNextParser(ChainTextParser parser) {
        nextParser = parser;
    }

    @Override
    public TextComponent parse(TextComponent textComponent) {
        if (textComponent.getTextComponentType() == TextComponentType.SENTENCE) {
            //parse
        } else {
            nextParser.parse(textComponent);
        }

        return null;
    }
}
