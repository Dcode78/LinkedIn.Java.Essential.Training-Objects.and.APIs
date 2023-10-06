package exceptions;

public class ThrowingExceptions {

    public static double calculatePay(double hours, double payRate) throws NegativeInputException, IllegalArgumentException{
       if (hours > 40){
           throw new IllegalArgumentException("Hours must be 40 or less");
       }
       if (hours < 0 || payRate < 0){
           throw new NegativeInputException();
       }
       return hours * payRate;
    }

    public static void main(String[] args) {
        try {
            System.out.println(calculatePay(22.3, 55.2));
            //System.out.println(calculatePay(41, 10.0)); //hours greater than 40
            System.out.println(calculatePay(22.3, -10.0)); //payRate less than 0
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        }
    }