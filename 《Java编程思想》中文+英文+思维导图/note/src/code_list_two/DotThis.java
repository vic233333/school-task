package code_list_two;

public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    //����һ���ڲ���
    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }

    //�����������������һ���ڲ���Ķ���
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        DotThis.Inner dti = dotThis.inner();//��ȡ�ڲ������
        dti.outer().f();//��Ϊouter�������ص���һ���ⲿ������ã����Ե����ڲ���.outer������ʵ�����ǵõ��ⲿ������á������Ե����ⲿ��ķ���
    }
}
