package by.epam.javatraining.texthandler.service.parser;

import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.entity.TextComponentType;

public class WordToSymbolParser implements ChainTextParser {

    @Override
    public void setNextParser(ChainTextParser parser) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TextComponent parse(TextComponent textComponent) {
        if (textComponent.getTextComponentType() == TextComponentType.WORD) {
            //parse
        } else {
            throw new UnsupportedOperationException();
        }

        return null;
    }
}
