import java.util.ArrayList;
import java.util.List;

public class hello_world {
    public static void main(String[] args){
        List<String> arr_a = new ArrayList<>();
        for(int i=0;i<10;i++){
            arr_a.add(String.valueOf(i));
        }
        System.out.println(arr_a);
    }
}
