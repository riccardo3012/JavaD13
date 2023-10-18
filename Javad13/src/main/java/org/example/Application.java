package org.example;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import DAO.EventoDAO;
import DAO.LocationDAO;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import dao.PartecipazioneDAO;
import DAO.PersonaDAO;
import entities.Evento;
import entities.Location;
import entities.Partecipazione;
import entities.Persona;
import entities.Gender;
import entities.Stato;
import entities.TipoEvento;

public class Application {

    private static Logger logger = (Logger) LoggerFactory.getLogger(Application.class);
    private static EntityManagerFactory emf = util.Util.getEntityManagerFactory();

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

        EventoDAO ed = new EventoDAO((EntityManagerFactory) em);
        PersonaDAO pd = new PersonaDAO((EntityManagerFactory) em);
        LocationDAO ld = new LocationDAO(em);
        PartecipazioneDAO partecipazioneD = new PartecipazioneDAO(em);

        Persona p1 = new Persona("Mario", "Rossi", "mariorossi@example.com", LocalDate.now().minusYears(18),
                Gender.MASCHIO);
        pd.save(p1);

        Location l1 = new Location("Teatro", "Torino");
        ld.save(l1);

        Evento e1 = new Evento(LocalDate.now(), "Fico!", TipoEvento.PRIVATO, 1000, l1);
        ed.save(e1);


        Partecipazione partecipazione1 = new Partecipazione(p1, e1, Stato.CONFERMATA);
        Set<Partecipazione> listaPersoneE1 = new HashSet<Partecipazione>();
        listaPersoneE1.add(partecipazione1);

        ed.save(e1);



    }

}