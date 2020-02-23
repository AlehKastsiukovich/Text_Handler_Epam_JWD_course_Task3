package by.epam.javatraining.texthandler.service.parser;

import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.entity.TextComponentType;
import by.epam.javatraining.texthandler.entity.TextComposite;
import by.epam.javatraining.texthandler.exception.ServiceException;
import by.epam.javatraining.texthandler.validator.ParserValidator;
import org.apache.log4j.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceToLexemeParser implements ChainTextParser {
    private static final Logger logger = Logger.getLogger(SentenceToLexemeParser.class);
    private ParserValidator parserValidator = ParserValidator.getInstance();
    private ChainTextParser nextParser;

    @Override
    public void setNextParser(ChainTextParser parser) throws ServiceException {
        if (parser == null) {
            logger.error("Parser must be initialized!");
            throw new ServiceException();
        }
        nextParser = parser;
    }

    @Override
    public TextComponent parse(TextComponent textComponent, String text) throws ServiceException {
        parserValidator.checkParseMethodParameters(textComponent, text);
        if (textComponent.getTextComponentType() == TextComponentType.SENTENCE) {
            TextComponent lexeme = new TextComposite(TextComponentType.LEXEME);

            Pattern pattern = Pattern.compile(lexeme.getTextComponentType().getComponentRegex());
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                textComponent.addComponent(nextParser.parse(lexeme, matcher.group()));
            }
        } else {
            nextParser.parse(textComponent, text);
        }

        return textComponent;
    }
}
