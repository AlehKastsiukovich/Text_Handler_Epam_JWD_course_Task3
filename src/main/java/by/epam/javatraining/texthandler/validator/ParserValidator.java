package by.epam.javatraining.texthandler.validator;

import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.exception.ServiceException;

public class ParserValidator {

    private ParserValidator() {
    }

    private static class TextComponentValidatorHolder {
        private static final ParserValidator INSTANCE = new ParserValidator();
    }

    public static ParserValidator getInstance() {
        return TextComponentValidatorHolder.INSTANCE;
    }

    public void checkParseMethodParameters(TextComponent textComponent, String text) throws ServiceException {
        if (textComponent == null || textComponent.getTextComponentType() == null) {
            throw new ServiceException();
        }

        if (text == null || text.length() == 0) {
            throw new ServiceException();
        }
    }
}
