package bai3_luyentap_Queue;

public class Solution extends Queue{
    public void enQueue(int data){
        Node newNode = new Node(data);
        if (front==null&&rear==null){
            front=newNode;
            rear=newNode;
        }else {
            rear.link=newNode;
            rear=newNode;
        }
    }
    public void deQueue(){
        int data = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
        }
    }
    public void displayQueue() {
        Node curentNode = front;
        while (curentNode != null) {
            System.out.println(curentNode.data + " ");
            curentNode = curentNode.link;
        }
    }

    @Override
    public String toString() {
        return "Solution{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
