/*
import javax.xml.soap.Node;
import java.MyPractice.util.List;

public class Solution001 {

*/
/*public ListNode delete(ListNode head) {
        if(head == null) return head;
        ListNode helper = new ListNode(0);
        helper.next = head;
        head = helper;
        while(head != null && head.next != null && head.next.next != null) {
            if(head.next.val == head.next.next.val) {
                int value = head.next.val;
                while(head.next != null && head.next.val == value) {
                    head.next = head.next.next;
                }
            } else {
                head = head.next;
            }
        }
        return helper.next;
    }*//*



 public ListNode delete(ListNode head){
        if(head == null){
            return head;
        }
        ListNode helpNode = new ListNode(0);
        helpNode.next = head;
        head = helpNode;
        while (head.next!=null && head.next.next!=null && head!=null){
            if(head.next.val == head.next.next.val){
                int valLock = head.next.val;
                while (valLock == head.next.next.val){
                    head.next = head.next.next;
                }

            }else {
                head = head.next;
            }

        }
        return head;
    }


 */
/*public ListNode delete(ListNode head) {
       if (head == null) {
           return null;
       }
       ListNode listNode;
       if (head.next != null && head.val == head.next.val) {
           while (head.next != null && head.val == head.next.val) {
               head = head.next;
           }
           return delete(head.next);
       } else {
           head = delete(head.next);
           return head.next;
       }
   }*//*


 */
/* public ListNode delete(ListNode head) {
      if (head == null) return null;

      if (head.next != null && head.val == head.next.val) {
          while (head.next != null && head.val == head.next.val) {
              head = head.next;
          }
          return delete(head.next);
      } else {
          head.next = delete(head.next);
      }
      return head;
  }*//*



    public static void main(String[] args){
        int[] testAarry = new int[]{1,2,3,3,4,4,5};
        List list = new List();
        for (int i : testAarry){
            list.addNode(i);
        }
        ListNode result = new Solution001().delete(list.head);
        while (result.next!=null){
            System.out.println(result.val);
            result = result.next;
            if (result.next == null){
                System.out.println(result.val);
            }
        }
    }
}
*/
