package by.epam.javatraining.texthandler.entity;

public enum TextType {
    TEXT(".+"),
    PARAGRAPH("(?s)((?:[^\n][\n]?)+))"),
    SENTENCE("([A-Z][^\\.!?]*[\\.!?])"),
    LEXEME("([^\\s]+)"),
    WORD("(\\w+)(\\W*)"),
    SYMBOL(".");

    String componentRegex;

    TextType(String componentRegex) {
        this.componentRegex = componentRegex;
    }

    public String getComponentRegex() {
        return componentRegex;
    }
}
