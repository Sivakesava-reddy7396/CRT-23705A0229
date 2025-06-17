
class Main problem1{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        List.insertEnd(10);
        List.insertEnd(20);
        List.insertEnd(30);
        List.insertEnd(40);
        List.print();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head=head;;
    }
        public void insertBig(int data){
            node newNode=new Node(data);
                newNode.next=head;
            }
            public void insertEnd(int data){
                Node newNode=new node(data);
                if(head==null){
                    head=newNode;
                    return;
                }
                var temp=head;
                While(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
            }
            void insertPos(int data.int Pos){
                node newNode=new Node(data);
                var length=0;
                var temp=head;
                while(temp!=null){
                    length++;
                    temp=temp.next;
                }
                if(Pos==0){
                    insertBig(data);
                }
                else if(Pos==length){
                    insertEnd(data);
                }
            }
            else{
                temp=head;
                for(int i=0;i<Pos;i++){
                    temp=temp.next
                }
                newNode.next=temp.next;
                temp.next=newNode;
            }
        }
        else{
            System.out.println("the position is  invalid");
        }
    }
    node getHead(){
        return head;
    }
    int length(){
        int length_=0;
        var temp=head;
        while(temp!=null){
            length_++;
            temp=temp.next;
        }
        return length_;
    }
    void print(){
        var temp=head;
        System.out.print("element in the list are:");
        while(temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
        }
        System.out.print("null\n");
    }
    int deleteBeg(){
        if(head==null){
            System.out.println("there are no elemnts to delete");
            return -1;
            int removedEle=head.data;
            head=head.next;
            return removesEle;
        }
        int deletedEnd(){
            int length_=length();
            var temp=head;
            if(length_==0){
                 System.out.print("no elements");
                 return -1;
            }
            if(length+==1){
                int removeEle=head.data;
                head=head.next;
                return removeEle;
            }
            for (int i=0;i<length_-1;i++){
                temp=temp.next;
            }
            int removedEle=temp.next.data;
            temp.next=null;
            return remopvedEle;
        }
    }
}
            