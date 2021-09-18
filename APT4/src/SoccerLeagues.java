public class SoccerLeagues {
    public int[] points(String[] matches) {
        int[] ret = new int[matches.length];
        for(int i=0;i<matches.length;i++){
            for(int j=0;j< matches.length;j++){
                char result = matches[i].toCharArray()[j];
                if(result=='W'){
                    ret[i] += 3;
                } else if(result == 'D'){
                    ret[i] += 1;
                    ret[j] += 1;
                } else if(result == 'L'){
                    ret[j] += 3;
                }
            }
        }
        return ret;
    }
}