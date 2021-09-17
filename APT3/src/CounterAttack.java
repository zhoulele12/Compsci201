import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CounterAttack {
    public int[] analyze(String str, String[] words){
        int[] ret = new int[words.length];
        String[] split = str.split(" ");
        ArrayList<String> split_list = new ArrayList<>(Arrays.asList(split));
        for(int i=0;i<words.length;i++){
            ret[i] = Collections.frequency(split_list,words[i]);
        }
        return ret;
    }
}
