public class CirclesCountry {
    public boolean isInside(int circle_x, int circle_y,int x,int y,int r){
        int dist_squared = (x - circle_x)*(x - circle_x) + (y - circle_y)*(y - circle_y);
        return dist_squared < r*r;
    }
    public int leastBorders(int[] x, int[] y, int[] r,
                            int x1, int y1, int x2, int y2) {
        int count = 0;
        int len = x.length;
        for(int i=0;i<len;i++){
            if(isInside(x[i],y[i],x1,y1,r[i])!=isInside(x[i],y[i],x2,y2,r[i])){
                count +=1;
            }
        }
        return count;
    }
}
