package by.epam.javatraining.texthandler.entity;

import java.util.Iterator;

public class CharacterLeaf implements TextComponent{
    private char leafCharacter;

    public CharacterLeaf(char leafCharacter) {
        this.leafCharacter = leafCharacter;
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
    public Iterator<TextComponent> getIterator() {
        throw new UnsupportedOperationException();
    }
}
