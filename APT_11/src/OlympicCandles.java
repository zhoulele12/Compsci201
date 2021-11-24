import java.util.*;

public class OlympicCandles{
    public int numberOfNights(int[] candles){
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int i:candles){
            pq.add(i);
        }
        while(pq.size()>count){
            count+=1;
            List<Integer> storage = new ArrayList<>();
            for(int i=0;i<count;i++){
                int candle = pq.remove();
                candle-=1;
                if(candle!=0){
                    storage.add(candle);
                }
            }
            pq.addAll(storage);
        }
        return count;
    }
}