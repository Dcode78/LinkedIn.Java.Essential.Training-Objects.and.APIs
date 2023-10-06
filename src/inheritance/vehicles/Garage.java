package inheritance.vehicles;

public class Garage {

    public static void main(String[] args) {
        Coupe myCar = new Coupe();
        myCar.setColor("Red");
        String s = myCar.getClass().toString();
        String className = "";

            for(int i = 0; i < s.length()-1; i++){
                if (Character.isUpperCase(s.charAt(i))){
                    do {
                        className += s.charAt(i);
                        i++;
                    }while (i < s.length()-1);
                    System.out.println("break");
                }
            }
        System.out.println(
                String.format("My Car is a %s, it has %s doors and it is %s.",
                        className, myCar.getDoors(), myCar.getColor()));

    }
}
