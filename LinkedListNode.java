import java.util.*;
import java.io.*;
import java.lang.*;

public class LinkedListNode{

    class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    Node head,tail=null;

    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            head.previous=tail;
            tail.next=null;
        }
        else{
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
            tail.next=null;
        }
    }

    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        System.out.println("Node is doubly Linked List");

        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }

    }



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedListNode lnd=new LinkedListNode();
        lnd.addNode(3);
        lnd.addNode(4);
        lnd.addNode(7);
        lnd.addNode(124);

        lnd.display();
    }
}