package code_list_one;

public class Incrementable {

    //���������Static�еĳ�Ա����i���м�һ����
    public static void increment() {
        //��Ա����i��һ����̬�ı���
        StaticTest.i++;
    }

    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        //ʹ������Ϊ��Incrementable�����StaticTest�е�i������һ��i��ֵ������47
        sf.increment();
        //ʹ��������StaticTest�е�i������һ
        Incrementable.increment();
        //��̬�������ڴ�����һ�ݵģ��������еĶ��󣬶�ֻ��һ�ݵ�
        System.out.println(StaticTest.i);
    }

}
