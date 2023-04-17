import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String line = "0123 - abc - 4567 - def - 8g9h";

        char[] first = new char[4];
        line.getChars(0, 4, first, 0);

        char[] second = new char[4];
        line.getChars(13, 17, second, 0);

        System.out.println(Arrays.toString(first) + Arrays.toString(second));

        main1(line);
        main2(line);
        main3(line);
        main4(line);
        main5(line);
        main6(line);
    }

    public static void main1(String line) {
        line.replace("a", "*")
                .replace("b", "*")
                .replace("c", "*")
                .replace("d", "*")
                .replace("e", "*")
                .replace("f", "*");

        System.out.println(line);
    }
    public static void main2(String line) {
        String join = String.join("/", "abc", "def", "g", "h");
        System.out.println(join);
    }


    public static void main3(String line) {
        StringBuilder stringBuilder = new StringBuilder("0123 - abc - 4567 - def - 8g9h");

        stringBuilder.insert(0, "Letters: ");

        String sb = stringBuilder.toString();

        System.out.println(sb.toUpperCase());
    }

    public static void main4(String line) {
        boolean abc = line.contains("abc");

        System.out.println(abc);
    }

    public static void main5(String line) {
        boolean start = line.startsWith("555");

        System.out.println(start);
    }

    public static void main6(String line) {
        boolean end = line.endsWith("1a2b");

        System.out.println(end);
    }
}