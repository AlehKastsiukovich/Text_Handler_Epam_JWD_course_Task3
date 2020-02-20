package by.epam.training.texthandler.main;

import by.epam.javatraining.texthandler.entity.TextComposite;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()) {
            iterator.next();
        }
    }
}
