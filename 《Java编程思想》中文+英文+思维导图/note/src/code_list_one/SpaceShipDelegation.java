package code_list_one;

//�����Ǵ����ȼ̳и��ӵĸ���������һ����Ա������Ҫ�ö���ʲô�����͵���ʲô������ֻʹ���ڳ�Ա�����е�ĳ��������ʹ�ü̳еĻ�����ǿ�Ƽ̳��������з���
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();//����Ǵ�������һ����Ա���󣬱ȼ̳и��ӵ����

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void back(int velocity) {
        controls.back(velocity);//����ѡ��ʹ�����еļ�������
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation spaceship = new SpaceShipDelegation("NSEA");
        spaceship.back(100);
    }
}


/*
 * ������ʹ�ü̳з�����ǿ����̳��������з���
 * 	SpaceShipControls�����з�����SpaceShip�ж���¶������
 */
class SpaceShip extends SpaceShipControls {
    private String name;

    public SpaceShip(String name) {
        this.name = name;
    }

    void back(int i) {
        System.out.println("�ɴ�����");
    }
}



