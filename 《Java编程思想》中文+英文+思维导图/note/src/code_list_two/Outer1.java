package code_list_two;

//����һ���࣬��һ��String����������һ���ڲ�����ʾ��Χ���String����
public class Outer1 {
    private String str;

    public Outer1(String str) {
        this.str = str;
    }

    class Inner {
        public String toString() {
            return str;
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer1 outer1 = new Outer1("H");
        Inner inner = outer1.getInner();
        System.out.println(inner.toString());
    }
}
