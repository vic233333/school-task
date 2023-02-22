package code_list_one;

public class StaticPolymorphism {
    public static void main(String[] args) {

        StaticSuper staticSuper = new StaticSub();
        String staticGet = staticSuper.staticGet();
        System.out.println(staticGet);
        /*
         * ���ǵ��þ�̬�������û��������ָ�򵼳�����󣬵����õ��ǻ���ľ�̬���������Զ��ھ�̬�����ǲ����ڶ�̬��
         */

        String dynamicGet = staticSuper.dynamicGet();
        System.out.println(dynamicGet);
        /*
         * ���ַǾ�̬�����������Ĳ�ͬ�ˣ����õ��ǵ�����ķ���
         */
    }
}

class StaticSuper {
    //����һ����̬����
    public static String staticGet() {
        return "StaticSuper.staticGet()";
    }

    //����һ���Ǿ�̬����
    public String dynamicGet() {
        return "StaticSuper.dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    //���ǵ������һ����̬�����������ڶ�̬
    public static String staticGet() {
        return "StaticSub.staticGet()";
    }

    public String dynamicGet() {
        return "StaticSub.dynamicGet()";
    }
}
