package by.epam.javatraining.texthandler.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {
    private List<TextComponent> componentList = new ArrayList<>();

    @Override
    public void parse() {
        for (TextComponent component: componentList) {
            component.parse();
        }
    }

    @Override
    public TextComponent getChild(int i) {
        return null;
    }

    @Override
    public void addComponent(TextComponent component) {
        componentList.add(component);
    }
}
