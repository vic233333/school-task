package code_list_one;

class Window {
    public Window(int marker) {
        System.out.println("window=" + marker);
    }
}

class House {
    Window w1 = new Window(1);

    public House() {
        System.out.println("House");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    public void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);
}

public class OrderOfIn {
    public static void main(String[] args) {
        /*
         * �ڹ����������֮ǰ�����еı���������ʼ���ˣ�����������Ⱥ�˳������˳�ʼ����˳��(�������ֲ�����)����ʹ��������ɢ���뷽������֮�䣬������Ȼ�����κη���(����������)������֮ǰ�õ���ʼ����
         */
        House house = new House();
        house.f();
    }
}