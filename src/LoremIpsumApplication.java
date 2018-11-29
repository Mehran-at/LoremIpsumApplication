import java.util.List;

public class LoremIpsumApplication {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        readDocument(fileReader);
    }
    private static void readDocument(FileReader fileReader) {
        System.out.println("---- DOCUMENT ----");
        List<String> lines = fileReader.getLines("lorem-ipsum.txt");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
