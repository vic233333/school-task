package code_list_two;

//Ƕ�׽ӿ�
class A {
    //�ӿ�
    interface B {
        void f();
    }//

    public interface C {
        void f();
    }

    private interface D {
        void f();
    }//˽�нӿ�(private�ؼ���)����ʹ������ӿڵ�ʱ�򣬲�����ʵ����������͵�ת��(Ҳ����˵��������ת��)

    //ʵ����
    public class BImpl implements B {
        public void f() {
        }
    }//����

    private class BImpl2 implements B {
        public void f() {
        }
    }//˽��

    class CImpl implements C {
        public void f() {
        }
    }//������Ȩ��

    private class CImpl2 implements C {
        public void f() {
        }
    }//˽��

    public class DImpl implements D {
        public void f() {
        }
    }

    private class DImpl2 implements D {
        public void f() {
        }
    }

    public D getD() {
        return new DImpl();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G {
        void f();
    }//Ƕ�׽ӿ�

    public interface H {
        void f();
    }//����

    void g();//
}

public class NestingInterfaces {
    public class BImp implements A.B {
        public void f() {
        }
    }

    class CImpl implements A.C {
        public void f() {
        }
    }

    class EImpl implements E {
        public void g() {
        }
    }

    class EGImpl implements E.G {
        public void f() {
        }
    }

    class EImpl2 implements E {
        public void g() {
        }

        class EG implements E.G {
            public void f() {
            }
        }//����Ƕ����
    }

    public static void main(String[] args) {
        A a = new A();

    }
}
