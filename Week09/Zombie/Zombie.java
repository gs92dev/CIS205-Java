/*
 * Guilherme dos Santos
 * 10/24/2024
 * In class activity
 */

public class Zombie {

    // Attributes: name: String, health: int, strength:int & isAlive: boolean
    // Write your code here
    private String name;
    private int health;
    private int strength;
    private boolean isAlive;

    // Constructors
    // Constructor with all attributes
    public Zombie(String name, int health, int strength, boolean isAlive) {
        // Write your code here
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.isAlive = isAlive;
    }

    // Default constructor
    public Zombie() {
        // Default name is "Zombie", health is 50, strength is 10, and isAlive is true
        this("Zombie", 50, 10, true);
        // Note: use this as a guide for the other constructors
    }

    // Constructor with name and health
    public Zombie(String name, int health) {
        // Default strength is 10 and isAlive is true
        // Write your code here
        this(name, health, 10, true);
    }

    // Constructor with name, health, and strength
    public Zombie(String name, int health, int strength) {
        // Default isAlive is true
        // Write your code here
        this(name, health, strength, true);
    }

    // Constructor with name and strength
    public Zombie(String name, int strength, boolean isAlive) {
        // Default health is 50
        // Write your code here
        this(name, 50, strength, isAlive);
    }

    // Constructor with name and isAlive
    public Zombie(String name, boolean isAlive) {
        // Default health is 50 and strength is 10
        // Write your code here
        this(name, 50, 10, isAlive);
    }

    // Constructor with name
    public Zombie(String name) {
        // Default health is 50, strength is 10, and isAlive is true
        // Write your code here
        this(name, 50, 10, true);
    }

    // Constructor with health
    public Zombie(int health) {
        // Default name is "Zombie", strength is 10, and isAlive is true
        // Write your code here
        this("Zombie", health, 10, true);
    }

    // Getter and Setter methods
    public String getName() {
        // Write your code here
        return this.name;
    }

    public void setName(String name) {
        // Write your code here
        this.name = name;
    }

    public int getHealth() {
        // Write your code here
        return this.health;
    }

    public void setHealth(int health) {
        // Write your code here
        this.health = health;
    }

    public int getStrength() {
        // Write your code here
        return this.strength;
    }

    public void setStrength(int strength) {
        // Write your code here
        this.strength = strength;
    }

    public boolean isAlive() {
        // Write your code here
        return this.isAlive;
    }

    public void setAlive(boolean alive) {
        // Write your code here
        this.isAlive = alive;
    }

    // Method for zombie to take damage
    public void takeDamage(int damage) {
        if (this.isAlive) {
            // reduced the health by the amount of damage
            System.out.println(name + " takes " + damage + " damage.");
            this.setHealth(this.getHealth() - damage);
            if (this.getHealth() <= 0) {
                // set isAlive to false
                this.setAlive(false);
                // set health to 0
                this.setHealth(0);
                // print that the zombie(zombie's name) is dead now
                System.out.println(this.getName() + " is dead now.");
            } else {
                // print how much health is left for the zombie (zombie's name)
                System.out.println(this.getName() + " has " + this.getHealth() + " health left.");
            }
        } else {
            // print that the zombie(zombie's name) is already dead
            System.out.println(this.getName() + " is already dead.");
        }
    }

    // Method for zombie to attack
    public void attack(Zombie other) {
        if (this.isAlive) {
            System.out.println(this.getName() + " attacks " + other.getName() + " for " + strength + " damage.");
            other.takeDamage(strength);
        } else {
            System.out.println(name + " cannot attack because it is dead.");
        }
    }

    // add a toString method
    // Write your code here
    public String toString() {
        return "Name: " + this.getName() + ", Health: " + this.getHealth() + ", Strength: " + this.getStrength()
                + ", isAlive: " + this.isAlive();
    }

    // Main method for testing the Zombie class
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("Zombie1", 50, 15, true);
        Zombie zombie2 = new Zombie("Zombie2");

        System.out.println(zombie1.getName() + " has " + zombie1.getHealth() + " health and " + zombie1.getStrength()
                + " strength.");
        System.out.println(zombie2.getName() + " has " + zombie2.getHealth() + " health and " + zombie2.getStrength()
                + " strength.");

        zombie1.attack(zombie2);
        zombie2.attack(zombie1);

        zombie2.takeDamage(60);
        zombie2.attack(zombie1);

        System.out.println(zombie1);
        System.out.println(zombie2);
    }

    /*
     * output:
     * Zombie1 has 50 health and 15 strength.
     * Zombie2 has 50 health and 10 strength.
     * Zombie1 attacks Zombie2 for 15 damage.
     * Zombie2 takes 15 damage.
     * Zombie2 has 35 health left.
     * Zombie2 attacks Zombie1 for 10 damage.
     * Zombie1 takes 10 damage.
     * Zombie1 has 40 health left.
     * Zombie2 takes 60 damage.
     * Zombie2 is dead now.
     * Zombie2 cannot attack because it is dead.
     * Name: Zombie1, Health: 40, Strength: 15, isAlive: true
     * Name: Zombie2, Health: 0, Strength: 10, isAlive: false
     */
}
