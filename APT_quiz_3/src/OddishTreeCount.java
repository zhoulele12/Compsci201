public class OddishTreeCount {
    public int count(TreeNode tree) {
        if(tree==null){
            return 0;
        }
        return tree.info%2+count(tree.left)+count(tree.right);
    }
}