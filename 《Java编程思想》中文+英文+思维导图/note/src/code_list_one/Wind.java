package code_list_one;

public class Wind extends Instrument {

    public static void main(String[] args) {
        Wind wind = new Wind();
        Instrument.tune(wind);//����������ת��
        /*
         * ����������ת�ͣ�
         * 		�ɵ�����ת�ͳɻ��࣬�ڼ̳�ͼ�������ƶ��ġ���������ת���Ǵ�һ��  ��ר������  ��  ��ͨ������  ת�����������ǰ�ȫ��(�����п��ܳ��ֵ����෽���Ķ�ʧ)��
         * 		Ҳ����˵�������ǻ����һ�������������ܱȻ��ຬ�и���ķ����������������پ߱������������еķ�����
         */
    }

}

class Instrument {
    public void play() {
        System.out.println("Instrument.play");
    }

    public static void tune(Instrument i) {
        i.play();
    }
}