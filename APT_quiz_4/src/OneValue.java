public class OneValue {
    public int count(TreeNode tree) {
        if(tree==null){
            return 0;
        }
        if(check(tree,tree.info)) {
            return 1+ count(tree.left) + count(tree.right);
        }else{
            return count(tree.left) + count(tree.right);
        }
    }
    public boolean check(TreeNode tree,int value){
        if(tree==null){
            return true;
        }
        if(tree.info!=value){
            return false;
        }
        return check(tree.left,value)&&check(tree.right,value);
    }


}