public class Main {
    public static void main(String[] args) {
        Player player = new Player("Sara", 2, 6);
        player.roll();
        System.out.println(player);
        player.cheatroll();
        System.out.println(player);
    }
}