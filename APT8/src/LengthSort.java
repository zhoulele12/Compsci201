import java.util.Arrays;
import java.util.Comparator;

public class LengthSort {
    public String[] rearrange(String[] value){
        Arrays.sort(value, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        return value;
    }
}
