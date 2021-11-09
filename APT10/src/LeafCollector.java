import java.util.ArrayList;

public class LeafCollector {
    ArrayList<String> ret = new ArrayList<>();
    public String[] getLeaves(TreeNode tree) {



        return null;
    }
    private void collectAndRemove(TreeNode root){
        if(isLeaf(root.left)){

        }
    }

    private boolean isLeaf(TreeNode t){
        return t.left==null&&t.right==null;
    }
}
