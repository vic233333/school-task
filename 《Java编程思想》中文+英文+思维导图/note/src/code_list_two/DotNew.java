package code_list_two;

//�ڲ��ࣺnew�ؼ���
public class DotNew {
    public class Inner {
        public void method() {
            System.out.println("H");
        }
    }

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        DotNew.Inner inn = dotNew.new Inner();//�����ǿ��Գ�ʼ��һ���ڲ����
        inn.method();//�����Ϳ���ʹ���ڲ���ķ�����
    }
}
