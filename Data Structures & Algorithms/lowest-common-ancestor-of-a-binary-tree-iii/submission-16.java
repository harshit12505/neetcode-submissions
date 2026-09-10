/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Node ptr1 = p;
        Node ptr2 = q;

        while(ptr1 != ptr2){
            if(ptr1.parent != null){
                ptr1 = ptr1.parent;
            }
            else
                ptr1 = q;
            if(ptr2.parent != null){
                ptr2 = ptr2.parent;
            }
            else
                ptr2 = p;
        }

        return ptr1;
    }
}