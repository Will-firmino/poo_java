public class Aluno {
    String nome;
    Integer idade;
    String cpf;
    Boolean matricula = true;

    public void trancarMatricula() {
        matricula = false;
    }

    public void ativarMatricula() {
        matricula = true;
    }
    
}

// String, int, float, boolean, char -> Tipos primitivos em Java.
// Classes Wrappers
// String = String, int = Integer, float = Float, boolean = Boolen, char = Char

// Arquivo/classe -> PascalCase
// Variáveis -> cammelCase
// Funções -> cammelCase
