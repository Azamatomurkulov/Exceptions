public class Calc {

    public void calc(int a){
        if(a==0){
            throw new ArithmeticException("Ваше число должно быть больше нуля.");
        }
        System.out.println(42/a);
    }
}
