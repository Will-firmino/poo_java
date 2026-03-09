// abstract -> Informa que essa classe não pode ser instânciada(copiada).
public abstract class Pessoa {
    // Atributos - private -> Informa que o atributo só pode ser acessado na classe Pessoa ou através dos métodos get/set.
    private String nome;
    private String email;

    // Métodos get/set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Método - Ação
    public void verConsulta() {
        System.out.println("Visualizando consultas...");
    } 

    
  

}
