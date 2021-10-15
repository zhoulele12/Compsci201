public class LetterFreq {
    public String findFreqs(String[] words) {
        // write code here
        int[] storage = new int[26];
        for(String word:words){
            char[] temp = word.replaceAll(" ","").toCharArray();
            for(char chr:temp) {
                if (chr - 97 >= 0) {
                    storage[chr - 97] += 1;
                }
            }
        }
        String[] ret = new String[26];
        for(int i =0;i<26;i++){
            ret[i] = Integer.toString(storage[i]);
        }
        return String.join(":",ret);
    }
}