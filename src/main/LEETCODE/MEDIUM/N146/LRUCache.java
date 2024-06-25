package main.LEETCODE.MEDIUM.N146;

import java.util.HashMap;

/**
 * 146. LRU Cache, https://leetcode.com/problems/lru-cache/description/, 구현
 *
 * @author hazel
 */
public class LRUCache {

    int capacity;//용량
    HashMap<Integer, Node> linkedList; //Key가 페이지 번호
    Node head, tail;

    public LRUCache(int capacity) { //생성자
        this.capacity = capacity;
        this.linkedList = new HashMap<>();
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.pre = head;
    }

    //맨 앞 노드 삭제
    public int deleteNode() {
        Node delete = head.next; //삭제할 노드(맨 앞 노드)
        head.next = delete.next;
        delete.next.pre = head;
        return delete.key;
    }

    public int get(int key) {
        if (linkedList.containsKey(key)) {
            moveToTail(linkedList.get(key));
            return linkedList.get(key).val;
        } else {
            return -1;//없을떄
        }
    }

    public void put(int key, int value) {
        if (linkedList.containsKey(key)) {
            //키가 존재하면 tail로 이동
            linkedList.get(key).val = value;
            moveToTail(linkedList.get(key));
        } else {
            //키가 없으면
            //1. 용량이 차있으면 삭제하고 추가
            if (linkedList.size() == capacity) {//이미 찼으면 마지막꺼 삭제하고 추가
                linkedList.remove(deleteNode());
            }
            //추가
            Node node = new Node(key, value);
            linkedList.put(key, node);
            moveToTail(node);
        }
    }

    //꼬리 전 이동
    public void moveToTail(Node node) {
        if (node.pre != null) { //이전 노드가 있을때 먼저 내 자신을 삭제
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        //나를 tail이전으로 이동
        Node dummy = tail.pre; //tail의 이전노드를 dummy라고 생각하기

        dummy.next = node;
        node.pre = dummy;
        tail.pre = node;
        node.next = tail;
    }

    class Node {

        int key;
        int val;
        Node pre;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.pre = null;
            this.next = null;
        }
    }
}
