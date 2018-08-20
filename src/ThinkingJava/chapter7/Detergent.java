package ThinkingJava.chapter7;

/**
 * @Project : HelloWorld
 * @Package Name : ThinkingJava.chapter7
 * @Author : soupcat
 * @Creation Date : 2018年08月20日 下午8:41
 * @Describe : 描述
 */
class Cleaner {
    private String s = "Cleaner";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner();
        cleaner.dilute();
        cleaner.apply();
        cleaner.scrub();
        System.out.println(cleaner);
    }
}

public class Detergent extends Cleaner {
    @Override
    public void scrub() {
        append(" Detergent.scrub");
        super.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
        System.out.println("Testing base class:");
        Cleaner.main(args);
    }
}

class Detergent2 extends Detergent {
    @Override
    public void scrub() {
        append(" 2");
        super.scrub();
    }

    public void sterilize() {

    }

    public static void main(String[] args) {
        Detergent2 detergent2 = new Detergent2();
        detergent2.dilute();
        detergent2.apply();
        detergent2.scrub();
        detergent2.foam();
        detergent2.sterilize();
        System.out.println(detergent2);
    }
}
