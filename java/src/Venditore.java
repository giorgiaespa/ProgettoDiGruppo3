public class Venditore extends Utente{
    private long telefono;
    private String nomeAzienda;

    public Venditore(String nome, String cognome, String email, String password,long telefono, String nomeAzienda) {
        super(nome, cognome, email, password);
        this.telefono = telefono;
        this.nomeAzienda = nomeAzienda;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    @Override
    public String toString() {
        return "Venditore{" +
                "telefono=" + telefono +
                ", nomeAzienda='" + nomeAzienda + '\'' +
                '}';
    }
}
