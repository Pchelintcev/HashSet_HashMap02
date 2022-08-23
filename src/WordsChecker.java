import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    protected String text;
    protected Set<String> wordsSet;

    public WordsChecker(String text) {
        this.text = text;
        Set<String> wordsSet = new HashSet<>();
    }

    public void hasWord(String word) {
        String mod = text.toLowerCase().replaceAll("[.,]", "");
        String[] wordsMas = mod.split(" "); //заполняем массив
        for (int i = 0; i < wordsMas.length; i++) {
            wordsSet.add(wordsMas[i]);
        }
        System.out.println("количество слов в тексте: " + wordsSet.size());
        String wordMod = word.toLowerCase();
        if (wordsSet.contains(wordMod)) {
            System.out.println("задуманное слово в тексте присутствует");
        } else {
            System.out.println("задуманное слово в тексте отсутствует");
        }
    }
}
