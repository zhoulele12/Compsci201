public class Totality {
    public int sum(int[] a, String stype) {
        int size = a.length;
        int even_sum = 0;
        int odd_sum = 0;
        for (int i=0; i < size; i++){
            if (i%2==0){
                even_sum += a[i];
            }
            else{
                odd_sum += a[i];
            }
        }
        if (stype.equals("odd")){
            return odd_sum;
        }
        else if (stype.equals("even")){
            return even_sum;
        }
        else{
            return odd_sum+even_sum;
        }
    }
}
