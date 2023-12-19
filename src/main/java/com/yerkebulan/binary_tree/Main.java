package com.yerkebulan.binary_tree;

public class Main {
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(new Node(5));
    tree.insert(new Node(1));
    tree.insert(new Node(9));
    tree.insert(new Node(2));
    tree.insert(new Node(7));
    tree.insert(new Node(3));
    tree.insert(new Node(6));
    tree.insert(new Node(4));
    tree.insert(new Node(8));
    tree.remove(4);
    tree.display();

    System.out.println(tree.search(3));


  }
}
