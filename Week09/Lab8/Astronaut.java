/*
 * Guilherme dos Santos
 * Lab 8
 * 10/26/2024
 */

public class Astronaut {

    private String name;
    private double weight;
    private String position;

    // No fields. Default name to “TBD”, weight to 200 and position to “Crew”.
    public Astronaut() {
        this("TBD", 200, "Crew");
    }

    // Name only. Default the weight to 200 and the position to “Crew”.
    public Astronaut(String name) {
        this(name, 200, "Crew");
    }

    // Name and weight. Default the position to “Crew”.
    public Astronaut(String name, double weight) {
        this(name, weight, "Crew");
    }

    // Name, weight and position.
    public Astronaut(String name, double weight, String position) {
        this.name = name;
        this.weight = weight;
        this.position = position;
    }

    // Have methods to set each of these fields.
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Note that all variables are private.
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getPosition() {
        return position;
    }

    // Print out the details for an astronaut.
    public String toString() {
        return "Name: " + name + "\nWeight: " + weight + "\nPosition: " + position + "\n";
    }

    public static void main(String[] args) {
        Astronaut astronaut1 = new Astronaut();
        Astronaut astronaut2 = new Astronaut("Togar");
        Astronaut astronaut3 = new Astronaut("llana", 113.2);

        System.out.println("Astronaut 1:");
        System.out.println(astronaut1);
        System.out.println("Astronaut 2:");
        System.out.println(astronaut2);
        System.out.println("Astronaut 3:");
        System.out.println(astronaut3);

        astronaut3.setPosition("Commander");
        System.out.println("Astronaut 3:");
        System.out.println(astronaut3);

    }

    /*
     * Output:
     * Astronaut 1:
     * Name: TBD
     * Weight: 200.0
     * Position: Crew
     * 
     * Astronaut 2:
     * Name: Togar
     * Weight: 200.0
     * Position: Crew
     * 
     * Astronaut 3:
     * Name: llana
     * Weight: 113.2
     * Position: Crew
     * 
     * Astronaut 3:
     * Name: llana
     * Weight: 113.2
     * Position: Commander
     */
}
