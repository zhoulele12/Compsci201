import java.util.ArrayList;
import java.util.Arrays;

public class Follower {
    public int[] follows(String[] words) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            String[] subarray = Arrays.copyOfRange(words, i+1, words.length);
            if(Arrays.asList(subarray).contains(words[i])){
                temp.add(i);
            }
        }
        int[] ret = new int[temp.size()];
        for(int j = 0;j<temp.size();j++){
            ret[j] = temp.get(j);
        }
        return ret;
    }
}