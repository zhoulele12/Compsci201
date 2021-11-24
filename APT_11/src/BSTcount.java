import java.util.HashMap;

public class BSTcount {
    HashMap<Integer,Long> map = new HashMap<>();
    public long howMany(int[] values) {
        //each value takes turn to be parent X(n-1) + X(n-2)*X(1) + X(n-3)*X(2)
        int length = values.length;
        return count(length);

    }
    private long count(int length){
        if(length==0||length==1){
            return 1;
        }
        if(length==2){
            return 2;
        }
        if(map.containsKey(length)){
            return map.get(length);
        }else{
            long ret = 0;
            for(int i=0;i<length;i++){
                ret += count(i)*count(length-i-1);
            }
            map.putIfAbsent(length,ret);
            return ret;
        }
    }
}