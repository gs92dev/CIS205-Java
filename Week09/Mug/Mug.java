package Mug;

/*
 * Guilherme dos Santos
 * Assignment 8
 * 10/26/2024
 */

public class Mug {

    private String color;
    private int capacity;
    private boolean isFull;

    public Mug(String color, int capacity) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void fill() {
        if (!this.isFull) {
            System.out.println("The mug is now full.");
        } else {
            this.isFull = true;
            System.out.println("The mug is already full.");
        }
    }

    public void empty() {
        if (this.isFull) {
            this.isFull = false;
            System.out.println("The mug is now empty.");
        } else {
            System.out.println("The mug is already empty.");
        }
    }
}