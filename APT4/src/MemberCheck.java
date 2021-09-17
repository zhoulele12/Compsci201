import java.util.*;

public class MemberCheck {
    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3) {

        List<String> dishonest = new ArrayList<>();

        HashMap<String,Integer> occurence = new HashMap<String,Integer>();

        analyze(club1,occurence);
        analyze(club2,occurence);
        analyze(club3,occurence);

        for(String name:occurence.keySet()){
            if(occurence.get(name)>1){
                dishonest.add(name);
            }
        }
        String[] ret = dishonest.toArray(new String[0]);
        Arrays.sort(ret);

        return ret;
    }
    public void analyze(String[] names,HashMap<String,Integer> map){
        HashSet<String> set = new HashSet<>(Arrays.asList(names));
        for(String member:set){
            map.putIfAbsent(member,0);
            map.put(member,map.get(member)+1);
        }
    }
}