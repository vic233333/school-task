package code_list_two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//�����Լ�д��һ��������
public class MultiIterableClass extends IterableClass {

    //һ�����������
    public Iterable<String> randomized() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                List<String> shu = new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shu);
                return shu.iterator();
            }
        };
    }

    //����һ�����������
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            private int count = words.length - 1;//��������һ��Ԫ�ص��±���

            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    public boolean hasNext() {
                        return count > -1;
                    }

                    public String next() {
                        return words[count--];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();

        //�����������������

        //������������
        System.out.println("�������");
        for (String str : mic) {
            System.out.print(str + " ");
        }
        System.out.println();

        //����Ƿ������
        System.out.println("�������");
        for (String str : mic.reversed()) {
            System.out.print(str + " ");
        }
        System.out.println();

        //�������ⷽ�����
        System.out.println("���ⷽ�����");
        for (String str : mic.randomized()) {
            System.out.print(str + " ");
        }

    }
}
