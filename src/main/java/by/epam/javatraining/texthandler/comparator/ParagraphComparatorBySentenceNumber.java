package by.epam.javatraining.texthandler.comparator;

import by.epam.javatraining.texthandler.entity.TextComponent;
import java.util.Comparator;

public class ParagraphComparatorBySentenceNumber implements Comparator<TextComponent> {

    @Override
    public int compare(TextComponent paragraph1, TextComponent paragraph2) {
        return paragraph1.getComponentListSize() - paragraph2.getComponentListSize();
    }
}
