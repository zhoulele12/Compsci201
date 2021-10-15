import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class ManyMany {
    public String[] filter(String[] data){
        String[] ret = new String[data.length];
        for(int i=0;i< data.length;i++){
            ret[i] = analyze(data[i]);
        }
        return ret;
    }

    public String analyze(String datum){

        String[] arr = datum.split(" ");
        TreeSet<String> uni = new TreeSet<>();
        for(String word:arr){
            int count = Collections.frequency(Arrays.asList(arr),word);
            if(count>1){
                uni.add(word);
            }
        }
        if(uni.size()!=0){
            return String.join(" ",uni);
        }else{
            return "";
        }

    }
}