class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        int carry = 0;
        int sum = 0;
        while(l1 != null || l2 != null){
          int v1 = l1!=null ? l1.val : 0;
          int v2 = l2!=null ? l2.val : 0;
          sum = v1 + v2 + carry;
          carry = sum / 10;
          result.next = new ListNode(sum%10);
        
          if(l1!=null) l1 = l1.next;
          if(l2!=null) l2 = l2.next;
          
          result = result.next;
        }  
         if (carry>0){  
            result.next = new ListNode(carry);
            result = result.next;
        }
        
        return head.next;
        
    }
}
