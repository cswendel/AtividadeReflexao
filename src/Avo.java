public class Avo extends Pessoa
{
    private int Idade;

    public int getIdade(){
        return Idade;
    }

    public void setIdade(int Idade){
        this.Idade = Idade;
    }

    @Override
    public String getTipoVoz() {
        return "Avô";
    }
}
