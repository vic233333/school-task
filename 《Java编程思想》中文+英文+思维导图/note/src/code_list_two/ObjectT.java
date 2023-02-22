package code_list_two;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

//дһ��������ʹ��Iterator����Collection������ӡ������ÿ������toString(),���������͵�Collection��Ȼ�����ʹ�ô˷���
public class ObjectT {
    //�ڱ�д �������  �Ĵ����ʱ�򣬲�����Ҫ�������������Ķ�����ʲô���͵�
    public static void display(Iterator<Integer> it) {
        while (it.hasNext()) {
            Integer obj = it.next();
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        HashSet<Integer> list3 = new HashSet<Integer>();
        TreeSet<Integer> list4 = new TreeSet<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
            list2.add(i);
            list3.add(i);
            list4.add(i);
        }
        display(list.iterator());
        display(list2.iterator());
        display(list3.iterator());
        display(list4.iterator());
    }
}
