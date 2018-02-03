package Tree_Operations;

public class BinaryTree {
Node root;

    public BinaryTree() {
       root=null;

    }
    public void preOrder(Node node){
        if (node==null)
            return;

        System.out.print(node.key+" ");
         preOrder(node.left);
         preOrder(node.right);

        }
    public void postOrder(Node node){
        if (node==null)
            return;


        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key+" ");
    }
    void preOrder() {
        preOrder(root);
    }
    void postOrder() {
        postOrder(root);
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
      tree.root=new Node(1);
      tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        System.out.println(" Pre preOrder traversal ");
               tree.preOrder();
        System.out.println("\n+" + "post preOrder traversal ");
               tree.postOrder();

    }
}


class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}
