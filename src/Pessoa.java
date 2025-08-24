public abstract class Pessoa
{
    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public abstract String getTipoVoz();
}
