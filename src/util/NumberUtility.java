package util;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple utility class to provide various lists of numbers to other classes.
 *
 * @author Alex Lesperance
 */
public class NumberUtility
{

    private NumberUtility()
    {
    }

    public static List<Integer> getNumbers()
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(47);
        numbers.add(126);
        numbers.add(32);
        numbers.add(13);
        numbers.add(17);

        return numbers;
    }
}