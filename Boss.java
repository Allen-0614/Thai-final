public class Boss {
    private int health;
    private String name;
    
    public Boss(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public void Attack(Player player, boolean success, int damage){
        if (success) {
            player.setHealth(player.getHealth() - damage);
            System.out.println("");
            return ;
        }
        System.out.println("");
        return;
    }
}
