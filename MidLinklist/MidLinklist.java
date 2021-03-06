class ListNode{
    int val;
    ListNode next;
    public ListNode (int x){
        val = x;
    }
}

class LinkList {
    ListNode head;//标识链表的头

    //头插法
    public void addFirst(int data){
        ListNode node= new ListNode(data);
        node.next = this.head;
        head = node;
    }
    //链表的中间结点
    public ListNode midLinklist(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //遍历链表
    public void display(){
       ListNode cur = this.head;
       while(cur != null){
           System.out.print(cur.val + " ");
           cur = cur.next;
       }
       System.out.println();
    }
}
public class MidLinklist {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.display();
        System.out.println(list.midLinklist().val);
    }
}