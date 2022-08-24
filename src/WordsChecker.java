import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    protected String text;
    protected Set<String> wordsSet;

    public WordsChecker(String text) {
        this.text = text;
        wordsSet = new HashSet<>();
    }

    public void hasWord(String word) {
        String mod = text.toLowerCase().replaceAll("[.,]", "");
        String[] wordsMas = mod.split(" "); //заполняем массив
        Collections.addAll(wordsSet, wordsMas);
        System.out.println("количество слов в тексте: " + wordsSet.size());
        String wordMod = word.toLowerCase();
        if (wordsSet.contains(wordMod)) {
            System.out.println("задуманное слово в тексте присутствует");
        } else {
            System.out.println("задуманное слово в тексте отсутствует");
        }
    }
}
