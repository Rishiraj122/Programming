import java.util.*;
import java.lang.*;
import java.io.*;

public class LinkedListPractice {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }    

    Node head=null;

    public void addNode(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void display(){
        Node curr=head;
        if(head==null){
            System.out.println("The List Is Empty");
        }

        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String args[]){
        LinkedListPractice node1=new LinkedListPractice();
        node1.addNode(12);
        node1.addNode(14);
        node1.addNode(17);
        node1.display();
        
        System.out.println();
    }
}
