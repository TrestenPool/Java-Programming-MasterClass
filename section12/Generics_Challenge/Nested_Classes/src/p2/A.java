package p2;

// outer class
public class A {
    private String aName;

    public A(String aName) {
        this.aName = aName;
    }
    
    public void printMessage(){
        class compliment{
            private String comp;
            public compliment(String comp){
                this.comp = comp;
            }
            public String getComp() {
                return comp;
            }
        }
        System.out.println(aName + ", you look " + new compliment("GREAT").getComp());
    }
}
