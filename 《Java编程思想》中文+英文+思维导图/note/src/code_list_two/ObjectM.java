package code_list_two;

//����һ������һ�������ӿڣ���ĳ�������ж���һ���ڲ�����ʵ�ָýӿڡ�����������ضԸýӿڵ�����
public class ObjectM {
    public ObjectMA method() {
        class ObjectMInner implements ObjectMA {
            public void method() {
                System.out.println("HH");
            }
        }
        return new ObjectMInner();//�������ýӿ������շ���ֵ�����ﴫ��һ��ʵ���˸ýӿڵ�ʵ��������������������ת��
    }

}

//����һ���ӿ�
interface ObjectMA {
    void method();
}