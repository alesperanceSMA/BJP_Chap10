package util;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple utility class to provide various lists to other classes.
 *
 * @author Alex Lesperance
 */
@SuppressWarnings({"all"})
public class WordUtility
{

    private WordUtility()
    {
    }

    /**
     * Returns a list of words.
     *
     * @return a list of words.  This will never be {@code null}.
     */
    public static List<String> getWords()
    {
        List<String> words = new ArrayList<>();
        words.add("Basketball");
        words.add("Ducks");
        words.add("Cherries");
        words.add("Diplomat");
        words.add("Sophomore");
        words.add("Sohpomores");
        words.add("Wise Moron");
        words.add("Sweatshirt");
        words.add("Mouse");
        words.add("Snickerdoodle");

        return words;
    }

    /**
     * Returns the alphabet where each entry has the capital and lowercase letter.
     *
     * @return the alphabet. This will never be {@code null}.
     */
    public static List<String> getAlphabet()
    {
        List<String> alphabet = new ArrayList<>(26);
        alphabet.add("Aa");
        alphabet.add("Bb");
        alphabet.add("Cc");
        alphabet.add("Dd");
        alphabet.add("Ee");
        alphabet.add("Ff");
        alphabet.add("Gg");
        alphabet.add("Hh");
        alphabet.add("Ii");
        alphabet.add("Jj");
        alphabet.add("Kk");
        alphabet.add("Ll");
        alphabet.add("Mm");
        alphabet.add("Nn");
        alphabet.add("Oo");
        alphabet.add("Pp");
        alphabet.add("Qq");
        alphabet.add("Rr");
        alphabet.add("Ss");
        alphabet.add("Tt");
        alphabet.add("Uu");
        alphabet.add("Vv");
        alphabet.add("Ww");
        alphabet.add("Xx");
        alphabet.add("Yy");
        alphabet.add("Zz");



        return alphabet;
    }
}
