package src.main.java.P001_TwoPointer;

import java.util.LinkedList;

// https://neetcode.io/problems/lowest-common-ancestor-of-a-binary-tree-iii/question?list=neetcode250
public class P016_LowestCommonAncestorOfBinaryTreeIII {

    public static void main(String[] args) {

    }

    static class Solution {

        public Node lowestCommonAncestor(Node p, Node q) {
            Node p1 = p;
            Node q1 = q;

            while (p1.val != q1.val) {
                p1 = p1.parent;
                q1 = q1.parent;

                if (p1 == null)
                    p1 = q;
                if (q1 == null)
                    q1 = p;
            }

            return p1;
        }

        public Node lowestCommonAncestorBruteForce(Node p, Node q) {
            LinkedList<Node> set = new LinkedList<>();
            while (p != null) {
                set.add(p);
                p = p.parent;
            }
            while (q != null) {
                if (set.contains(q))
                    return q;
                q = q.parent;
            }
            return null;
        }
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
}

