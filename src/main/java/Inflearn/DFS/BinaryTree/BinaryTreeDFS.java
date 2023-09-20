package Inflearn.DFS.BinaryTree;


/**
 * @author hazel
 */

class Node {
    //데이터 값
    int data;
    //왼,  오 자식의 노 드주소
    //node 라는 클래스의 객체 주소를 저장
    Node lt, rt;

    //생성자
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class BinaryTreeDFS {
    Node root;

    //7-5. 이진트리순회 (Depth-First Search) - 재귀를 활용
    public void DFS(Node root) {
        //DFSMain의 인스턴스 메서드
        if (root == null) {
            //맨 밑 노드
            return;
        } else {
            //전위순회 출력
            System.out.print(root.data + " ");
            DFS(root.lt);
            //중위순회 출력
            System.out.print(root.data + " ");
            DFS(root.rt);
            //후위순회 출력
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        // DFSMain class 객체, 그리고 이 안의 객체안에 root라는 변수가 존재 (node라는 클래스의 객체 주소를 저장하고 있는 변수)
        BinaryTreeDFS tree = new BinaryTreeDFS();

        //이진 트리 만들기
        //new로 객체를 생성하고 생긴 주소값을 tree.root랑 연결
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
