package Inflearn.Practice.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author hazel
 */


public class ShortestDistance {
    //트리에서의 말단 노드까지의 가장 짧은 경로
    Node root;

    public int solution(Node root) {
        int level = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node node = q.poll();
                if (node.lt == null && node.rt == null) {
                    return level;
                }
                q.add(node.lt);
                q.add(node.rt);
            }
            level++;

        }

        return level;
    }

    public static void main(String[] args) {
        ShortestDistance t = new ShortestDistance();

        t.root = new Node(1);
        t.root.lt = new Node(2);
        t.root.rt = new Node(3);
        t.root.lt.lt = new Node(4);
        t.root.lt.rt = new Node(5);

        System.out.println(t.solution(t.root));


    }
}
