package code_list_two;

public class ObjectE {
    static void h(ObjectEA o) {
        o.a();
        o.b();
    }

    static void i(ObjectEB o) {
        o.c();
        o.d();
    }

    static void j(ObjectEC o) {
        o.e();
        o.f();
    }

    static void k(ObjectED o) {
        o.g();
    }

    public static void main(String[] args) {
        //һ���ӿ����ÿ�������ת��Ϊ��������
        ObjectED o = new ObjectEF();
        h(o);//��ObjectED��������ת��ΪObjectEA
        i(o);//��ObjectED��������ת��ΪObjectEB
        j(o);//��ObjectED��������ת��ΪObjectEC
        k(o);//��ObjectED��������ת��ΪObjectED
    }
}

//�ӿ�
interface ObjectEA {
    public void a();

    public void b();
}

interface ObjectEB {
    public void c();

    public void d();
}

interface ObjectEC {
    public void e();

    public void f();
}

interface ObjectED extends ObjectEA, ObjectEB, ObjectEC {
    public void g();
}

//ʵ����
class ObjectEG {
}

class ObjectEF extends ObjectEG implements ObjectED {
    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }
}