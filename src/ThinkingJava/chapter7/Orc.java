package ThinkingJava.chapter7;

/**
 * @Project : JavaBookCodeDemo
 * @Package Name : ThinkingJava.chapter7
 * @Author : soupcat
 * @Creation Date : 2018年08月22日 下午10:18
 * @Describe : 描述
 */
class Villain {
    private String name;

    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
        System.out.println("1");
    }

    @Override
    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}

public class Orc extends Villain {
//    Villain villain = new Villain("!");
    private int number;

    public Orc(String name, int number) {
        super(name);
        this.number = number;
        System.out.println("2");
    }

    public void chang(String name, int number) {
        set(name);
        this.number = number;
    }

    @Override
    public String toString() {
        return "Orc " + number + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("soupcat", 213);
        System.out.println(orc);
        orc.chang("zhangtianfeng", 111);
        System.out.println(orc);
    }
}
