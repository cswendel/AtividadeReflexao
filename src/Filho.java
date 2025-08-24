public class Filho extends Pai
{
    private String DataNascimento;

    public String getDataNascimento(){
        return "";
    }

    public void setDataNascimento(String DataNascimento){
        this.DataNascimento = DataNascimento;
    }

    @Override
    public String getTipoVoz() {
        return "Filho";
    }
}
