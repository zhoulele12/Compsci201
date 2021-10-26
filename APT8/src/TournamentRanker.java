import java.util.*;

public class TournamentRanker {
    private class Person {
        String myName;
        int numWins;
        Person lost;

        public Person(String name) {
            myName = name;
            numWins = 0;
        }

        public void setLost(Person opponent) {
            lost = opponent;
        }
        public String getMyName(){
            return myName;
        }
        public int getNumWins(){
            return numWins;
        }
        public Person getLost(){
            return lost;
        }
        public void addWin(){
            numWins +=1;
        }
    }
    private class rankComp implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            Person opponent_1 = ((Person) o1).getLost();
            Person opponent_2 = ((Person) o2).getLost();
            while(opponent_1.getNumWins()-opponent_2.getNumWins()==0) {
                opponent_1 = opponent_1.getLost();
                opponent_2 = opponent_2.getLost();

            }
            return opponent_1.getNumWins() - opponent_2.getNumWins();
        }
    }
    public String[] rankTeams(String[] names, String[] lostTo) {
        TreeMap<String, Person> map = new TreeMap<>();
        for (int i = 0; i < names.length; i++) {
            map.putIfAbsent(names[i], new Person(names[i]));
        }
        for (int i = 0; i < names.length; i++) {
            if (lostTo[i].length() != 0) {
                map.get(names[i]).setLost(map.get(lostTo[i]));
                map.get(lostTo[i]).addWin();
            }
        }

        List<Person> list = new ArrayList<>(map.values());
        Comparator wins = Comparator.comparing(Person::getNumWins).reversed();
        Comparator rank = new rankComp().reversed();
        Comparator comp = wins.thenComparing(rank);
        Collections.sort(list,comp);
        String[] ret = new String[list.size()];
        for(int i=0;i<list.size();i++){
            ret[i] = list.get(i).getMyName();
        }
        return ret;
    }
}