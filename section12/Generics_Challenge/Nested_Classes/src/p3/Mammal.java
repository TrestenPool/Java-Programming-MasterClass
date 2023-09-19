package p3;

public abstract class Mammal implements Animal {
    private String name;
    private String furr_color;

    public Mammal(String name, String furr_color) {
        this.name = name;
        this.furr_color = furr_color;
    }

    public void sweat(){
        System.out.println("sweating just like all mammals do");
    }

    @Override
    public void eat() {
        System.out.println("eating just like all mammals do with my mouth");
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", furr_color='" + furr_color + '\'' +
                '}';
    }
}
