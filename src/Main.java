import java.util.HashSet;
import java.util.Set;

public class Main {

    static String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
            "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        WordsChecker checker = new WordsChecker(lorem); //создаём объект и передаём ему текст и множество
        checker.hasWord("loRem");

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("время работы программы: " + elapsed);
    }
}
