package code_list_two;

//����������Ķ�̬
public class ObjectB {
    public static void main(String[] args) {
        (new ObjectBB()).print();
        /*
         * �������д���ʱ������ObjectBB�Ƿ��л��࣬�л���Ļ����ȼ��ػ��࣬���û���Ĺ�����,����Ĺ���������һ��print()������
         * 	��Ϊ��̬�Ĵ��ڵ��õ��ǵ������print()������������ʱ�򵼳������û�г�ʼ�������i��ֵΪ0(���κ����鷢��֮ǰ�������������Ĵ洢�ռ��ʼ��Ϊ�����Ƶ���)
         * 	�����������ϣ�׼�����쵼������󣬳�ʼ��iֵΪ1�����ù���������ʱ��i��ֵΪ1
         */
    }
}

abstract class ObjectBA {
    public ObjectBA() {
        print();
    }

    public abstract void print();//����һ�����󷽷�
}

class ObjectBB extends ObjectBA {
    private int i = 1;

    public void print() {
        System.out.println(i);
    }

}