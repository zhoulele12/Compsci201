import java.util.*;

public class Starter {
    public int begins(String[] words, String first) {
        int count = 0;
        Set<String> new_set = new HashSet<String>();
        for (String a:words){
            new_set.add(a);
        }
        for (String b:new_set){
            if (b.startsWith(first)){
                count += 1;
            }
        }
        return count;
    }
}

