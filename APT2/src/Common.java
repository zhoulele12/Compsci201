import java.util.ArrayList;
import java.util.List;

public class Common {
    public int count(String a, String b){
        int count = 0;
        char[] a_chr = a.toCharArray();
        char[] b_chr = b.toCharArray();

        for(int i=0;i<a_chr.length;i++){
            if(contains(b_chr,a_chr[i])!=-1){
                b_chr[contains(b_chr,a_chr[i])] = ' ';
                count += 1;
            }
        }

        return count;
    }

    public int contains(char[] characters, char target){

        for(int i = 0;i<characters.length;i++){
            if(characters[i]==target){
                return i;
            }
        }
        return -1;
    }
}
