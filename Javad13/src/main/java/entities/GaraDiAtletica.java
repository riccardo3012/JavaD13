package entities;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.Set;

public class GaraDiAtletica {

        @ManyToMany
        private Set<Persona> atleti;
        @OneToOne
        private Persona vincitore;


        public GaraDiAtletica(Set<Persona> atleti, Persona vincitore) {
                this.atleti = atleti;
                this.vincitore = vincitore;
        }

        public Set<Persona> getAtleti() {
                return atleti;
        }

        public void setAtleti(Set<Persona> atleti) {
                this.atleti = atleti;
        }

        public Persona getVincitore() {
                return vincitore;
        }

        public void setVincitore(Persona vincitore) {
                this.vincitore = vincitore;
        }
        @Override
        public String toString() {
                return "GaraDiAtletica{" +
                        "atleti=" + atleti +
                        ", vincitore=" + vincitore +
                        '}';
        }
}

