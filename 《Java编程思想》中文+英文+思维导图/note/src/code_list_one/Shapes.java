package code_list_one;

import java.util.Random;

public class Shapes {
    private static RandomShapeGen randomShapeGen = new RandomShapeGen();

    public static void main(String[] args) {
        /*
         * �����д  ֻ��  ����  �򽻵��Ĵ���
         * 	���ǲ����Ĵ������뵼����򽻵��ģ��������ڶ�̬��ʵ�ֶ�̬�Ĵ���
         */
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = randomShapeGen.next();
        }
        for (Shape shape : s) {//�������������б���
            shape.draw();
        }
        Shape s1 = new Quadrilateral();
        s1.draw();
        s1.erase();
    }
}

class Shape {
    //ʲôҲ��д����������������Щ����
    public void draw() {
    }

    public void erase() {
    }
}

class Circle extends Shape {
    @Override//���ע�����ã���������д��ȴ���¶�����һ���������ͻᱨ��
    public void draw() {
        System.out.println("Circle.draw");
    }

    public void erase() {
        System.out.println("Circle.erase");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Square.draw");
    }

    public void erase() {
        System.out.println("Square.erase");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle.draw");
    }

    public void erase() {
        System.out.println("Triangle.erase");
    }
}

class Quadrilateral extends Shape {
    public void draw() {
        System.out.println("Quadrilateral.draw");
    }

    public void erase() {
        System.out.println("Quadrilateral.erase");
    }
}

class RandomShapeGen {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)) {//ֻ����012��������
            //�����������������ͬ���������ز�ͬ������
            default:
                //��������ת�ͷ�����return����У���һ��������ת��Ϊһ������
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}