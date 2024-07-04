public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static  class Tree{
        Node root;

       Tree(int data) {
           root = new Node(data);
        }
        public Tree(){
            root = null;
        }
        public Node insert(Node root,int data){
            if(root == null){
                return new Node(data);
            }
            if(data<root.data){
                root.left = insert(root.left,data);
            }
            else if(data>root.data){
                root.right = insert(root.right,data);
            }
            return root;
        }
        public void inOrder(Node node){
            if(node!=null){
                inOrder(node.left);
                System.out.print(node.data+" ");
                inOrder(node.right);

            }
           
        }
        public void preOrder(Node node){
            if(node!=null){
                System.out.print(node.data+" ");
                preOrder(node.left);
                preOrder(node.right);

            }
        }
        public void postOrder(Node node){
            if(node!=null){
                
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(node.data+" ");

            }
        }
    }
    public static void main(String[] args) {
        Tree t1 = new  Tree(8);
        t1.insert(t1.root, 6);
        t1.insert(t1.root, 9);
        t1.insert(t1.root, 5);
        t1.insert(t1.root, 3);
        t1.insert(t1.root, 10);
        t1.insert(t1.root, 4);
        t1.inOrder(t1.root);
        System.out.println();
        t1.preOrder(t1.root);







        
    }
    
}
