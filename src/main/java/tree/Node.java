package tree;

import java.util.ArrayList;
import java.util.List;

class Node {
  private String value;
  private final List<Node> children = new ArrayList<>();
  private final Node parent;

  public Node(Node parent, String value) {
    this.parent = parent;
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public List<Node> getChildren() {
    return children;
  }

  public Node getParent() {
    return parent;
  }

  public void addChild(Node n) {
    this.children.add(n);
  }

}
