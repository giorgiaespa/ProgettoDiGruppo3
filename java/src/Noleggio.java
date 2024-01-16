import java.time.OffsetDateTime;

public class Noleggio {
    private OffsetDateTime inizioNoleggio;
    private OffsetDateTime fineNoleggio;
    private boolean pagato;
    private Veicolo veicolo;

    public Noleggio(OffsetDateTime inizioNoleggio, OffsetDateTime fineNoleggio, boolean pagato, Veicolo veicolo) {
        this.inizioNoleggio = inizioNoleggio;
        this.fineNoleggio = fineNoleggio;
        this.pagato = pagato;
        this.veicolo = veicolo;
    }

    public OffsetDateTime getInizioNoleggio() {
        return inizioNoleggio;
    }

    public void setInizioNoleggio(OffsetDateTime inizioNoleggio) {
        this.inizioNoleggio = inizioNoleggio;
    }

    public OffsetDateTime getFineNoleggio() {
        return fineNoleggio;
    }

    public void setFineNoleggio(OffsetDateTime fineNoleggio) {
        this.fineNoleggio = fineNoleggio;
    }

    public boolean isPagato() {
        return pagato;
    }

    public void setPagato(boolean pagato) {
        this.pagato = pagato;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }

    @Override
    public String toString() {
        return "Noleggio{" +
                "inizioNoleggio=" + inizioNoleggio +
                ", fineNoleggio=" + fineNoleggio +
                ", pagato=" + pagato +
                ", veicolo=" + veicolo +
                '}';
    }
}
