class Solution {
    public Node copyRandomList(Node head) {
       if(head == null) return null;
       //step 1 : deepcopy list
       Node head2  = deepCopy(head);
       //step 2 : merge both lists
       merge(head,head2); 
       //step 3 : connecting the randoms
       connectRandoms(head,head2);
       //step 4 : split the lists
       return split(head);
    }
    
    public Node deepCopy(Node head){
       Node head2 = new Node(-1);
       Node curr =head2;
       Node temp=head;

       while(temp!=null){
        Node t = new Node(temp.val);
        curr.next=t;
        curr=curr.next;
        temp=temp.next;
       }
       return head2.next;
    }
    public void merge(Node list1,Node list2){
        while(list1!=null && list2!=null){
            Node next1= list1.next;
            Node next2= list2.next;

            list1.next= list2;
            list2.next= next1;

            list1= next1;
            list2= next2;
        }
    }
    public void connectRandoms(Node head1 , Node head2){
        Node t1 = head1;
        Node t2 = head2;
        while(t1!=null){
            if(t1.random!=null) t2.random = t1.random.next;

            t1= t1.next.next;
            if(t2.next!=null) t2= t2.next.next;
            else t2=null;
        }
    }
    public Node split(Node head1){
        Node dummy = new Node(-1);
        Node curr=dummy;
        Node temp=head1;
        while(temp!=null){
            Node copy = temp.next;
            temp.next = copy.next;      
            curr.next = copy;         
            curr = copy;
            temp = temp.next;
        }
        return dummy.next;
   }
    
}