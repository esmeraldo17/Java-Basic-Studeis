public class App {
    public static void main(String[] args) throws Exception {
        // Operadores aritmeticos

        int adicao = 34 + 56;
        int subtracao = 1500 - 499;
        int multiplicacao = 4 * 6;
        int divisao = 80 / 20;
        int modulo = 10 % 8;


        // Operadores unarios

        int negNum = 5;

        negNum = -negNum;
        System.out.println(negNum);

        int posNum = negNum * -1; // forma de tornar um numero positivo
        System.out.println(posNum);

        posNum++; // incremento
        System.out.println(posNum);
        System.out.println(++ posNum);

        posNum--; // decremento
        System.out.println(posNum);
        System.out.println(-- posNum);

        boolean verify = true;
        System.out.println(!verify);

        // Operador ternario

        int a, b;
        a = 5;
        b = 6;
        String resultado = a==b ? "verdadeira" : "falso";
        System.out.println(resultado);

        
    }
}
