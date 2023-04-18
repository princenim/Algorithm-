package Inflearn.BFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hazel
 */


class Nodes{
    int data = 0;
    Node lt,rt;

    public Nodes(int val){
        data = val;
        lt = rt= null;
    }


}
public class ShortestDistance {
    //7-10. Tree 말단노드까지의 가장 짧은 경로 (BFS) !!!!!!

    Node root;
    public int solution(Node root){
        //1. 스택 만들기
        Queue<Node>  q = new LinkedList<>();
        q.add(root);

        int level =0;
        int len = q.size();

        for(int i =0; i < len; i ++){
            Node x = q.poll();
            //말단 노드라면 정답 리턴
            if(x.lt ==null && x.rt == null){
                return level;
            }
            if(x.lt != null){
                q.offer(x.lt);
            }
            if(x.rt != null){
                q.offer(x.rt);
            }

        }
        level++;


        return level;

    }


    public static void main(String[] args) {
        ShortestDistance t = new ShortestDistance();
        t.root= new Node(1);
        System.out.println(t.root);
        t.root.lt= new Node(2);
        t.root.rt= new Node(3);
        t.root.lt.lt= new Node(4);
        t.root.lt.rt= new Node(5);

        System.out.println(t.solution(t.root));//100이라는 주소를 넘겼다고 가정




    }
}
