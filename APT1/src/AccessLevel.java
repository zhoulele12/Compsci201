public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
//        int num_user = rights.length;
        String ret="";
        for(int a:rights){
            if(a>=minPermission){
                ret += "A";
            } else{
                ret += "D";
            }
        }
        return ret;
    }
}
