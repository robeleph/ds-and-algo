import java.util.*;

class InvertBinaryTree {
  public static void invertBinaryTree(BinaryTree tree) {
		if (tree == null) return;
		swap(tree);
		invertBinaryTree(tree.left);
		invertBinaryTree(tree.right);	
	}
	public static void swap(BinaryTree tree) {
		BinaryTree temp = tree.right;
		tree.right = tree.left;
		tree.left = temp;
	}

  static class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
    }
  }
}
