package code_list_two;

//����һ������Ƕ������
public class ObjectQ {

    //����һ��Ƕ����
    private static class ObjectQA {
        static int i = 11;

        public void read() {
            System.out.println("i��ֵ�ǣ�" + i);
        }
    }

    public static void main(String[] args) {
        //����Ƕ����ʵ����������Ҫ������Χ��
        ObjectQA objectQA = new ObjectQA();
        objectQA.read();
    }
}
