package code_list_two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();//CollectionҲ��һ���ӿڣ�ArrayList������ת����
        //���������Ԫ��
        for (int i = 0; i < 10; i++) {
            c.add(i);//add��ʾ��һ��������ӵ������У�ArrayList�Ļ�����List��List����ϵ��ӵ�Ԫ���Ƿ��ظ����������ǻ���ӽ�ȥ
        }
        //�������б���Ԫ�ء�ʹ��foreath����
        for (Integer i : c) {
            System.out.println("i=" + i);
        }
    }

    //��ϰ������Set����ʾc
    @Test
    public void otherMethod() {
        Set<Integer> c = new HashSet<Integer>();//SetҲ��List��һ�֣�ֻ��Set��û��˳��ģ�����������ظ���Ԫ�ء�SetҲ��һ���ӿ�
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.println("i=" + i);
        }
    }
}
