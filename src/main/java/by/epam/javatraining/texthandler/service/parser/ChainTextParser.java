package by.epam.javatraining.texthandler.service.parser;

import by.epam.javatraining.texthandler.entity.TextComponent;

public interface ChainTextParser {
    void setNextParser(ChainTextParser parser);
    TextComponent parse(String request);
}
