package code_list_two;

//�� �ӿ��ڲ���Ƕ����
public interface ClassInInterface {
    void method();

    class Test implements ClassInInterface {//����һ���ڽӿ��ж����Ƕ���ࡣ�ᱻ�Զ���Ĭ��Ϊstatic��final��������Ҫ��ʽ������

        public void method() {
            System.out.println("Test.method");
        }
    }
}
