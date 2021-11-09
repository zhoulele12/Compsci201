import java.util.TreeSet;

public class UniqueTreeValues {
    TreeSet<Integer> mySet = new TreeSet<>();
    public int[] unique(TreeNode root) {
        add(root);
        int[] ret = new int[mySet.size()];
        int count = 0;
        for(Integer i:mySet){
            ret[count] = i;
            count++;
        }
        return ret;
    }
    public void add(TreeNode tree){
        if(tree==null){
            return;
        }
        mySet.add(tree.info);
        add(tree.left);
        add(tree.right);
    }
}
