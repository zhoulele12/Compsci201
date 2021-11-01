public class LevelCount {
    public int count(TreeNode t, int level) {
        // replace with working code
        if(t==null){
            return 0;
        }
        if(level!=0) {
            return count(t.left, level - 1) + count(t.right, level - 1);
        }else{
            return 1;
        }
    }
}