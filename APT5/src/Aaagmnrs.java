import java.sql.Array;
import java.util.*;

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        ArrayList<String> list = new ArrayList<>();
        list.add(phrases[0]);
        for(int i =1;i<phrases.length;i++){
            boolean noAnagram = true;
            for(int j = 0;j<list.size();j++){
                if(isAnagram(list.get(j),phrases[i])){
                    noAnagram = false;
                    break;
                }
            }
            if(noAnagram){
                list.add(phrases[i]);
            }

        }

        return list.toArray(new String[0]);

    }
    public boolean isAnagram(String a,String b){
        a = a.replaceAll(" ","");
        b = b.replaceAll(" ","");
        char[] a_arr = a.toLowerCase().toCharArray();
        char[] b_arr = b.toLowerCase().toCharArray();
        Arrays.sort(a_arr);
        Arrays.sort(b_arr);
        return Arrays.equals(a_arr,b_arr);
    }
}


