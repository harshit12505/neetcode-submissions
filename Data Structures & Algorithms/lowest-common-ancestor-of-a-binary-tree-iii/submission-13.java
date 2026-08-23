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
        Node pos1 = p;
        Node pos2 = q;

        while(pos1 != pos2){
            if(pos1.parent == null)
                pos1 = q;
            else{
                pos1 = pos1.parent;
            }
            if(pos2.parent == null)
                pos2 = p;
            else{
                pos2= pos2.parent;
            }
            

        }
        return pos2;
    }
}