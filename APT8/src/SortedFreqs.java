import java.util.TreeMap;

public class SortedFreqs {
    public int[] freqs(String[] data){
        TreeMap<String,Integer> map = new TreeMap<>();
        for(String word:data){
            map.putIfAbsent(word,0);
            map.put(word,map.get(word)+1);
        }
        int[] ret = new int[map.keySet().size()];
        int count = 0;
        for(String word:map.keySet()){
            ret[count] = map.get(word);
            count +=1;
        }
        return ret;
    }
}
