package INFLEARN.Practice.BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hazel
 */

class Node {
    int data;

    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}

public class BinaryTree {
    //각 레벨의 숫자를 각각 출력하기

    Node root;

    public void BFS(Node root) {
        //현재의 레벨
        int level = 0;
        //큐 생성하고 넣기
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            //현재 레벨의 큐의 사이즈 확인
            int len = q.size();
            System.out.print(level + " : ");
            for (int i = 0; i < len; i++) {
                //꺼내서 이 현재 노드와 연결된 노드 추가
                Node currntNode = q.poll();
                System.out.print(currntNode.data + " ");
                if (currntNode.lt != null) {
                    q.add(currntNode.lt);
                }
                if (currntNode.rt != null) {
                    q.add(currntNode.rt);
                }
            }

            System.out.println();
            level++;
        }
    }

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        t.root = new Node(1);
        t.root.lt = new Node(2);
        t.root.rt = new Node(3);
        t.root.lt.lt = new Node(4);
        t.root.lt.rt = new Node(5);
        t.root.rt.lt = new Node(6);
        t.root.rt.rt = new Node(7);
        t.BFS(t.root);
    }
}
