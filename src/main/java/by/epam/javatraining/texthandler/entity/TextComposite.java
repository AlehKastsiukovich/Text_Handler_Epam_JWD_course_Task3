package by.epam.javatraining.texthandler.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TextComposite implements TextComponent {
    private List<TextComponent> componentList;
    private TextComponentType textComponentType;


    public TextComposite(TextComponentType type) {
        componentList = new ArrayList<>();
        textComponentType = type;
    }

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
    public TextComponentType getTextComponentType() {
        return textComponentType;
    }

    @Override
    public Iterator<TextComponent> getIterator() {
        return componentList.iterator();
    }

    @Override
    public List<TextComponent> getComponentList() {
        return componentList;
    }

    @Override
    public int getComponentListSize() {
        return componentList.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (TextComponent textComponent : componentList) {
            stringBuilder.append(textComponent.toString());
        }

        return stringBuilder.toString();
    }
}
