import java.util.HashMap;

public class IsomorphicWords {
    public int countPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j< words.length;j++){
                if(isIsomorphic(words[i], words[j])){
                    count+=1;
                }
            }
        }
        return count;
    }
    public boolean isIsomorphic(String word1, String word2){
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for(int i=0;i<word1.length();i++){
            map1.putIfAbsent(word1.toCharArray()[i],word2.toCharArray()[i]);
            if(map1.get(word1.toCharArray()[i])!=word2.toCharArray()[i]){
                return false;
            }
            map2.putIfAbsent(word2.toCharArray()[i],word1.toCharArray()[i]);
            if(map2.get(word2.toCharArray()[i])!=word1.toCharArray()[i]){
                return false;
            }
        }
        return true;

    }
}