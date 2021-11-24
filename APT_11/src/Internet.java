import java.util.*;

public class Internet {
    public int articulationPoints(String[] routers) {
        int count = 0;
        for(int i=0;i<routers.length;i++){
            HashMap<Integer, ArrayList<Integer>> map = createMap(routers,i);
            int connected_components = count(map);
            if(connected_components>=2){
                count+=1;
            }
        }
        return count;
    }

    private HashMap<Integer, ArrayList<Integer>> createMap(String[] routers, int remove) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < routers.length; i++) {
            if (i != remove) {
                map.putIfAbsent(i, new ArrayList<>());
                String[] digits = routers[i].split(" ");
                for (String digit : digits) {
                    Integer router = Integer.valueOf(digit);
                    if (router != remove) {
                        map.get(i).add(router);
                    }
                }
            }
        }
        return map;
    }

    private int count(HashMap<Integer, ArrayList<Integer>> map){
        int count = 0;
        HashSet<Integer> visited = new HashSet<>();
        for(Map.Entry<Integer,ArrayList<Integer>> entry:map.entrySet()){
            if(!visited.contains(entry.getKey())){
                visited.clear();
                count+=1;
                //since we dont care about exact numbers
                if(count==2){
                    return count;
                }
                Queue<Integer> queue = new LinkedList<>();
                queue.add(entry.getKey());
                while(!queue.isEmpty()){
                    int process = queue.remove();
                    visited.add(process);
                    for(int element:map.get(process)){
                        if(!visited.contains(element)){
                            queue.add(element);
                            visited.add(element);
                        }
                    }
                }

            }
        }
        return count;
    }
}