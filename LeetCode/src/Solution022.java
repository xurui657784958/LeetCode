public class Solution022 {
    public static void main(String[] args){
        List listNode = new List();
        listNode.addNode("a");
        listNode.addNode("b");
        listNode.addNode("a");
        listNode.addNode("b");
        listNode.addNode("a");
        System.out.println(new Solution022().isHuiwen(listNode.head));
    }

    public boolean isHuiwen(ListNode  head) {
        ListNode listNode = findMiddleNode(head);
        listNode = reverse(listNode);
        while (listNode != null){
            if (! listNode.val.equals(head.val)){
                return false;
            }
            listNode = listNode.next;
            head = head.next;
        }
        return true;
    }

    public ListNode findMiddleNode(ListNode  head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast.next == null){
            return slow.next;
        }else {
            return slow.next;
        }
    }

    public ListNode reverse(ListNode head){
        ListNode temp = null;
        while (head !=null){
            ListNode p = head.next;
            head.next = temp;
            temp = head;
            head = p;
        }
        return temp;
    }
}
