import java.util.ArrayList;
import java.util.Arrays;

public class PairDown {
    public int[] fold(int[] list) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<list.length-1;i+=2){
            temp.add(list[i]+list[i+1]);
        }
        if(list.length%2==1){
            temp.add(list[list.length-1]);
        }
        int[] ret = new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            ret[i] = temp.get(i);
        }
        return ret;
    }
}