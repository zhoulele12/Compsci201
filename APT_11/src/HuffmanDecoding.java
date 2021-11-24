
public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {
        // fill in code here
        String ret = "";
        int pointer = 0;
        char[] chrs = archive.toCharArray();
        String temp = "";
        while(pointer<archive.length()){
            temp += chrs[pointer];
            for(int i=0;i<dictionary.length;i++){
                if(dictionary[i].equals(temp)){
                    ret += (char) (65+i);
                    temp = "";
                    break;
                }
            }
            pointer+=1;
        }
        return ret;
    }
}