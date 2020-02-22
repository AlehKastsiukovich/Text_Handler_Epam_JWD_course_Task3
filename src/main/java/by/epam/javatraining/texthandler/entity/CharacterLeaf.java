package by.epam.javatraining.texthandler.entity;

import java.util.Iterator;

public class CharacterLeaf implements TextComponent{
    private char leafCharacter;
    private TextComponentType textComponentType;

    public CharacterLeaf(char leafCharacter) {
        this.leafCharacter = leafCharacter;
        textComponentType = TextComponentType.SYMBOL;
    }

    @Override
    public void addComponent(TextComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeComponent(TextComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TextComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TextComponentType getTextComponentType() {
        return textComponentType;
    }

    @Override
    public Iterator<TextComponent> getIterator() {
        throw new UnsupportedOperationException();
    }
}
