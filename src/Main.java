public class Main {
    public static void main(String[] args) {
        Player player = new Player(100, 10, 50, 30, 20);
        Monster monster = new Monster(100, 10, 50, 30, 20);
        while (monster.isAlive() && player.isAlive()){
            player.kick(monster);
            monster.kick(player);
        }
        if (player.isAlive()) {
            System.out.println("Победил игрок");
        } else {
            System.out.println("Победил монстр");
        }
    }
}