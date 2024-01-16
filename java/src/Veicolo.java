import java.math.BigDecimal;
import java.time.OffsetDateTime;

enum Tipo{
    AUTO,
    MOTO,
    SCOOTER,
    FURGONI
}
enum StatoVeicolo{
    ORDINABILE,
    ACQUISTABILE,
    NON_DISPONIBILE
}
public class Veicolo {
    private String modello;
    private long cilindrata;
    private String colore;
    private int potenza;
    private String tipoCambio;
    private OffsetDateTime annoMatricolazione;
    private String alimentazione; //idrogeno!
    private BigDecimal prezzo;
    private int percentualeSconto; //EVENTUALE
    private String optional; //EVENTUALI
    private boolean nuovo;
    private Tipo tipo;
    private StatoVeicolo stato;

    public Veicolo(String modello, long cilindrata, String colore, int potenza, String tipoCambio,
                   OffsetDateTime annoMatricolazione, String alimentazione, BigDecimal prezzo,
                   int percentualeSconto, String optional, boolean nuovo, Tipo tipo, StatoVeicolo stato) {
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.colore = colore;
        this.potenza = potenza;
        this.tipoCambio = tipoCambio;
        this.annoMatricolazione = annoMatricolazione;
        this.alimentazione = alimentazione;
        this.prezzo = prezzo;
        this.percentualeSconto = percentualeSconto;
        this.optional = optional;
        this.nuovo = nuovo;
        this.tipo = tipo;
        this.stato = stato;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public long getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(long cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getPotenza() {
        return potenza;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public OffsetDateTime getAnnoMatricolazione() {
        return annoMatricolazione;
    }

    public void setAnnoMatricolazione(OffsetDateTime annoMatricolazione) {
        this.annoMatricolazione = annoMatricolazione;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public int getPercentualeSconto() {
        return percentualeSconto;
    }

    public void setPercentualeSconto(int percentualeSconto) {
        this.percentualeSconto = percentualeSconto;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }

    public boolean isNuovo() {
        return nuovo;
    }

    public void setNuovo(boolean nuovo) {
        this.nuovo = nuovo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public StatoVeicolo getStato() {
        return stato;
    }

    public void setStato(StatoVeicolo stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "modello='" + modello + '\'' +
                ", cilindrata=" + cilindrata +
                ", colore='" + colore + '\'' +
                ", potenza=" + potenza +
                ", tipoCambio='" + tipoCambio + '\'' +
                ", annoMatricolazione=" + annoMatricolazione +
                ", alimentazione='" + alimentazione + '\'' +
                ", prezzo=" + prezzo +
                ", percentualeSconto=" + percentualeSconto +
                ", optional='" + optional + '\'' +
                ", nuovo=" + nuovo +
                ", tipo=" + tipo +
                ", statoVeicolo=" + stato +
                '}';
    }
}
