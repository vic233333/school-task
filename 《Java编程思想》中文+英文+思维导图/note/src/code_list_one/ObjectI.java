package code_list_one;

//����һ������final�������࣬�ɴ˼̳в���һ���ಢ���Ը��Ǹ÷�����
public class ObjectI extends ObjectIA {

    //���Ը��ǻ������final��f()����,��Ȼ��ʧ�ܵ�
    //public void f() {}

    public void g() {
        System.out.println("ObjectI.g()");
    }

    public static void main(String[] args) {
        ObjectI objectI = new ObjectI();
        objectI.f();//��Ȼ�����಻����д�÷��������ǵ����໹�ǿ��Է��ʵ��÷�����
        objectI.g();//�����g()����������

    }
}

class ObjectIA {
    //����final�ķ��������ĵ����಻�ܸ��Ǹ÷�����������Ҫ����д�÷����Ļ��ͻᱨ��
    public final void f() {
        System.out.println("ObjectIA.f()");
    }

    public void g() {
        System.out.println("ObjectIA.g()");
    }
}