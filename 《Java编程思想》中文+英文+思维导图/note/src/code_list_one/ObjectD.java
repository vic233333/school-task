package code_list_one;

//��дһ������չʾ�����㴴����ĳ���ض���Ķ��ٸ�����������е�ĳ���ض���static��ֻ��һ��
public class ObjectD {

    static String s = new String("static����ֻ��Ψһ��ʵ��");

    public static void main(String[] args) {
        ObjectD a = new ObjectD();
        ObjectD b = new ObjectD();
        ObjectD c = new ObjectD();
        ObjectD d = new ObjectD();
        System.out.println("��ӡ�Ĺ�ϣ��ֵ��һ����");
        System.out.println(a.s.hashCode());
        System.out.println(b.s.hashCode());
        System.out.println(c.s.hashCode());
        System.out.println(d.s.hashCode());
    }
}
