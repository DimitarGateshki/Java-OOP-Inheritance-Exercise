package PlayersAndMonsters;

public class Hero {
    private String Username;
    private int level;

    public String getUsername() {
        return Username;
    }

    public int getLevel() {
        return level;
    }

    public Hero(String name, int level) {
        this.Username = name;
        this.level = level;
    }
    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %d",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }
}
