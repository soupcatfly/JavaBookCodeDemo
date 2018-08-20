package ThinkingJava.chapter7;

/**
 * @Project : HelloWorld
 * @Package Name : ThinkingJava.chapter7
 * @Author : soupcat
 * @Creation Date : 2018年08月18日 下午1:33
 * @Describe : 描述 java编程思想 第七章
 */

class WaterSource {
    private String s;
    WaterSource(){
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class SprinkerSystem {
    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();
    private int         i;
    private float       f;

    @Override
    public String toString() {
        return "value1 = " + value1 + " " +
                "value2 = " + value2 + " " +
                "value3 = " + value3 + " " +
                "value4 = " + value4 + "\n" +
                "i = " + i + " " + "f = " + f + " " +
                "source = " + source;
    }

    public static void main(String[] args) {
        SprinkerSystem sprinker = new SprinkerSystem();
        System.out.println(sprinker);
    }
}
