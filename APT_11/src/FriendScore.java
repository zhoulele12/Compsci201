import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FriendScore{
    public int highestScore(String[] friends){
        HashMap<Integer, ArrayList<Integer>> map = createMap(friends);
        int[] counts = new int[friends.length];
        for(Map.Entry<Integer,ArrayList<Integer>> entry:map.entrySet()){
            HashSet<Integer> visited = new HashSet<>();
            for(Integer friend: entry.getValue()){
                visited.add(friend);
                //added self
                visited.addAll(map.get(friend));
            }
            counts[entry.getKey()] = visited.size()-1;
        }
        int max = 0;
        for(int count:counts){
            if(count>max){
                max = count;
            }
        }
        return max;
    }

    private HashMap<Integer, ArrayList<Integer>> createMap(String[] friends){
        HashMap<Integer, ArrayList<Integer>> ret = new HashMap<>();

        for(int i=0;i<friends.length;i++){
            char[] temp = friends[i].toCharArray();
            for(int j=0;j<temp.length;j++){
                if(temp[j]=='Y'){
                    ret.putIfAbsent(i,new ArrayList<>());
                    ret.get(i).add(j);
                }
            }
        }
        return ret;
    }
}
