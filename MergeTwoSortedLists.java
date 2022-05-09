class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = null;
        ListNode head = null;
        
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        
        if (l1.val > l2.val) {
            head = l2;
            l2 = l2.next;
        } else {
            head = l1;
            l1 = l1.next;
        }
        
        node = head;
        
        while (l1 != null && l2 != null) {
            if (l2.val > l1.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        if (l1 == null) node.next = l2;
        if (l2 == null) node.next = l1;
        
        return head;
    }
}
