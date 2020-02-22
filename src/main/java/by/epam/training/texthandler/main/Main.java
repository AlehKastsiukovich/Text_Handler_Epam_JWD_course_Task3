package by.epam.training.texthandler.main;

import by.epam.javatraining.texthandler.util.reader.TextFileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//    public static String sourceText = "\tIt has survived - not only (five) centuries, but also the leap into 13<<2 electronic type setting, remaining 3>>5 essentially ~6&9|(3&4) unchanged. It was popularised in the 5|(1&2&(3|(4&(6^5|6&47)|3)|2)|1) with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
//            "\tIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using (~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78 Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using (Content here), content here', making it look like readable English.\n" +
//            "\tIt is a (4^5|1&2<<(2|5>>2&71))|1200 established fact that a reader will be of a page when looking at its layout.\n" +
//            "\tBye.\n";

    public static final String ABZAC = "([A-Z].+([.?!]))";
    public static final String Sentences = "([^.][A-Z].+\\.)";
    public static final String reversePolish = "(\\(([^)]*)\\))";
    public static final String test = "(?s)((?:[^\\n][\\n]?)+)";
    public static final String paragraph = "(?s)((?:[^\\n][\\n]?)+)";
    public static final String sent = "([A-Z][^\\.!?]*[\\.!?])";
    public static final String lexeme = "([^\\s]+)";
    public static final String word = "(\\w+)(\\W*)";
    public static final String symbol = ".";
    public static final String testi = "(\\(([^)]*)\\))";


    public static void main(String[] args) {
        TextFileReader fileReader = TextFileReader.getInstance();
        String text = fileReader.readFile();
//        Pattern pattern = Pattern.compile(ABZAC);
//        Matcher matcher = pattern.matcher(text);
//        List<String> list = new ArrayList<>();
//        while (matcher.find()) {
//            list.add(matcher.group());
//        }
//        int count = 0;
//        for (String string: list) {
//            System.out.println(count + "/" + string);
//            count++;
//        }
//        Pattern pattern1 = Pattern.compile(Sentences);
//        Matcher matcher1 = pattern1.matcher(text);
//
//        List<String> listSent = new ArrayList<>();
//        while (matcher1.find()) {
//            listSent.add(matcher1.group());
//        }
//
//        int count1 = 0;
//        for (String str: listSent) {
//            System.out.println(count1 + "/" + str);
//            count1++;
//        }

        //algoritm reverse polish notation. 1. найти

        // Строка для сканирования, чтобы найти шаблон
        String str = "helloAhelloBhelloC";
        String pattern = "(hello)A\\1B\\1C"; //все что в скобках
        //String pattern = "\\(.*?\\)";

        // Создание Pattern объекта
        Pattern r = Pattern.compile(pattern);

        // Создание matcher объекта
        Matcher m = r.matcher(str);
        while (m.find()) {
            System.out.println("Найдено значение: " + m.start() + "-" + m.group());
//            System.out.println("Найдено значение: " + m.group(1));
//            System.out.println("Найдено значение: " + m.group(2));
        }
    }
}
