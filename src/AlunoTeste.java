import classes.Aluno;

public class AlunoTeste {

    public static void main(String[] args) {

        Aluno [] alunos = new Aluno[3];


        Aluno aluno = new Aluno();
        aluno.nome = "Pedrinho";
        aluno.numChamada = 28;
        aluno.rm = 87330;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Luiz";
        aluno2.numChamada = 19;
        aluno2.rm = 87254;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Armando";
        aluno3.numChamada = 39;
        aluno3.rm = 89190;

        // Adicionando no vetor

        alunos[0] = aluno;
        alunos[1] = aluno2;
        alunos[2] = aluno3;

        // Listando as turmas

        // FOR IT
        for(Aluno a: alunos) {
            System.out.println("Aluno nome: " + a.nome);
            System.out.println("Aluno n°: " + a.numChamada);
            System.out.println("Aluno rm: " + a.rm);
            System.out.println("/-------------------/");
        }
    }
}
