package code_list_one;

//����һ������һ��float����࣬���������չʾ��������
public class ObjectF {

    float num;

    public static void main(String[] args) {
        ObjectF a = new ObjectF();
        ObjectF b = new ObjectF();
        a.num = 1;
        b.num = 2;
        System.out.println("a��num��ֵ��" + a.num + "  " + "b��num��ֵ�ǣ�" + b.num);
        //����Ǳ������ƣ�����.����  ����������Ա�����������˴˶���
        a.num = 3;
        System.out.println("a��num��ֵ��" + a.num + "  " + "b��num��ֵ�ǣ�" + b.num);
    }

}
