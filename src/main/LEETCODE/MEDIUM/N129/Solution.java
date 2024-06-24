package main.LEETCODE.MEDIUM.N129;


/**
 * 129. Sum Root to Leaf
 * Numbers,https://leetcode.com/problems/sum-root-to-leaf-numbers/description/, dfs
 *
 * @author hazel
 */
class Solution {

    int answer = 0;

    public int sumNumbers(TreeNode root) { //이진트리의 root 입력
        dfs(root, 0);
        return answer;
    }

    public void dfs(TreeNode root, int sum) {

        if (root == null) { //[0,1]의 경우 오른쪽 노드가 없으므로 null이 호출되므로 return
            return;
        }

        sum = sum * 10 + root.val; //값에 10를 곱하면서 만들기

        //종료조건
        if (root.left == null && root.right == null) {
            //깊이에 도달할때마다 값 더하기
            answer += sum;
            return;
        }

        dfs(root.left, sum);
        dfs(root.right, sum);
    }


    ////////////////////////////////////////////
    //Definition for a binary tree node.
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}



