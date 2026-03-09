public class Medico extends Pessoa{

    private Integer crm;

    public Integer getCrm() {
        return crm;
    }

    // Método - Ação - Sobrescrita
    @Override
    public void verConsulta() {
        System.out.println("Visualizando consultas dos médicos...");
    }

    


}
