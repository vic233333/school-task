package code_list_two;

import java.util.PriorityQueue;

public class ObjectZ {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<Double>();
        //��������������
        queue.offer(1.2);
        queue.offer(2.2);
        queue.offer(6.2);
        queue.offer(4.2);

        //peek()�����᷵�ض�ͷ�����ǵ�û��Ԫ�ص�ʱ�򷵻ص���null
        while (queue.peek() != null) {
            //ʹ��poll()�����Ƴ�--poll()��remove()���������Ƴ���ͷԪ�أ�����poll�ڶ���Ϊ�յ�ʱ�򷵻ص���null����ʹ��remove()���׳��쳣
            System.out.println(queue.poll());
        }
    }
}

