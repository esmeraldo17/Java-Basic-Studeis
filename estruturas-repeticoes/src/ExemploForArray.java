public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Esmeraldo","Edon","Carlos","Antonio"};

        // for (int x = 0; x < alunos.length; x++){
        //     System.out.println("o alunos no indice x=" + x + " e " + alunos[x]);
        // }
        // for each: usado para iteragir sobre os elementos de um array
        for (String aluno : alunos){
            System.out.println("Nome do aluno e: " + aluno);
        }
    }
}
