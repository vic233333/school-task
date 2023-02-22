package code_list_two;

public class Adventure {
    public static void a(CanFigth x) {
        x.figth();
    }

    public static void b(CanSwim x) {
        x.swim();
    }

    public static void c(CanFly x) {
        x.fly();
    }

    public static void d(ActionCharacter x) {
        x.figth();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        a(hero);
        b(hero);
        c(hero);
        d(hero);
        /*
         *	ActionCharacter�� figth��������������
         */
    }
}

interface CanFigth {
    void figth();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    public void figth() {
        System.out.println("ActionCharacter.figth");
    }
}

class Hero extends ActionCharacter implements CanFigth, CanSwim, CanFly {//�̳�һ���࣬ʵ�ֶ���ӿ�

    /*
     * CanFigth�ӿڵ�figth����û��ʵ�֣���Ϊ��̳е�ActionCharacter�е�figth������ͻ����ת��ΪCanFigth�����figth����ʱ�����õ���ActionCharacter��
     */
    public void fly() {
        System.out.println("Hero.fly");
    }

    public void swim() {
        System.out.println("Hero.swim");
    }
}
