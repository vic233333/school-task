package code_list_two;

import java.util.Random;

public class TestRandVals {
    public static void main(String[] args) {
        System.out.println(RandVals.RANDOM_INT);
        System.out.println(RandVals.RANDOM_LONG);
        System.out.println(RandVals.RAND_FLOAT);
        System.out.println(RandVals.RAND_DOUBLE);

        System.out.println(RandVals.RANDOM_INT);
        System.out.println(RandVals.RANDOM_LONG);
        System.out.println(RandVals.RAND_FLOAT);
        System.out.println(RandVals.RAND_DOUBLE);
        //���۱����ʶ��ٴΣ�һ������ʼ�������ǵ�ֵ����Ψһ��
        System.out.println(RandVals.RANDOM_INT);
        System.out.println(RandVals.RANDOM_LONG);
        System.out.println(RandVals.RAND_FLOAT);
        System.out.println(RandVals.RAND_DOUBLE);
        /*
         * һ������ʼ������ô�ӿ�RandVals�е�������Ѿ�ȷ���ˣ������Ƿ��ʶ��ٴζ��ǲ���ı�ġ������Ǵ洢��һ�����������
         * 	��Ȼ����Щ�򲢲��ǽӿڵ�һ���֣����ǵ�ֵ���洢�ڸýӿڵľ�̬�洢�����ڡ�
         */
    }
}

interface RandVals {
    Random RAND = new Random();
    int RANDOM_INT = RAND.nextInt();
    long RANDOM_LONG = RAND.nextLong();
    float RAND_FLOAT = RAND.nextLong();
    double RAND_DOUBLE = RAND.nextDouble();
    /*
     * �ӿ��е���������Ĭ����static��final
     */
}