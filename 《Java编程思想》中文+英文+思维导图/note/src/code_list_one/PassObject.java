package code_list_one;

//���������еı�������
public class PassObject {

    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("x��c��ֵΪ��" + x.c);
        /*
         * �ںܶ�������У�����f()�ƺ�Ҫ�������������ڸ���һ�ݶ����������ʵ���ϴ�����ֻ�Ǵ�����һ�����ã�
         * 	�����õ��˸����ã�������в���ʱ�����ɲ�������ı���Ҳ�ᷢ���ı�
         */
        f(x);
        System.out.println("x��c��ֵΪ��" + x.c);
    }

}
