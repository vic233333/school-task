package code_list_two;

//����һ���࣬��ֻ��һ�����������Ĳ����������ڶ����࣬����һ���������Է��ص�һ����������á�������������棬����һ����������������
public class ObjectN {
    private int i;

    public ObjectN(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        ObjectNA objectNA = new ObjectNA();
        ObjectN method = objectNA.method();
        System.out.println(method.getI());
    }
}

class ObjectNA {
    public ObjectN method() {
        return new ObjectN(123) {
        };
    }
}
