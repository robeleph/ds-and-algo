class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        int count = 0;
        while(current != null && count < 2){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next != null){
            head.next = swapPairs(next);
        }
        return prev;
    }
}
