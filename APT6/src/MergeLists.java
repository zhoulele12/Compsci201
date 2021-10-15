public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {
        ListNode ret = new ListNode(a.info,null);
        ListNode tail = ret;
        a = a.next;
        int count = 0;
        while(b!=null){
            if(count%2==0){
                tail.next = new ListNode(b.info,null);
                tail = tail.next;
                b = b.next;
                count+=1;
            } else {
                tail.next = new ListNode(a.info,null);
                tail = tail.next;
                a = a.next;
                count+=1;
            }

        }
        return ret;
    }
}