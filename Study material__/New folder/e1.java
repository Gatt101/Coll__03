class AgeInvalidException extends Exception{

AgeInvalidException(){
   super("age is invalid !");

}
AgeInvalidException(String message){
    super(message);
}

}

public class e1{
    public static void main(String[] args) {
System.out.println("Program Started");
        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println("We have got two numbers");
            int res = n1 / n2;
            System.out.println("Divison is " + res);
 if (n2>5){
                throw new AgeInvalidException();
            }

        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
            System.out.println(e.getMessage());

        }
catch(AgeInvalidException e){
            System.out.println("Invalid message");
            System.out.println(e.getMessage());
        }
   catch(NumberFormatException e){
            System.out.println("please neter a valid input");
            System.out.println(e.getMessage());

        }
catch(Exception e){
System.out.println("Under exception");
            System.out.println(e.getMessage());

}
finally{
            System.out.println("finally block");
        }
        System.out.println("Program ended");
    }

}
