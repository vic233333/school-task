package code_list_two;

//����һ���࣬������һ��String��������һ����ʾ���String��toString�������������������ɸ����������Sequence�����У�Ȼ����ʾ����
public class ObjectI {
    private String str;

    public String toString() {
        return str;
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(12);
        //�������� ��Ԫ��
        for (int i = 0; i < 12; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.getSelector();
        //���б���
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
