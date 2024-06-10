package LinkedList;


import java.util.Map;
import java.util.Scanner;

class MyLinkedList{
    int data;
    MyLinkedList next;
    MyLinkedList(int data)
    {
        this.data=data;
        this.next=null;
    }
     MyLinkedList  root=null;

    public  MyLinkedList AddnewNodeAtLast(MyLinkedList root)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data for last node : ");
        int data= sc.nextInt();
        MyLinkedList node=new MyLinkedList(data);
        MyLinkedList temp=root;
        while(temp.next!=null)  //10-->20-->null
        {
            temp=temp.next;
        }
        temp.next=node;
        return root;

    }
    public  MyLinkedList AddnewNodeAtFirst(MyLinkedList root)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data for first node : ");
        int data= sc.nextInt();
        MyLinkedList temp=new MyLinkedList(data);
        temp.next=root;
        root=temp;
        return root;

    }


    public  void display(MyLinkedList root)
    {
        MyLinkedList temp=root;
        while(temp.next!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
}
public class LinkedListDemo {

    public static void main(String[] args) {

            MyLinkedList list=new MyLinkedList(10);
            list.AddnewNodeAtLast(list);
            list.AddnewNodeAtLast(list);
            list.AddnewNodeAtLast(list);
            list.AddnewNodeAtLast(list);
        MyLinkedList list1 = list.AddnewNodeAtFirst(list);
        list.display(list1);
    }


}
