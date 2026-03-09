public class Paciente extends Pessoa{
    // Atributos
    private String telefone;

    public String getTelefone() {
        return telefone;
    }
    
    // Método - Ação - Sobrescrita
    @Override
    public void verConsulta() {
        System.out.println("Visualizando consultas dos pacientes...");
    }



    
    
}
