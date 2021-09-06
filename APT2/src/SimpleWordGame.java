import java.util.Arrays;
import java.util.HashSet;

public class SimpleWordGame {
    public int points (String[] player, String[] dictionary){
        int score = 0;
        HashSet<String> player_words = new HashSet<>(Arrays.asList(player));
        HashSet<String> dict_words = new HashSet<>(Arrays.asList(dictionary));
        HashSet<String> copy = new HashSet<>(player_words);
        copy.retainAll(dict_words);
        for(String s : copy){
            score += s.length()*s.length();
        }
        return score;

        }
    }
