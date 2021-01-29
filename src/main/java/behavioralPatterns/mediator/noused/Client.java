package behavioralPatterns.mediator;

import org.junit.Test;

public class Client {
    @Test
    public void test() {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        // player1 赢了 player3 5 元
        player1.win(player3, 5);
        // player2 赢了 player1 10 元
        player2.win(player1, 10);
        // player2 赢了 player4 10 元
        player2.win(player4, 10);
        // player4 赢了 player3 7 元
        player4.win(player3, 7);

        // 输出：四人剩余的钱：105,120,88,97
        System.out.println("四人剩余的钱：" + player1.money + "," + player2.money + "," + player3.money + "," + player4.money);
    }
}
