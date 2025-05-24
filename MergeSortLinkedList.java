package Leetcode;

public class MergeSortLinkedList {
    public static ListNode merge(ListNode first,ListNode second){
        if(first==null){
            return second;
        }
        if(second==null){
            return first;
        }
        if(first.val<second.val){
            first.next= merge(first.next,second);
            return  first;
        }
        else{
            second.next=merge(first, second.next);
            return second;
        }
    }
    public static ListNode split(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=slow.next;
        slow.next=null;
        return temp;
    }
    public static ListNode mergeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode second=split(head);
        head=mergeSort(head);
        second=mergeSort(second);
        return merge(head,second);
    }
    public static void print(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(4);
        ListNode b=new ListNode(5);
        ListNode c=new ListNode(8);
        ListNode d=new ListNode(-2);
        ListNode e=new ListNode(0);
        ListNode f=new ListNode(15);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println("Before sort");
        print(a);
        ListNode head=mergeSort(a);
        System.out.println("After sort");
        print(head);
    }
}
