import edu.duke.*;

/**
 * Write a program to figure out the most common word length of words
 * from a file. To solve this problem you will need to keep track of
 * how many words from a file are of each possible length. You should
 * group all words of length 30 or more together, and you should not
 * count basic punctuation that are the first or last characters of a
 * group of characters.
 */
public class WordLengths {

    /** Read the words in `resource` and count the number of words of each
     *  length.  Return those counts in `counts`.
     *
     *  For example, count[1] being 12 means there were 12 words of length
     *  1.  count[9] being 4 means there were 4 words of length 9, and
     *  count[10] being 0 means there were no 10-character words seen.
     *
     *  If a word has a non-letter as the first or last character, that
     *  character should not be counted as part of the word length. For
     *  example, the word And, would be considered of length 3 (the comma
     *  is not counted), the word “blue-jeans” would be considered of
     *  length 10 (the double quotes are not counted, but the hyphen is).
     *  Note that we will miscount some words, such as “Hello,” which will
     *  be counted as 6 since we don’t count the double quotes but will
     *  count the comma, but that is OK as there should not be many words
     *  in that category.
     *
     *  For any words equal to or larger than the last index of the `counts`
     *  array, count them as the largest size represented in the counts array.
     *
     * @param resource  The resource representing the file with the data.
     * @param counts    Holds how many words have been seen of the length
     *                  matching the index into `counts`.
     * @return `counts` with the updated word counts.
     */
    public void countWordLengths (FileResource resource, int[] counts) {

    }

    /** @return the index position of the largest element in `values`.
     * @param values    the data to examine for the largest element
     */
    public int indexOfMax (int[] values) {
        int maxIdx = 0;

        return maxIdx;
    }
}
