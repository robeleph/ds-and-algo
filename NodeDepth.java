import java.util.*;

class NodeDepth {

  public static int nodeDepths(BinaryTree root) {
    return nodeHelper(root, 0);
  }
	public static int nodeHelper(BinaryTree root, int depth){
		if(root == null) return 0;
		return depth + nodeHelper(root.left, depth + 1) + nodeHelper(root.right, depth + 1);
	}

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
