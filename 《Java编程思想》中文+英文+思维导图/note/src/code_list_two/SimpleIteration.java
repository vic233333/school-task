package code_list_two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//�������ļ�������
public class SimpleIteration {
    public static void main(String[] args) {

        List<String> str = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            str.add(String.valueOf(i));
        }

        //����������
        Iterator<String> it = str.iterator();
        //����
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //��ʼ�������������¸����
        it = str.iterator();
        while (it.hasNext()) {
            //��һɾ��Ԫ��
            String st = it.next();
            it.remove();//ɾ���ոշ��ص�Ԫ��
        }
        System.out.println("����Ԫ���Ѿ���ȫ��ɾ������");
    }
}
