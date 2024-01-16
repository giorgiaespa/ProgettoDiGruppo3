import java.math.BigDecimal;
enum StatoOrdine{
    IN_ATTESA,
    IN_LAVORAZIONE,
    COMPLETATO
}
public class OrdineOAcquisto {
    private BigDecimal anticipo;
    private boolean pagato;
    private StatoOrdine stato;

    public OrdineOAcquisto(BigDecimal anticipo, boolean pagato, StatoOrdine stato) {
        this.anticipo = anticipo;
        this.pagato = pagato;
        this.stato = stato;
    }

    public BigDecimal getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(BigDecimal anticipo) {
        this.anticipo = anticipo;
    }

    public boolean isPagato() {
        return pagato;
    }

    public void setPagato(boolean pagato) {
        this.pagato = pagato;
    }

    public StatoOrdine getStato() {
        return stato;
    }

    public void setStato(StatoOrdine stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "OrdineOAcquisto{" +
                "anticipo=" + anticipo +
                ", pagato=" + pagato +
                ", stato=" + stato +
                '}';
    }
}
