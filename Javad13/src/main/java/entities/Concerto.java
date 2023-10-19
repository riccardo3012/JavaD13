package entities;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

public class Concerto extends Evento {
    public Concerto(LocalDate now, String s, TipoEvento tipoEvento, int i, Location l1) {
        super(now, s, tipoEvento, i, l1);
    }

    public enum GenereConcerto {
        CLASSICO, ROCK, POP
    }



    @Enumerated(EnumType.STRING)
    private GenereConcerto genere;
    private boolean inStreaming;

    public Concerto(LocalDate now, String s, TipoEvento tipoEvento, int i, Location l1, GenereConcerto genere, boolean inStreaming) {
        super(now, s, tipoEvento, i, l1);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public GenereConcerto getGenere() {
        return genere;
    }

    public void setGenere(GenereConcerto genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }
}