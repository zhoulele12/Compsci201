import java.util.ArrayList;

public class StringCuts {
    public String[] filter(String[] list, int minLength){
        ArrayList<String> ret = new ArrayList<>();
        for(String word:list){
            if(!ret.contains(word) && word.length()>=minLength){
                ret.add(word);
            }
        }
        return ret.toArray(new String[0]);
    }
}
