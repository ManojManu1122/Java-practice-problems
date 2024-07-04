

public class Tree {
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
    static class TreeExample{
        Node root;

        TreeExample(int data){
            root = new Node(data);
        }

        public TreeExample() {
            root = null;
        }
        
    public void insertLeft(Node parent,int data){
        Node newNode = new Node(data);
        if(parent.left == null){
            parent.left = new Node(data);
        }
        else {
        newNode.left = parent.left;
        parent.left = newNode;
    }
}
    public void insertRight(Node parent,int data){
        Node newNode = new Node(data);
        if(parent.right == null){
            parent.right = new Node(data);
        }
        else{
        newNode.right = parent.right;
        parent.right = newNode;
    }
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
        TreeExample t1 = new TreeExample(1);
        t1.insertLeft(t1.root,2);
        t1.insertRight(t1.root,3);
        t1.insertLeft(t1.root.left,4);
        t1.insertRight(t1.root.left,5);
        t1.insertLeft(t1.root.right,6);
        t1.insertRight(t1.root.right,7);
        t1.inOrder(t1.root);
        System.out.println();
        t1.preOrder(t1.root);
        
        
        
    }
    
}
