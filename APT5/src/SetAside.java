import java.util.Arrays;
import java.util.TreeSet;

public class SetAside {
    public String common(String[] list) {
        TreeSet<String> temp = new TreeSet<>(Arrays.asList(list[0].split(" ")));
        for(int i=1;i<list.length;i++){
            temp.retainAll(Arrays.asList(list[i].split(" ")));
        }
        return String.join(" ",temp);
    }
}