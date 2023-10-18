import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name = "eventi")
public class Evento {
    @Id
    @GeneratedValue
    private long id;

    public class evento {


        private int ID;
        private String titolo;
        private Date dataEvento;
        private String descrizione;

        private TipoEvento tipoEvento;
        private Integer numeroMassimoPartecipanti;

        public enum TipoEvento {
            PUBBLICO, PRIVATO
        }

        public evento() {
        }

        public evento(String titolo, Date dataEvento, String descrizione, TipoEvento tipoEvento,
                      Integer numeroMassimoPartecipanti) {
            this.titolo = titolo;
            this.dataEvento = dataEvento;
            this.descrizione = descrizione;
            this.tipoEvento = tipoEvento;
            this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getTitolo() {
            return titolo;
        }

        public void setTitolo(String titolo) {
            this.titolo = titolo;
        }

        public Date getDataEvento() {
            return dataEvento;
        }

        public void setDataEvento(Date dataEvento) {
            this.dataEvento = dataEvento;
        }

        public String getDescrizione() {
            return descrizione;
        }

        public void setDescrizione(String descrizione) {
            this.descrizione = descrizione;
        }

        public TipoEvento getTipoEvento() {
            return tipoEvento;
        }

        public void setTipoEvento(TipoEvento tipoEvento) {
            this.tipoEvento = tipoEvento;
        }

        public Integer getNumeroMassimoPartecipanti() {
            return numeroMassimoPartecipanti;
        }

        public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
            this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        }
        @Override
        public String toString() {
            return "Evento{" +
                    "id=" + id +
                    ", titolo='" + titolo + '\'' +
                    ", dataEvento=" + dataEvento +
                    ", descrizione='" + descrizione + '\'' +
                    ", tipoEvento=" + tipoEvento +
                    ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                    '}';
        }
    }
}

