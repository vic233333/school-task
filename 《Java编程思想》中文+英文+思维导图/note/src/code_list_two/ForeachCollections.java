package code_list_two;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

//����һ��������������б���
public class ForeachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new ArrayList<String>();
        Collections.addAll(cs, "A,B,C,D,E,F,G".split(","));
        for (String s : cs) {
            System.out.print(s + " ");
        }
    }
}

/*
 * cs��һ��Collection����ΪʲôCollection������foreachһ����?
 * 	��Ϊ��javaSE5.0ʱ���������µĽӿ�Iterable���ýӿ���һ���ܲ���Iterator��iterator()����������Iterable�ӿڱ�foreach�������������ƶ������Կ��Ա���
 * 	�������㴴�����κ�ʵ��Iterable���࣬�����Խ���Ӧ����foreach�����(ע�ⲻ��Iterator����)
 */
class ObejctA3 implements Iterable<String> {
    protected String[] words = "A,B,C,D,E,F,G".split(",");

    public Iterator iterator() {
        return new Iterator<String>() {
            private int count = 0;

            public boolean hasNext() {
                return count < words.length;
            }

            public String next() {
                return words[count++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        ObejctA3 obejctA3 = new ObejctA3();
        for (String s : obejctA3) {
            System.out.print(s + " ");
        }
    }
}

//������б���
class ObejctA4<T> implements Iterable<T> {
    protected T[] t;

    public ObejctA4(T[] t) {
        this.t = t;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int count = t.length - 1;//�������һ��������±�

            public boolean hasNext() {
                return count != -1;
            }

            public T next() {
                return t[count--];//�ȷ���ֵ���ٶԱ�����м�һ
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        ObejctA4 obejctA4 = new ObejctA4(arr);
        for (Object o : obejctA4) {
            System.out.print(o + " ");
        }
    }
}

/*	foreach����Ӧ�����κκ�Iterable��(��Iterable����)
 * �������ַ���ֻ�Ǹ���ԭ����iterator()�����������Ļ����������û���ˡ��������һ�������ж���������Ļ�(��������ͷ����еĻ�)
 * 	һ�ֽ���������������������Ĺ��÷��������� �����������ģʽ��������һ���ӿڲ���Ҫ��һ���ӿ�ʱ����д�������Ϳ��Խ�����⡣
 * 	�����������������ǰ�������Ļ����ϣ������һ�����ĵ�����������㲻��ʹ�ø��ǣ����������һ���ܹ�����Iterable����ķ���(��ԭ���ӿ�Iterable��iterator��������ͻ)
 */
class ObejctA5 extends ObejctA4 {

    public ObejctA5(Object[] t) {
        super(t);
    }

    public Iterable reversed() {     //������Ϊ�˱�֤����ת���ǲ������ġ���ֻ����ǰ�����͵���
        return new Iterable() {
            ;

            public Iterator iterator() {
                return new Iterator() {
                    private int count = t.length - 1;

                    public boolean hasNext() {
                        return count != -1;
                    }

                    public Object next() {
                        return t[count--];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    //�����Դ���һ���������������
    public Iterable ordered() {
        return new Iterable() {
            public Iterator iterator() {
                return new Iterator() {
                    private int count = 0;

                    public boolean hasNext() {
                        return count < t.length;
                    }

                    public Object next() {
                        return t[count++];
                    }

                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        ObejctA5 obejctA5 = new ObejctA5(arr);
        //�������������Խ��з������
        for (Object o : obejctA5) {
            System.out.print(o);
        }
        System.out.println();
        for (Object o : obejctA5.reversed()) {
            System.out.print(o);
        }
        System.out.println();
        //�����Դ���һ�����������
        for (Object o : obejctA5.ordered()) {
            System.out.print(o);
        }
    }
}
























