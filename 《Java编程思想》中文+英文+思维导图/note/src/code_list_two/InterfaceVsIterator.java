package code_list_two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class InterfaceVsIterator {
    //ʹ�õ��������б���
    public static void display(Iterator<String> it) {
        while (it.hasNext()) {
            String next = it.next();
            System.out.print(next + " ");
        }
        System.out.println();
    }

    //ʹ��Collection������ͨ�������б�������
    public static void display(Collection<String> coll) {
        for (String str : coll) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        display(list);
        //����һ�����������������õ��������б���
        Iterator<String> iterator = list.iterator();
        display(iterator);
        //ʹ��Collection��api���б���
        display(list);

        //�õ��������б���������Map����Ҳͬ���ʺ�,��������Collectionͨ�Խ��в����Ļ��Ͳ�����
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("1", "A");
        hashMap.put("2", "B");
        hashMap.put("3", "C");
        hashMap.put("4", "D");
        /*
         * 	������Mapû�е��������ܣ�����Map�� ֵ����.values()��ʹ�� Collection��װ��
         *	  ���ԾͿ��� ����һ�������������б���
         */
        display(hashMap.values().iterator());
        //ʹ��Collection��API���б���
        display(hashMap.values());

        /*
         * �����汾��display()����������ʹ��Map����Collection��������������������Collection�ӿں�Iterator�����Խ�display()������ײ���������н���
         * ����Ҫʵ��һ������Collection���ⲿ��ʱ������ȥʵ��Collection�ӿڿ��ܷǳ����ѣ���ʱ��ʹ��Iterator�ͻ��÷ǳ�������
         */

    }
}
