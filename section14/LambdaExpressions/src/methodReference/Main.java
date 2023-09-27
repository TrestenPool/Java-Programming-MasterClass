package methodReference;

import java.util.function.Supplier;

class Test{
    public static int ID_GENERATOR = 1000;
    private int id;

    public Test() {
        id = ID_GENERATOR++;
        System.out.println("Created Test object with id: " + this.id);
    }
}

public class Main {
    public static void main(String[] args) {
        seedArray(Test::new, 10);
    }

    public static Test[] seedArray(Supplier<Test> reference, int count){
        Test[] testArray = new Test[count];
        for(int i = 0; i < count; i++){
            testArray[i] = reference.get();
        }
        return testArray;
    }

}
