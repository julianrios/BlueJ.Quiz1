
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String concatenated = baseValue + valueToBeAdded;
        return concatenated;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reverse = "";
        for (int i = valueToBeReversed.length()-1; i >=0; i--) {
            reverse+= valueToBeReversed.charAt(i);
        }
        return reverse;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char middleChar;
        if(word.length()/2 ==0) {
            middleChar = word.charAt((word.length()/2));
        } else {
            middleChar = word.charAt((word.length()-1)/2);
        }
        return middleChar;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String str = "";
        for(int i = 0; i < value.length(); i++) {
            if(value.charAt(i) != charToRemove){
                str += value.charAt(i);
            }
        }
        return str;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        //lastIndexOf counts the entire string up to the last index of " " and adds 1
        // substring is inclusive so the plus one is needed to get the remaining chars for the last word
        String lastWord = sentence.substring(sentence.lastIndexOf(" ")+1);
        
        //System.out.println(sentence.lastIndexOf(" ")+1);
        return lastWord;
    }
}
