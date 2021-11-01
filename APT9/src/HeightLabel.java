public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        // replace with working code
        if(t==null) return null;
        TreeNode ret = new TreeNode(0,
                rewire(t.left),
                rewire(t.right));
        int lh = 0;
        int rh = 0;
        if(ret.left!=null){lh=ret.left.info;}
        if(ret.right!=null){rh=ret.right.info;}
        int height = Math.max(lh,rh) + 1;
        ret.info = height;
        return ret;
    }

}