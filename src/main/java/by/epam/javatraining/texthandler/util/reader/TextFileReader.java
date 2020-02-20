package by.epam.javatraining.texthandler.util.reader;

import org.apache.log4j.Logger;
import java.io.*;

public class TextFileReader {
    private static final Logger logger = Logger.getLogger(TextFileReader.class);

    private String filePath;

    private TextFileReader() {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        filePath = classLoader.getResource("text.txt").getPath();
    }

    private static class TextFileReaderHolder {
        private static final TextFileReader INSTANCE = new TextFileReader();
    }

    public static TextFileReader getInstance() {
        return TextFileReaderHolder.INSTANCE;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String readFile() {
        int charInt;
        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader reader = new FileReader(filePath)) {
            while ((charInt = reader.read()) != -1) {
                stringBuilder.append((char)charInt);
            }
        } catch (IOException e) {
            logger.error(e);
        }

        return stringBuilder.toString();
    }
}
