package ThinkingJava.chapter7;

/**
 * @Project : JavaBookCodeDemo
 * @Package Name : ThinkingJava.chapter7
 * @Author : soupcat
 * @Creation Date : 2018年08月21日 下午10:13
 * @Describe : 描述
 */
class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
