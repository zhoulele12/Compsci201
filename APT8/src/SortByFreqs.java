import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
//        HashMap<String,Integer> storage = new HashMap<>();
        TreeMap<String,Integer> storage = new TreeMap<>();
        for(String word:data){
            storage.putIfAbsent(word,0);
            storage.put(word, storage.get(word)+1);
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(storage.entrySet());

        Collections.sort(list,Map.Entry.comparingByValue(Comparator.reverseOrder()));

        String[] ret = new String[list.size()];
        for(int i =0;i<list.size();i++){
            ret[i] = list.get(i).getKey();
        }
        return ret;
    }
}

