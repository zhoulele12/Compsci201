import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TxMsg{

    public String getMessage(String original){
        String[] words = original.split(" ");
        String[] ret = new String[words.length];
        for(int i=0;i<words.length;i++){
            ret[i] = convert(words[i]);
        }

        return String.join(" ",ret);
    }
    public String convert(String word){
        char[] chars = word.toCharArray();
        String ret = "";
        boolean flag = true;
        for(char ch:chars){
            if(!isVowel(ch)){
                flag = false;
                break;
            }
        }
        if(flag){
            return String.valueOf(chars);
        }

        if(!isVowel(chars[0])){
            ret += String.valueOf(chars[0]);
        }
        for(int i=1;i<chars.length;i++){
            if(!isVowel(chars[i])) {
                if (isVowel(chars[i-1])) {
                    ret += String.valueOf(chars[i]);
                }
            }
        }

        return ret;
    }


    public boolean isVowel(char letter){
        char[] vowels = {'a','e','i','o','u'};
        boolean found = false;
        for(char chr:vowels){
            if (letter == chr){
                found = true;
                break;
            }
        }
        return found;
    }
}
