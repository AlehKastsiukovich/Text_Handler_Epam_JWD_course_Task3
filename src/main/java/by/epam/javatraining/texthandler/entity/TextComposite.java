package by.epam.javatraining.texthandler.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TextComposite implements TextComponent {
    private List<TextComponent> componentList = new ArrayList<>();

    @Override
    public void addComponent(TextComponent component) {
        componentList.add(component);
    }

    @Override
    public void removeComponent(TextComponent component) {
        componentList.remove(component);
    }

    @Override
    public TextComponent getChild(int i) {
        return componentList.get(i);
    }

    @Override
    public Iterator<TextComponent> getIterator() {
        return componentList.iterator();
    }
}
