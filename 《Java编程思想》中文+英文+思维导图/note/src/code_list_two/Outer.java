package code_list_two;

//��дһ����ΪOuter���࣬����һ����ΪInner���࣬��Outer�����һ��������������һ��Inner���͵Ķ��󡣴�������ʼ��һ��ָ��ĳ��Inner���������
public class Outer {
    class Inner {
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
    }

}
