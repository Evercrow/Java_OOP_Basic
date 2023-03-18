package org.Seminar8;

public abstract class Animal {

    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected String type;
    static int count;

    public Animal(String name, int maxRunDistance, int maxSwimDistance, String type) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.type = type;
        count++;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(this.name + " может пробежать " + distance + " м.");
        } else {
            System.out.println(this.name + " не может пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(this.name + " не умеет плавать.");
            return;
        }
        if (distance <= maxSwimDistance) {
            System.out.println(this.name + " может проплыть " + distance + " м.");
        } else {
            System.out.println(this.name + " не может проплыть " + distance + " м.");
        }
    }

}
