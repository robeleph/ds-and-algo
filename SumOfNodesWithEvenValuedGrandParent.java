class Pair {
    TreeNode node;
    TreeNode parent;
    TreeNode grandParent;
    
    Pair (TreeNode node, TreeNode parent, TreeNode grandParent) {
        this.node = node;
        this.parent = parent;
        this.grandParent = grandParent;
    }
}
class SumOfNodesWithEvenValuedGrandParent {
    public int sumEvenGrandparent(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, null, null));
        int sum = 0;
        int level = 1;
        
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Pair currentNode = queue.poll();
                if (level >= 3) {
                    if (currentNode.grandParent.val % 2 == 0){
                        sum += currentNode.node.val;
                    }
                }
                if (currentNode.node.left != null) {
                    if (level == 1) {
                        queue.offer(new Pair(currentNode.node.left, currentNode.node,                                       null));  
                    } else {
                        queue.offer(new Pair(currentNode.node.left, currentNode.node,                                       currentNode.parent));
                    }
                }
                if (currentNode.node.right != null) {
                    if (level == 1) {
                        queue.offer(new Pair(currentNode.node.right, currentNode.node,                                       null));  
                    } else {
                        queue.offer(new Pair(currentNode.node.right, currentNode.node,                                       currentNode.parent));
                    }
                }    
            }
            level++;
        }
        return sum;
    }
}
