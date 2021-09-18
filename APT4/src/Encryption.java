import java.util.HashMap;

public class Encryption {
    public String encrypt(String message){
        char current = 'a';
        String ret = "";
        HashMap<Character,Character> map= new HashMap<>();
        for(char chr:message.toCharArray()){
            if(!map.containsKey(chr)){
                map.put(chr,current);
                current+=1;
            }
            ret += map.get(chr);

        }
        return ret;
    }
}