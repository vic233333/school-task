package code_list_two;

//�ڲ���������
public class MultiInterfaces {
    static void takesA(A0 a) {
    }

    static void takesB(B b) {
    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
        /*
         * �����Ļ�Y���ڲ�������Ծͻ���ǿ
         */
    }
}

interface A0 {
}

interface B {
}

//
class X implements A0, B {
}

class Y implements A0 {
    public B makeB() {
        return new B() {
        };
    }
}
