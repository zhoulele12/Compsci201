import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc){
        String ret = "";
        int max = 1;
        for(String strand:strands){
            if(count_occurence(strand,nuc)>max ||
                    (count_occurence(strand,nuc)==max && strand.length()>ret.length())){
                max = count_occurence(strand,nuc);
                ret = strand;

            }
        }
        return ret;
    }
    /*
    public String max(String[] strands,String nuc){
        int[] occurence = new int[strands.length];
        for(int i=0;i<strands.length;i++){
            occurence[i] = count_occurence(strands[i],nuc);
        }

        List<String> candidate_strands = new ArrayList<>();
        int max = maxOf(occurence);
        if(max==0){
            return "";
        }
        for(int i=0;i<occurence.length;i++){
            if(occurence[i]==max){
                candidate_strands.add(strands[i]);
            }
        }
        Collections.sort(candidate_strands);
        return candidate_strands.get(candidate_strands.size()-1);
    } */
    public int count_occurence(String strand, String nuc){
        int count = 0;
        char[] nucleotides = strand.toCharArray();
        for(char i:nucleotides){
            if(i==nuc.charAt(0)){
                count += 1;
            }
        }

        return count;
    }
    public int maxOf(int[] occurence){
        int max = 0;
        for(int num:occurence){
            if(num>max){
                max = num;
            }
        }

        return max;
    }
}
