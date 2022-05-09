import java.util.*;

class BFS {
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> breadthFirstSearch(List<String> array) {
      Queue<Node> queue = new LinkedList<Node>();
			queue.add(this);
			while(!queue.isEmpty()) {
				Node currentNode = queue.poll();
				array.add(currentNode.name);
				queue.addAll(currentNode.children);
			}
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
