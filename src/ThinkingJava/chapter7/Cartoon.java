package ThinkingJava.chapter7;

/**
 * @Project : JavaBookCodeDemo
 * @Package Name : ThinkingJava.chapter7
 * @Author : soupcat
 * @Creation Date : 2018年08月20日 下午9:43
 * @Describe : 7.1 继承语法 7.1.2初始化基类
 * Constructor calls during inheritance
 */
class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    public Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
