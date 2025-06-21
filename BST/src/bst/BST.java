
package bst;


public class BST {
    private Node root;

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, int data) {
        if (current == null) return new Node(data);
        if (data < current.data)
            current.left = insertRecursive(current.left, data);
        else if (data > current.data)
            current.right = insertRecursive(current.right, data);
        return current;
    }

    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(Node current, int data) {
        if (current == null) return false;
        if (data == current.data) return true;
        if (data < current.data)
            return searchRecursive(current.left, data);
        else
            return searchRecursive(current.right, data);
    }

    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private Node deleteRecursive(Node current, int data) {
        if (current == null) return null;

        if (data < current.data) {
            current.left = deleteRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = deleteRecursive(current.right, data);
        } else {
            if (current.left == null) return current.right;
            else if (current.right == null) return current.left;

            current.data = findMin(current.right);
            current.right = deleteRecursive(current.right, current.data);
        }
        return current;
    }

    public int findMin() {
        if (root == null) throw new RuntimeException("Tree is empty");
        return findMin(root);
    }

    private int findMin(Node current) {
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findMax() {
        if (root == null) throw new RuntimeException("Tree is empty");
        return findMax(root);
    }

    private int findMax(Node current) {
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public void inOrderTraversal() {
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(Node current) {
        if (current != null) {
            inOrderRecursive(current.left);
            System.out.print(current.data + " ");
            inOrderRecursive(current.right);
        }
    }

    public void preOrderTraversal() {
        preOrderRecursive(root);
        System.out.println();
    }

    private void preOrderRecursive(Node current) {
        if (current != null) {
            System.out.print(current.data + " ");
            preOrderRecursive(current.left);
            preOrderRecursive(current.right);
        }
    }

    public void postOrderTraversal() {
        postOrderRecursive(root);
        System.out.println();
    }

    private void postOrderRecursive(Node current) {
        if (current != null) {
            postOrderRecursive(current.left);
            postOrderRecursive(current.right);
            System.out.print(current.data + " ");
        }
    }
}