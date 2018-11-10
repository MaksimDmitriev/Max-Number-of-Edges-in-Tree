package com.app;

public class Solution {

    int getMaxHeight(Node n) {
        if (n == null) {
            return -1;
        }
        return Math.max(getMaxHeight(n.left), getMaxHeight(n.right)) + 1;
    }

    static class Node {
        Node left;
        Node right;
        int val;

        Node(int val) {
            this.val = val;
        }
    }
}
