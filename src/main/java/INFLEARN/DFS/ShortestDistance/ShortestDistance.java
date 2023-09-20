package INFLEARN.DFS.ShortestDistance;


/**
 * @author hazel
 */


class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }


}

public class ShortestDistance {
    //7-9. Tree 말단노드까지의 가장 짧은 경로 (DFS)
    //최단거리를 DFS로 풀때는 트리의 자식 노드가 꼭 2개이여야함.

    Node root;


    public int DFS(int L, Node root) {

        //말단 노드
        if (root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }

    }

    public static void main(String[] args) {
        ShortestDistance t = new ShortestDistance();

        t.root = new Node(1); //100번지라고 생각
        t.root.lt = new Node(2);
        t.root.rt = new Node(3);
        t.root.lt.lt = new Node(4);
        t.root.lt.rt = new Node(5);


        System.out.println(t.DFS(0, t.root));

    }
}
