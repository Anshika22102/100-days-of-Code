class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode [] result = new ListNode[k];
        int listLength = 0;
        ListNode iter = root;
        while(iter != null) {
            listLength++;
            iter = iter.next;
        }
        int eachLength = listLength / k;
        int extraLength = listLength % k;
        for (int i=0; i<k; i++) {
            ListNode head = root;
            ListNode prev = root;
            if (i < extraLength) {
                prev = root;
                root = root.next;
            }
            for (int j=0; j<eachLength && root != null; j++) {
                prev = root;
                root = root.next;
            }
            if (prev != null) {
                prev.next = null;
            }
            result[i] = head; 
        }
        return result;
    }
}
