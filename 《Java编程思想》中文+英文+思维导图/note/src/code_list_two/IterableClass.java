package code_list_two;

import java.util.Iterator;

//������
public class IterableClass implements Iterable<String> {
    protected String[] words = "A,B,C,D,E,F,G,H,I".split(",");

    //����Լ�д��һ��������
    public Iterator<String> iterator() {
        /*
         * ���ص���ʵ����Iterator<String>�������ڲ����ʵ�����������ڲ�����Ա��������е�������ĸ
         * 	ʵ��Iterable�ӿڣ���Ҫʵ��iterator��������Ϊ��Iterable������һ�����󷽷���iterator����������������Iterator
         */
        return new Iterator() {
            private int index = 0;

            public boolean hasNext() {
                return index < words.length;
            }

            public Object next() {
                return words[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        IterableClass it = new IterableClass();
        for (String str : it) {
            System.out.print(str + " ");
        }
    }

}
