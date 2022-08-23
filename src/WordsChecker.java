import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    protected String text;
    protected Set<String> wordSet;

    public WordsChecker(String text) {
        this.text = text;
        this.wordSet = new HashSet<>(); //создаем множество
    }

    public void hasWord(String word) {
        String mod = text.toLowerCase().replaceAll("[.,]", "");
        String[] wordsMas = mod.split(" "); //заполняем массив словами
        //Set<String> wordsSet = new HashSet<>(); //создаем множество
        for (int i = 0; i < wordsMas.length; i++) { //идем по массиву
            wordsSet.add(wordsMas[i]);  //добавляем слова в множество из массива
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
