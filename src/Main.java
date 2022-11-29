import java.util.Locale;

public class Main {

    public static void main(String[] args){


        Calc calc = new Calc();

        try{
            calc.calc(0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("После блока обработки исключений.");
        }
        System.out.println();




        int [] m = new int[2];

        try{
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("После блока try catch.");
        }
        System.out.println();




        try {
            String s = null;
            String b = s.toLowerCase();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("После блока try catch.");
        }
    }
}
