public class ListMutation {
    public ListNode alter(ListNode list) {

        while(list!=null&&list.info%2==1){
            list = list.next;
        }
        if(list==null){
            return null;
        }else{
            ListNode ret = new ListNode(list.info,new ListNode(list.info,null));
            ListNode probe = ret.next;
            list = list.next;
            while(list!=null){
                if(list.info%2==0){
                    probe.next = new ListNode(list.info,new ListNode(list.info,null));
                    probe = probe.next.next;
                }
                list = list.next;
            }
            return ret;
        }
    }
}