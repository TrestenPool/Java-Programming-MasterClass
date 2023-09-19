package p3;

public class Dog extends Mammal{
    boolean has_flappy_ears;

    public Dog(String name, String furr_color, boolean has_flappy_ears) {
        super(name, furr_color);
        this.has_flappy_ears = has_flappy_ears;
    }

    @Override
    public void move() {
        System.out.println("Moving with my 4 legs");
    }

    @Override
    public String toString() {
        return super.toString() + " has_flappy_ears: " + this.has_flappy_ears;
    }
}
