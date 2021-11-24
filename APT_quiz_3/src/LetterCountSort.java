import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LetterCountSort {
    private class comp implements Comparator{
        @Override
        public int compare(Object o1, Object o2){
            String s1 = (String) o1;
            String s2 = (String) o2;
            int count1 = count(s1);
            int count2 = count(s2);
            if(count1==count2){
                return s1.compareTo(s2);
            }else{
                return count1-count2;
            }
        }

    }
    String[] chrs;
    public String[] sort(String[] list, String specialChars) {
        chrs = specialChars.split("");
        Arrays.sort(list,new comp());
        return list;
    }

    public int count(String word){
        int ret =0;
        String[] temp = word.split("");
        for(String chr:chrs){
            ret += Collections.frequency(Arrays.asList(temp),chr);
        }
        return ret;
    }
}