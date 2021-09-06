import java.util.Arrays;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        for(int i=0;i<orders.length;i++){
            if(canMake(available,orders[i])){
                return i;
            }
        }

        return -1;
    }
    public boolean canMake(String[] available, String sandwich){
        boolean flag = true;
        String[] ingredients = sandwich.split(" ");
        for(String ingredient:ingredients){
            if(!Arrays.asList(available).contains(ingredient)){
                flag = false;
                break;
            }
        }

        return flag;


    }
}
