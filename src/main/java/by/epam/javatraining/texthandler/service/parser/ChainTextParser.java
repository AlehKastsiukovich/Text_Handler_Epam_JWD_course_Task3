package by.epam.javatraining.texthandler.service.parser;

import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.exception.ServiceException;

public interface ChainTextParser {
    void setNextParser(ChainTextParser parser) throws ServiceException;
    TextComponent parse(TextComponent textComponent, String text) throws ServiceException;
}
