
package bst;


public class mainBST {


    public static void main(String[] args) {
      BST bst = new BST();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder: ");
        bst.inOrderTraversal(); // 20 30 40 50 60 70 80

        System.out.print("Preorder: ");
        bst.preOrderTraversal(); // 50 30 20 40 70 60 80

        System.out.print("Postorder: ");
        bst.postOrderTraversal(); // 20 40 30 60 80 70 50

        System.out.println("Min: " + bst.findMin()); // 20
        System.out.println("Max: " + bst.findMax()); // 80

        bst.delete(50); 

        System.out.print("Inorder after delete: ");
        bst.inOrderTraversal(); // 20 30 40 60 70 80
        
        
        
    }
    
}
