package code_list_one;

//����ת��
public class RTTI {
    public static void main(String[] args) {
        Useful[] useful = {new Useful(), new MoreUseful()};//����MoreUseful������ת��
        useful[0].f();
//		(MoreUseful)useful[0].u();//�����ת��������ȷ�ģ���ôת�ͳɹ�������ʧ��
        ((MoreUseful) useful[1]).u();//����ת��
    }
}

class Useful {
    public void f() {
    }

    public void g() {
    }
}

class MoreUseful extends Useful {
    public void f() {
    }

    public void g() {
    }

    public void u() {
    }

    public void h() {
    }
}