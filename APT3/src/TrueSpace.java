public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long clusters = 0;
        for(int size:sizes){
            double size_double = size;
            clusters += Math.ceil(size_double/clusterSize);
        }
        long ret = clusters*clusterSize;
        return ret;
    }
}