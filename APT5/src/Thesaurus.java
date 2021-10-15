import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Thesaurus {

    public String[] edit(String[] entry) {
        if(entry.length==1){
            return entry;
        }
        String[] cur = check(entry);
        String[] next = check(cur);
        while(!Arrays.equals(cur,next)){
           cur = next;
           next = check(cur);
        }
        for(int i=0;i<cur.length;i++){
            String[] words = cur[i].split(" ");
            Arrays.sort(words);
            cur[i] = String.join(" ",words);
        }
        Arrays.sort(cur);

        return cur;

    }
    public boolean checkPair(String a,String b){
        ArrayList<String> a_temp = new ArrayList<>(Arrays.asList(a.split(" ")));
        a_temp.retainAll(Arrays.asList(b.split(" ")));
        return a_temp.size()>=2;
    }

    public String combine(String a,String b){
        TreeSet<String> ret = new TreeSet<>();
        ret.addAll(Arrays.asList(a.split(" ")));
        ret.addAll(Arrays.asList(b.split(" ")));

        return String.join(" ",ret);

    }
    public String[] check(String[] entry) {
        ArrayList<String> copy = new ArrayList<>(Arrays.asList(entry.clone()));
        for (int i = 0; i < entry.length - 1; i++) {
            for (int j = i + 1; j < entry.length; j++) {
                if (checkPair(entry[i], entry[j])) {
                    copy.add(combine(entry[i], entry[j]));
                    copy.remove(entry[i]);
                    copy.remove(entry[j]);

                    return copy.toArray(new String[0]);
                }
            }
        }

        return copy.toArray(new String[0]);
    }

}