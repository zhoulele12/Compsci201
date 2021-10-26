import java.util.*;

public class MedalTable {
    private class Country{
        int myGold;
        int mySilver;
        int myBronze;
        String myName;

        public Country(String name){
            myName = name;
        }

        public void addGold(){
            myGold+=1;
        }
        public void addSilver(){
            mySilver+=1;
        }
        public void addBronze(){
            myBronze+=1;
        }

        public int getGold(){
            return myGold;
        }

        public int getSilver(){
            return mySilver;
        }

        public int getBronze(){
            return myBronze;
        }

        public String getName(){
            return myName;
        }
    }
    public String[] generate(String[] results) {
        TreeMap<String,Country> map = new TreeMap<>();
        for(String result:results){
            String[] temp = result.split(" ");
            map.putIfAbsent(temp[0],new Country(temp[0]));
            map.get(temp[0]).addGold();
            map.putIfAbsent(temp[1],new Country(temp[1]));
            map.get(temp[1]).addSilver();
            map.putIfAbsent(temp[2],new Country(temp[2]));
            map.get(temp[2]).addBronze();
        }
        List<Country> list = new ArrayList<>(map.values());
        Comparator<Country> gold = Comparator.comparing(Country::getGold).reversed();
        Comparator<Country> silver = Comparator.comparing(Country::getSilver).reversed();
        Comparator<Country> bronze = Comparator.comparing(Country::getBronze).reversed();
        Comparator<Country> name = Comparator.comparing(Country::getName);
        Comparator<Country> comp = gold.thenComparing(silver).thenComparing(bronze).thenComparing(name);
        Collections.sort(list,comp);
        String[] ret = new String[list.size()];
        for(int i=0;i<list.size();i++) {
            ret[i] = String.format("%s %d %d %d",
                    list.get(i).getName(),list.get(i).getGold(),list.get(i).getSilver(),list.get(i).getBronze()
            );
        }
        return ret;
    }
}
