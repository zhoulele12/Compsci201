import java.util.HashMap;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {
        int count = 0;
        HashMap<Character,Integer> headline_map = new HashMap<>();
        for(String headline:headlines){
            analyze(headline,headline_map);
        }
        for(String message:messages){
            if(message.trim().isEmpty()){
                count +=1;
                continue;
            }
            boolean flag = true;
            HashMap<Character,Integer> message_map = new HashMap<>();
            analyze(message,message_map);
            for(char k:message_map.keySet()){
                if(!headline_map.containsKey(k) || message_map.get(k)>headline_map.get(k)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count +=1;
            }
        }

        return count;
    }

    public void analyze (String sentence,HashMap<Character,Integer> map){
        char[] chars = sentence.trim().toLowerCase().toCharArray();
        for(char k:chars){
            map.putIfAbsent(k,0);
            map.put(k,map.get(k)+1);
        }
    }
}
