package code_list_one;

public class PrivateOverride {
    private void f() {
        System.out.println("PrivateOverride.f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }

}

class Derived extends PrivateOverride {
    /*
     * �ڻ�������һ��˽�е�f()�������ڵ�������Ҳ��һ��f()��������������������û���κε���ϵ��Ҳ��������
     * 	���һ����˽�з����Ե������ǲ��ɼ���
     */
    public void f() {
        System.out.println("Derived.f()");
    }
}
