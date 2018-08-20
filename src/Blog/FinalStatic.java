package Blog;

import java.util.Random;

public class FinalStatic {
    public static final int A = 4 + new Random().nextInt(10);

    static {
        System.out.println("如果执行了，证明类初始化了……");
    }
}
