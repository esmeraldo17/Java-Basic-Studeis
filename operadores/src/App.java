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
    }
}
