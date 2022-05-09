class CorrespondingNodeValue {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(cloned);
        
        while (!queue.isEmpty()) {
            int n = queue.size();
            
            for (int i = 0; i < n; i++) {
                TreeNode currentNode = queue.poll();
                if (currentNode.val == target.val)
                    return currentNode;
                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null) 
                    queue.offer(currentNode.right);
            }
        }
        return null;        
    }
}
