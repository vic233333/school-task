package code_list_two;

//�ڲ���Ķ��Ƕ��
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        //����һ���ڲ���A����ͨ��new�ؼ��֣���Χ�����.new + �ڲ�������   �Ϳ��Դ���һ���ڲ������ͬʱҲ����Χ�ཨ���˹�ϵ
        MNA.A a = mna.new A();
        //����һ��A����ڲ������B
        MNA.A.B b = a.new B();
        b.h();
        /*
         * ���Կ�����MNA.A.B������Χ���g()��f()����Ҫ�κε�����
         */
    }
}

//����һ�����Ƕ����
class MNA {
    public void f() {
        System.out.println("f");
    }

    class A {
        private void g() {
            System.out.println("g");
        }

        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}