package code_list_two;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//�������ȼ�
public class PriorityQueueDemo {
    //��������Ǵ�ӡ���е�
    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            Object remove = queue.remove();
            System.out.print(remove + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.offer(1);//����������Ԫ��
        queue.offer(1);
        queue.offer(6);
        queue.offer(3);
        queue.offer(88);
        queue.offer(45);
        queue.offer(67);
        printQ(queue);//��С�����ȼ���ߣ���ӡ������Ԫ������˳���

        List<Integer> asList = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        PriorityQueue<Integer> queue2 = new PriorityQueue<Integer>(asList);
        printQ(queue2);
    }
}
