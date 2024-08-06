class Node{
    int data;
    Node next;

    Node(int data,Node next){  //this node constructor is used when we know the address to the next node
        this.data=data;
        this.next=next;
    }

    Node(int data){  // this node constructor is used to specify the last node or if the list contains only one node    
        this.data=data;
        this.next=null;
    }
}

public class LinkedList1 {

    private static Node convertArr2LL(int []arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp =new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

private static int lengthofll(Node head){
    int cnt=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        cnt++;
    }
    return cnt;
}

private static Node removehead(Node head){
    if(head==null)return null;
    head=head.next;
    return head;

}

private static Node removetail(Node head){
    if(head==null||head.next==null) return head;
    Node temp= head;
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
    return head;
}
    public static void main(String[] args) {
        int [] arr={2,3,44,5,6};
        Node head=convertArr2LL(arr);
        
        Node temp=head;
        while(temp!=null){
            System.out.print("["+temp.data+"]"+"");
            
            temp=temp.next;
        }
        System.out.println("");
        System.err.println("The lenth of ll is "+lengthofll(head));
        head=removehead(head);
        System.out.println(head);
        head=removetail(head);
        System.out.println(head);
    }   
}
