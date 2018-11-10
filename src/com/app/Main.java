package com.app;

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        Solution.Node root = new Solution.Node(1);
        root.left = new Solution.Node(2);
        root.right = new Solution.Node(3);
        root.right.right = new Solution.Node(4);

        int res = s.getMaxHeight(root);
        System.out.println(res);

        /*
                     1
                    / \
                   2   3
                        \
                         4
         */
    }
}
