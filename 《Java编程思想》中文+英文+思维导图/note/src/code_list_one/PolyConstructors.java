package code_list_one;

//�������ڲ��Ķ�̬����
public class PolyConstructors {
    public static void main(String[] args) {//1.Ѱ���Ƿ���ڻ���
        new RoundGlyph(5);
    }
}

class Glyph {
    public Glyph() {//3.���û���Ĺ�����
        System.out.println("Glyph������ǰ��");
        draw();
        /*4.ִ�е���һ�����ͻ���Ϊ��̬��ԭ�򣬵��õ��ǵ������draw()�����������ǻ���ģ�������ʱ�򵼳����draw()������û�г�ʼ������ʱ��ͻ�������ݴ���(radiusΪ0��������Ĭ��ֵ1)
         *	 ��Ϊ�ڻ�û�з�����֮ǰ�����������Ĵ洢�ռ��ʼ��Ϊ�����Ƶ��㡣���Դ�ӡ����ֵ��0
         */
        System.out.println("Glyph����������");
    }

    public void draw() {
        System.out.println("Glyph.draw");
    }
}

class RoundGlyph extends Glyph {//2.���ڻ��࣬ȥ������
    private int radius = 1;//5.��ʼ����Ա������radius��ֵΪ1

    public RoundGlyph(int r) {//6.���ù�������radius��ֵΪ5
        radius = r;
        System.out.println("RoundGlyph������,radius=" + radius);//7.���õ���һ����radius��ֵ�ͱ���ֵΪ5��
    }

    public void draw() {
        System.out.println("RoundGlyph.draw,radius=" + radius);
    }
}
