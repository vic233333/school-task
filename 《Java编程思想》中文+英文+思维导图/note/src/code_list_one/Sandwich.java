package code_list_one;

/*  ע�⼸��:���๹���� ������  �����๹����̱�����(�����๹������û�б�����֮ǰ)��ÿ������Ĺ�������Ҫ�����á�ΪʲôҪ����?��Ϊ  ������Ĺ���  ��Ҫ�������࣬
 *  ���ǵ����಻�ܷ��ʻ���private���͵����ݣ�����ֻ�л���Ĺ������ž���ǡ����֪ʶ��Ȩ�޶��Լ���Ԫ�ؽ��г�ʼ�����������еĻ��๹���������ã�����Ͳ��ܴ������������
 */
public class Sandwich extends PortableLunch {//��һ�����鿴�Ƿ���ڻ��࣬�еĻ��ͼ��ػ���
    private Bread bread = new Bread();//���岽�����μ��س�Ա����
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();

    public Sandwich() {//��������������еĶ���׼�����ˣ����ù����������󱻴���
        System.out.println("Sandwich");
    }

    public static void main(String[] args) {
        new Sandwich();//ִ����һ�д���
    }
}

class Meal {//���Ĳ����ҳ��˸����࣬���ظ����࣬���ù��������Դθ��Ÿղŵ�·�߼��س�ȥ

    public Meal() {
        System.out.println("Meal");
    }
}

class Bread {
    public Bread() {
        System.out.println("Bread");
    }
}

class Cheese {
    public Cheese() {
        System.out.println("Cheese");
    }
}

class Lettuce {
    public Lettuce() {
        System.out.println("Lettuce");
    }
}

class Luncha extends Meal {//�������������ڻ���

    public Luncha() {
        System.out.println("Luncha");
    }
}

class PortableLunch extends Luncha {//�ڶ������������Ƿ񻹴��ڻ���

    public PortableLunch() {
        System.out.println("PortableLunch");
    }
}
