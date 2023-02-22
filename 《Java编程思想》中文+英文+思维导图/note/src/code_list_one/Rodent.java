package code_list_one;

/*
 * ����Rodent���飬��䲻ͬ��Rodent���ͣ�Ȼ����û���ķ���
 */
public class Rodent {
    public void eat() {
    }//����һ��ͨ�÷���

    public static void main(String[] args) {
        //���һ������
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();
        for (Rodent r : rodent) {
            r.eat();
        }
    }
}

class Mouse extends Rodent {
    public void eat() {
        System.out.println("Mouse");
    }
}

class Gerbil extends Rodent {
    public void eat() {
        System.out.println("Gerbil");
    }
}

class Hamster extends Rodent {
    public void eat() {
        System.out.println("Hamster");
    }
}