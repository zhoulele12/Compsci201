import java.util.ArrayList;
import java.util.TreeSet;

public class AlphaLength {
    public ListNode create (String[] words) {
        TreeSet<String> set = new TreeSet<>();
        for(String word:words){
            set.add(word);
        }
        ArrayList<String> unique = new ArrayList<>(set);
        ListNode ret = new ListNode(unique.get(0).length(),null);
        ListNode tail = ret;

        for(int i=1;i<unique.size();i++) {
            tail.next = new ListNode(unique.get(i).length(),null);
            tail = tail.next;
        }
        return ret;
    }
}