package by.epam.javatraining.texthandler.entity;

public enum TextComponentType {
    TEXT(".+"),
    PARAGRAPH("\\s{4}.+"),
    SENTENCE("([A-Z][^\\.!?]*[\\.!?])"),
    LEXEME("(\\s{0,4}?).+(\\s|\\.|,)?"),
    WORD("(\\w+)(\\W*)"),
    SYMBOL(".");

    String componentRegex;

    TextComponentType(String componentRegex) {
        this.componentRegex = componentRegex;
    }

    public String getComponentRegex() {
        return componentRegex;
    }
}
