import java.util.HashMap;

public class OverEnroll {
    public String[] popular(String[] data) {
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for(String entry:data){
            String[] arr = entry.split(":");
            map.putIfAbsent(arr[0],0);
            map.put(arr[0],map.get(arr[0])+Integer.parseInt(arr[2]));
        }
        int min = 99999999;
        String min_entry = "";
        int max = 0;
        String max_entry = "";
        for(String key:map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                max_entry = key;
            }
            if(map.get(key)<min){
                min = map.get(key);
                min_entry = key;
            }
        }
        String[] ret = new String[2];
        ret[0] = String.format("%s:%d",max_entry,max);
        ret[1] = String.format("%s:%d",min_entry,min);
        return ret;
    }
}