public class Pai extends Avo {

    private String Nacionalidade;

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    public void getNacionalidade() {
        this.Nacionalidade = Nacionalidade;
    }

    @Override
    public String getTipoVoz() {
        return "Pai";
    }
}
