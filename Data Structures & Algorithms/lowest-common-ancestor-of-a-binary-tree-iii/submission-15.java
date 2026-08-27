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
        Node temp1 = p;
        Node temp2 = q;
        while(temp1 != temp2){
            if(temp1.parent == null){
                temp1 = q;
            }
            else
                temp1 = temp1.parent;

            if(temp2.parent == null)
                temp2 = p;
            else
                temp2 = temp2.parent;
        }
        return temp1;
    }
}