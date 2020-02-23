package by.epam.javatraining.texthandler.service.parser;

import by.epam.javatraining.texthandler.entity.CharacterLeaf;
import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.entity.TextComponentType;
import by.epam.javatraining.texthandler.exception.ServiceException;
import by.epam.javatraining.texthandler.validator.ParserValidator;
import org.apache.log4j.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordToSymbolParser implements ChainTextParser {
    private static final int CHAR_POSITION = 0;
    private static final Logger logger = Logger.getLogger(WordToSymbolParser.class);
    private ParserValidator parserValidator = ParserValidator.getInstance();


    @Override
    public void setNextParser(ChainTextParser parser) throws ServiceException {
        logger.error("There is end of chain methods!");
        throw new ServiceException();
    }

    @Override
    public TextComponent parse(TextComponent textComponent, String text) throws ServiceException {
        parserValidator.checkParseMethodParameters(textComponent, text);

        if (textComponent.getTextComponentType() == TextComponentType.WORD) {
            Pattern pattern = Pattern.compile(TextComponentType.SYMBOL.getComponentRegex());
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                textComponent.addComponent(new CharacterLeaf(matcher.group().charAt(CHAR_POSITION)));
            }

        } else {
            throw new UnsupportedOperationException();
        }

        return textComponent;
    }
}
