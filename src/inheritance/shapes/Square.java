package inheritance.shapes;

//import inheritance.abstraction.abstraction.abstraction.shapes.Rectangle;

public class Square extends Rectangle {
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    public void printOrigins(String what){
        System.out.println(" What I'm I . .? ");
    }
}
