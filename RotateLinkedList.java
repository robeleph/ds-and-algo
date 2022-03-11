class RotateLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        ListNode tail = head;
        int length = 0;
        
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        length++;
        tail.next = head;
        tail = head;
        int pivotPoint = length - (k % length);
        
        while (pivotPoint-- > 1) {
            tail = tail.next;
        }
        
        head = tail.next;
        tail.next = null;
        return head;
    }
}
