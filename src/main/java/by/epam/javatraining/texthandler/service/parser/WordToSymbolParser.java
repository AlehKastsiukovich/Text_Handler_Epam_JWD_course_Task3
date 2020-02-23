package by.epam.javatraining.texthandler.service.parser;

import by.epam.javatraining.texthandler.entity.CharacterLeaf;
import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.entity.TextComponentType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordToSymbolParser implements ChainTextParser {

    @Override
    public void setNextParser(ChainTextParser parser) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TextComponent parse(TextComponent textComponent, String text) {
        if (textComponent.getTextComponentType() == TextComponentType.WORD) {
            TextComponent symbol;
            Pattern pattern = Pattern.compile(TextComponentType.SYMBOL.getComponentRegex());
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                textComponent.addComponent(new CharacterLeaf(matcher.group().charAt(0)));
            }

        } else {
            throw new UnsupportedOperationException();
        }

        return textComponent;
    }
}
