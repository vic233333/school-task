package code_list_two;

//�ֲ��ڲ�����������ıȽ�
public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        //�������һ���ֲ��ڲ��࣬��������һ������Դ����������
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter.������");
            }

            public int next() {
                System.out.println(name);
                return count++;
            }
        }

        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        //������һ�������ڲ��ֻ࣬�ܷ���һ�������ʵ��
        return new Counter() {
            public int next() {
                System.out.println("getCounter2.������");
                return count++;
            }
        };

    }

    /*
     * �ֱ�ʹ�þֲ��ڲ���������ڲ���ʵ����������ܣ����Ǿ�����ͬ�Ĺ��ܡ���Ȼ�ֲ��ڲ���������ڷ��������ǲ��ɼ��ģ���Ϊʲô��Ȼʹ�þֲ��ڲ�������������ڲ���?
     * 	Ψһ�������ǣ�ʹ�þֲ��ڲ��������һ���������Ĺ�������������Ҫ���ع��������������ڲ���ֻ������ʵ����ʼ��
     * 		ʹ�þֲ��ڲ������ʹ�������ڲ������һ�����ɾ��ǣ���Ҫ��ֹһ�����ڲ���Ķ���
     *
     */
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("A");
        Counter c2 = lic.getCounter2("B");
        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
}

interface Counter {
    int next();
}

