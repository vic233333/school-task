package code_list_one;

public class VarargType {

    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println("���ȣ�" + args.length);
    }

    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println("���ȣ�" + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);//����int������������Ҫת��Ϊ��װ���͵ģ��ɱ�������ܻ������͵�(Ҳ���Խ���װ���ʹ���)
        g(new Integer(4));//����װ���ʹ���ȥ���������Ὣ���װ����ת��Ϊ�������͵�
        g();//I��ʾ��������int(������ת��Ϊ��װ����)����������������һ����Ҳ����ʹ�ÿɱ�����б����������Զ���װ���ƣ���ʵ��ʹ�õľ��ǻ�������
        System.out.println("int���飺" + new int[0].getClass());
    }

}
