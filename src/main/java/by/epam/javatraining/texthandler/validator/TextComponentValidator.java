package by.epam.javatraining.texthandler.validator;

import by.epam.javatraining.texthandler.entity.TextComponent;

public class TextComponentValidator {

    private TextComponentValidator() {
    }

    private static class TextComponentValidatorHolder {
        private static final TextComponentValidator INSTANCE = new TextComponentValidator();
    }

    public static TextComponentValidator getInstance() {
        return TextComponentValidatorHolder.INSTANCE;
    }

    public boolean validateTextComponent(TextComponent textComponent) {
        return textComponent != null && textComponent.getTextComponentType() != null;
    }
}
