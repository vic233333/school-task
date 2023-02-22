package code_list_two;

//���������ģʽ
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        //�ж϶���������û������
        if (next < items.length) {
            items[next] = x;//���������������
            next = next + 1;//���±�����һ
        }
    }

    //����һ��Sequence��ѡ������Ҳ��һ���ڲ���
    private class SequenceSelector implements Selector {
        /*
         * �������ʹ��Selector����ָ��SequenceSelector�ľ���ʵ���࣬��ΪSequenceSelectorʵ���˸ýӿڣ���������������ת��
         */
        private int i = 0;

        public boolean end() {
            return i == items.length;//�ڲ�����Է����ⲿ��ı�����items��һ�����ã�������SequenceSelector��һ���֡�ͬʱ�ڲ���Ҳ���Է�����Χ��ķ���
        }

        public Object current() {
            return items[i];
        }

        public void next() {//ͨ���ı������±����ı��������
            if (i < items.length) {
                i++;
            }
        }

        //����ڲ���ķ������������ⲿ������á����ڲ���������������ʱ��Ϳ��Է��ص���Χ������ã��Ӷ��Ϳ���ʹ����Χ��ķ�����
        public Sequence Outer() {
            return Sequence.this;
        }
    }

    //����������Ի�ȡһ��SequenceSelector����(��Χ���ȡ�ڲ������)
    public Selector getSelector() {
        return new SequenceSelector();
    }

    /*
     * ���ڲ����Զ�ӵ���ⲿ�����г�Ա�ķ���Ȩ�ޣ������������?
     * 	��ĳ����Χ����󴴽���һ���ڲ������ʱ(����������������Ϳ���ͨ����Χ�������÷�������һ���ڲ������)
     * 	���ڲ������ض����Զ�����һ��ָ���Ǹ���Χ���������á�Ȼ�󣬵������ڲ��������Χ��ĳ�Աʱ����Ϳ���ͨ���Ǹ�����ѡ����Χ��ĳ�Ա�ˡ�(�����Χ������ñ���������㴦���)
     * 	�������ڿ��Կ������ڲ������Ĵ���ֻ��������Χ�������������²��ܱ�����
     */
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < sequence.items.length; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.getSelector();//���һ��������
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}

interface Selector {
    boolean end();

    Object current();

    void next();
}