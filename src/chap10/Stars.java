package chap10;

import java.util.ArrayList;
import java.util.List;

public class Stars
{
    public static void main(String[] args)
    {
        List<String> words = getWords();

        //TODO add a * after each word in the list
    }

    private static List<String> getWords()
    {
        List<String> words = new ArrayList<>();
        words.add("the");
        words.add("quick");
        words.add("brown");
        words.add("fox");
        return words;
    }
}
