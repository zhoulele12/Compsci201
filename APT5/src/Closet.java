import java.util.Arrays;
import java.util.TreeSet;

public class Closet {
    public String anywhere(String[] list) {
        TreeSet<String> set = new TreeSet<>();
        for(String word:list){
            set.addAll(Arrays.asList(word.split(" ")));
        }
        return String.join(" ",set);
    }
}