/*
import java.MyPractice.util.ArrayList;
import java.MyPractice.util.Scanner;

public class ReveseNode {
        public static ListNode reverseList(ListNode head){
        if(head.getNext()==null||head.getNext().getNext()==null){
            return head;
        }
        ListNode p = head.getNext();
        ListNode q = head.getNext().getNext();
        ListNode t = null;
        while(q!=null){
            t = q.getNext();
            q.setNext(p);
            p = q;
            q = t;
        }
        head.getNext().setNext(null);
        head.setNext(p);
        return head;
    }
    public static void printLink(ListNode head) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }
        for (int i = 0 ; i <= nodes.size() - 1; i++) {
            System.out.print(nodes.get(i).val + " ");
        }
    }

    public static void printRevseLink(ListNode head, int n) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head);
            head = head.next;
        }
        for (int i = 0 ; i <= nodes.size() - 1; i++) {
            if (i == n){
                System.out.print(nodes.get(i).val + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ListNode head = new ListNode();
        head.setVal(-1);
        head.setNext(null);
        ListNode p;
        p = head;
        for(int i=1;i<=100; i++){
            ListNode*/
/**//*
 q = new ListNode();
            q.setVal(i);
            q.setNext(null);
            p.setNext(q);
            p = q;
        }
        ReveseNode.printLink(head);
        System.out.println();
        ReveseNode.printRevseLink(ReveseNode.reverseList(head),N);
    }
}
*/
