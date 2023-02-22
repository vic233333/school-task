package code_list_two;

import java.util.Arrays;

public class Apply {
    /*
     * �÷������Խ����κ����͵�Processor�����࣬��Ӧ�õ�һ��Object�����ϡ�������������һ���ܹ����������ݵĲ�������Ĳ�ͬ�����в�ͬ��Ϊ�ķ���������Ϊ�������ģʽ
     * 	���Ծ��Ǵ��ݽ�ȥ�Ĳ�������main�����п��Կ��������в�ͬ���͵Ĳ������õ�String���͵Ķ�����
     */
    public static void process(Processor p, Object s) {
        System.out.println("���֣�" + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        String s = "AA AAAaa aa";
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}

class Processor {
    public String name() {
        return this.getClass().getSimpleName();
    }//

    public Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
