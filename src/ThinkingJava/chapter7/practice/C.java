package ThinkingJava.chapter7.practice;

/**
 * @Project : JavaBookCodeDemo
 * @Package Name : ThinkingJava.chapter7.practice
 * @Author : soupcat
 * @Creation Date : 2018年08月21日 下午10:06
 * @Describe : 7.1 继承语法 练习5
 */
class A {
    public A() {
        System.out.println("A");
    }
}

class B {
    public B() {
        System.out.println("B");
    }
}


public class C extends A {
    private B b;

    public static void main(String[] args) {
        C c = new C();
    }
}
