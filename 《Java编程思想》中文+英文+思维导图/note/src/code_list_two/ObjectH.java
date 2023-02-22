package code_list_two;

//����һ���ӿںͼ�������ʵ���ࡣÿ�����Ͷ�������Ӧ�Ĺ�����Ȼ���д����ʹ����Щ����
public class ObjectH {
    //��������
    public static void cycleConsumer(CycleFactory fac) {
        Cycle c = fac.getCycle();
        c.play();
    }

    public static void main(String[] args) {
        UnicycleFactory u = new UnicycleFactory();
        cycleConsumer(u);
        BicycleFactory b = new BicycleFactory();
        cycleConsumer(b);
        TricycleFactory t = new TricycleFactory();
        cycleConsumer(t);
    }
}

//�ӿ�
interface Cycle {
    void play();
}

interface CycleFactory {
    Cycle getCycle();
}

//�����ʵ����
class Unicycle implements Cycle {
    public void play() {
        System.out.println("Unicycle.play");
    }
}

class Bicycle implements Cycle {
    public void play() {
        System.out.println("Bicycle.play");
    }
}

class Tricycle implements Cycle {
    public void play() {
        System.out.println("Tricycle.play");
    }
}

//�������Ӧ�Ĺ���
class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}
