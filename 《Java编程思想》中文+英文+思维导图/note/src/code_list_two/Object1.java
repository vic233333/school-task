package code_list_two;

import java.util.PriorityQueue;

//����һ���̳���Object�ļ��࣬���������κγ�Ա��չʾ�㲻�ܽ��������ʵ���ɹ�����ӵ�һ��PriorityQueue�С���17�»ὲ���������
public class Object1 {
    public static void main(String[] args) {
        PriorityQueue<Object1A> queue = new PriorityQueue<Object1A>();
        queue.offer(new Object1A());
        queue.offer(new Object1A());
        queue.offer(new Object1A());
        queue.offer(new Object1A());
        queue.offer(new Object1A());
        System.out.println(queue.size());
        //���еĽ���Ǳ���ģ����ǲ��ܽ����ʵ����ӵ�һ��PriorityQueue��ȥ
    }
}

class Object1A {
}
