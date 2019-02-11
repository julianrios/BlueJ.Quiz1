
public class LoopFun
{

    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number){
        if(number == 0) {
            return 1;
        } else {
            // returns number * number - 1 until number is 0 and multiplies all the returning values
            return number * factorial(number -1);
        }
    }

    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {
        String acronym = "";
        // splits the sentence by spaces and returns them into an array
        String[] split = phrase.split("\\s+");
        // loop to get the first char of each word
        for(int i=0; i < split.length; i++) {
            // System.out.println(split[i].charAt(0));
            acronym += split[i].charAt(0);
        }
        return acronym.toUpperCase();
    }


    /**
     * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
     * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
     * at the end of the alphabet, it will wraps around.
     * For example:
     *  'a' => 'd'
     *  'w' => 'z'
     *  'x' => 'a'
     *  'y' => 'b'
     * @param word
     * @return the encrypted string by shifting each character by three character
     */
    public String encrypt(String word) {
        /*String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if(alphabet.charAt(i)==word.charAt(j)) {
                    encrypted = word.replace(word.charAt(j), alphabet.charAt(i+3));
                    System.out.println(word.charAt(j));
                    System.out.println(alphabet.charAt(i+3));
                    System.out.println(encrypted);
                    break;
                } else if(i == 23) {
                    encrypted+=word.replace(word.charAt(j), alphabet.charAt(0));
                } else if(i == 24) {
                    encrypted+=word.replace(word.charAt(j), alphabet.charAt(1));
                } else if(i == 25) {
                    encrypted+=word.replace(word.charAt(j), alphabet.charAt(3));
                }
            }*/
            // a class that allows string to be mutable
            String encrypted = "";
            for (int i=0;i<word.length(); i++) {
                  char c = (char)(word.charAt(i) + 3);
                  if(c > 'z'){
                        // if c is at the end of the alphabet 
                        // subtract the value of c to (26 minus - the shift) 
                        // will move back to the beginning of the alphabet
                        encrypted+= (char)(word.charAt(i)-(26-3));
                  } else {
                        // if not at the end shift 3
                        encrypted+= (char)(word.charAt(i) + 3);
                  }
            }
            System.out.println(encrypted);
            return encrypted;
      }  
}

