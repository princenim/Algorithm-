package main.INFLEARN.Practice.DFS;

/**
 * @author hazel
 */


//노드 클래스
class Node {
    int data = 0;
    Node lt, rt;

    //생성자
    public Node(int val) {
        data = val;
        lt = rt = null;
    }

}


public class BinaryTree {
    Node root;

    public void DFS(Node root) {
        if (root == null) {
        } else {
            //System.out.println(root.data);
            DFS(root.lt);
            //System.out.println(root.data);
            DFS(root.rt);
            //System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();

        //이진 트리 만들기
        t.root = new Node(1);
        t.root.lt = new Node(2);
        t.root.rt = new Node(3);
        t.root.lt.lt = new Node(4);
        t.root.lt.rt = new Node(5);
        t.root.rt.lt = new Node(6);
        t.root.rt.rt = new Node(7);

        //1번 노드를 보낸다고 생각
        t.DFS(t.root);
    }
}
