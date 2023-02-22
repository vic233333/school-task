package code_list_two;

public class HorrorShow {
    static void u(Monster m) {
        m.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster d = new DragonZilla();
        u(d);
        v(d);//���������������
        Vampire v = new VeryBadVampire();
        w(v);
    }
}

//�ӿ�
interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

//ʵ����
class DragonZilla implements DangerousMonster {
    public void menace() {
        System.out.println("DragonZilla.menace");
    }

    public void destroy() {
        System.out.println("DragonZilla.destroy");
    }
}

class VeryBadVampire implements Vampire {
    public void destroy() {
        System.out.println("VeryBadVampire.destroy");
    }

    public void menace() {
        System.out.println("VeryBadVampire.menace");
    }

    public void kill() {
        System.out.println("VeryBadVampire.kill");
    }

    public void drinkBlood() {
        System.out.println("VeryBadVampire.drinkBlood");
    }
}
