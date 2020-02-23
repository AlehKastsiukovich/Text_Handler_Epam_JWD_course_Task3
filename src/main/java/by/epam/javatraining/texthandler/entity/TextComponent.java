package by.epam.javatraining.texthandler.entity;

import java.util.Iterator;
import java.util.List;

public interface TextComponent {
    void addComponent(TextComponent component);
    void removeComponent(TextComponent component);
    TextComponent getChild(int i);
    TextComponentType getTextComponentType();
    Iterator<TextComponent> getIterator();
    List<TextComponent> getComponentList();
    int getComponentListSize();
}
