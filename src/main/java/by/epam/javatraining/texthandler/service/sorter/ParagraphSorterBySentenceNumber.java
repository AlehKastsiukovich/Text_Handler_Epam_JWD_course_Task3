package by.epam.javatraining.texthandler.service.sorter;

import by.epam.javatraining.texthandler.comparator.ParagraphComparatorBySentenceNumber;
import by.epam.javatraining.texthandler.entity.TextComponent;
import by.epam.javatraining.texthandler.entity.TextComponentType;
import by.epam.javatraining.texthandler.exception.ServiceException;
import java.util.List;

public class ParagraphSorterBySentenceNumber {

    public void sortBySentenceNumber(TextComponent textComponent) throws ServiceException {
        if (textComponent == null || textComponent.getTextComponentType() != TextComponentType.TEXT) {
            throw new ServiceException();
        }

        List<TextComponent> paragraphList = textComponent.getComponentList();
        paragraphList.sort(new ParagraphComparatorBySentenceNumber());
    }
}
