package p3;

public class Cat extends Mammal {
    private int num_hairballs;

    public Cat(String name, String furr_color, int num_hairballs) {
        super(name, furr_color);
        this.num_hairballs = num_hairballs;
    }

    @Override
    public void move() {
        System.out.println("moving like a little kitty does");
    }
}
