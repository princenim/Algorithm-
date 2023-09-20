package INFLEARN.BFS.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hazel
 */

class Node {
    //데이터 값
    int data;
    //왼, 오 자식의 노드 주소
    Node lt, rt;

    //생성자
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class BinaryTreeBFS {
    //7-7. 이진 트리 레벨 탐색 (Breadth-First Search)

    Node root;

    public void BFS(Node root) {

        //스택 생성
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);

        //레벨(몇번만에 그 거리를 가느냐)
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + "  : ");
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                //출력하고 이 노드와 연결된 자식을 스택에  다시 넣기
                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            //for문이 끝났다는 거는 하나의 레벨이 끝났다는 의미
            L++;
            System.out.println();

        }
    }
    //즉, 레벨 별로 for문을 돌면서 출력하고 출력한 값의 자식 노드를 다시 스택에 넣기

    public static void main(String[] args) {
        // BinaryTreeBFS class 객체, 그리고 이 안의 객체안에 root라는 변수가 존재
        BinaryTreeBFS tree = new BinaryTreeBFS();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.BFS(tree.root);


    }
}
