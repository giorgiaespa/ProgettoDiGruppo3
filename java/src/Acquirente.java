public class Acquirente extends Utente {
    private long telefono;

    public Acquirente(String nome, String cognome, String email, String password, long telefono) {
        super(nome, cognome, email, password);
        this.telefono = telefono;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Acquirente{" +
                "telefono=" + telefono +
                '}';
    }
}
