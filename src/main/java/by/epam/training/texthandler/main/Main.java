package by.epam.training.texthandler.main;

import by.epam.javatraining.texthandler.entity.TextComposite;


public class Main {

    public static void main(String[] args) {
        TextComposite composite = new TextComposite();
        CharacterLeaf charact = new CharacterLeaf('a');
        CharacterLeaf charact1 = new CharacterLeaf('b');
        CharacterLeaf charact2 = new CharacterLeaf('c');
        CharacterLeaf charact3 = new CharacterLeaf('d');
        CharacterLeaf charact4 = new CharacterLeaf('f');
        CharacterLeaf charact5 = new CharacterLeaf('g');
        CharacterLeaf charact6 = new CharacterLeaf('j');
        CharacterLeaf charact7 = new CharacterLeaf('k');
        CharacterLeaf charact8 = new CharacterLeaf('p');

        Word word = new Word();
        Word word1 = new Word();
        Word word2 = new Word();

        word.addComponent(charact);
        word.addComponent(charact1);
        word.addComponent(charact2);
        word1.addComponent(charact3);
        word1.addComponent(charact4);
        word2.addComponent(charact5);
        word2.addComponent(charact6);
        word2.addComponent(charact7);
        word2.addComponent(charact8);

        TextComposite composite1 = new TextComposite();
        composite1.addComponent(word);
        composite1.addComponent(word1);
        composite1.addComponent(word2);
        composite1.parse();
    }
}
