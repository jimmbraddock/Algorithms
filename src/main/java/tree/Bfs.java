package tree;

import java.util.List;

import javax.swing.tree.TreeNode;

public class Bfs {

  public static List<Node> find(String value, Node tree) {
    return null;
  }

  public static void main(String[] args) {

    Node root = new Node(null, "root");
    Node n1 = new Node(root, "1");
    Node n2 = new Node(root, "2");
    Node n3 = new Node(root, "3");
    Node n11 = new Node(n1, "11");
    Node n12 = new Node(n1, "12");
    Node n21 = new Node(n2, "21");
    Node n22 = new Node(n2, "22");
    Node n111 = new Node(n11, "111");
    Node n121 = new Node(n12, "121");
    Node n1111 = new Node(n111, "1111");
    Node n1112 = new Node(n111, "1112");
    Node n11111 = new Node(n1111, "11111");
    Node n11112 = new Node(n1111, "11112");
    Bfs.find("11112", root);
  }
}
