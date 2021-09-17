import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class BigWord {
    public String most(String[] sentences){
        ArrayList<String> all_words = new ArrayList<>();
        int max = 0;
        String most_word = "";
        for(String sentence:sentences){
            String[] words = sentence.split(" ");
            for(String word:words){
                all_words.add(word.toLowerCase());
            }

        }
        for(String word:all_words){
            int occurrence = Collections.frequency(all_words,word);
            if(occurrence>max){
                max = occurrence;
                most_word = word;
            }
        }
        return most_word;
    }
}
