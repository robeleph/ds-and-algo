class MaxWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queueTree = new LinkedList<>();
        Queue<Integer> queueIndex = new LinkedList<>();
        queueTree.offer(root);
        queueIndex.offer(1);
        int start = 0;
        int end = 0;
        int width = 0;
        while(!queueTree.isEmpty()) {
            int n = queueTree.size();
            for (int i = 0; i < n; i++) {
                TreeNode currentNode = queueTree.poll();
                int index = queueIndex.poll();
                if (i == 0) {
                    start = index;
                }
                if (i == n - 1) {
                    end = index;
                }
                if (currentNode.left != null) {
                    queueTree.offer(currentNode.left);
                    queueIndex.offer(index * 2);
                }
                if (currentNode.right != null) {
                    queueTree.offer(currentNode.right);
                    queueIndex.offer(index * 2 + 1);
                }
               
            }
            width = Math.max(width, end - start + 1);
        }
        return width;
    }
}
