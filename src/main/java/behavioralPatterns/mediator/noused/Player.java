package behavioralPatterns.mediator;

public class Player {
    // 初始资金为100元
    public int money = 100;

    public void win(Player player, int money) {
        player.money -= money;
        this.money += money;
    }
}
