class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null) {
            if (curr.left == null) {
                result.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode pred = curr.left;

                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    pred.right = curr;  // create thread
                    curr = curr.left;
                } else {
                    pred.right = null;  // remove thread
                    result.add(curr.val);
                    curr = curr.right;
                }
            }
        }

        return result;
    }
}