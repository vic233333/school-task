package code_list_one;

//����һ�����������������Ļ��ࡣ�ڵ�һ�������п��Ե��õڶ�������������һ���̳��Ըû���ĵ����࣬�Ҹ��ǻ����еĵڶ���������Ϊ�����ഴ��һ������
public class ObjectJ {

    public void methodA() {
        System.out.println("ObjectJ.mehodA");
        mehodB();
    }

    public void mehodB() {
        System.out.println("ObjectJ.mehodB");
    }

    public static void main(String[] args) {
        //Ϊ�����ഴ��һ�����󣬲�����ת�͵�������  �������õ�һ������
        ObjectJ objectJ = new ObjectJA();
        objectJ.methodA();
        /*
         * �û��������ָ��һ��������ʵ��������һ������(��������ڵ�����û����д)�����Ǹ÷����ڲ�������һ������(�ڵ�����������д��һ�������ض�̬��)
         * 	�ڻ����ڲ�����һ������������÷����ڵ�����������д�����ǵ��õ���������д���Ǹ�����
         */
    }
}

class ObjectJA extends ObjectJ {
    public void mehodB() {
        System.out.println("ObjectJA.mehodB");
    }
}
