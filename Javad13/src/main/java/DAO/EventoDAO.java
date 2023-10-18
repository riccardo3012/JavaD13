package DAO;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import entities.Evento;

public class EventoDAO {
    private EntityManagerFactory entityManagerFactory;

    public EventoDAO(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public void save(Evento evento) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(evento);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Evento getById(UUID uuid) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Evento evento = entityManager.find(Evento.class, uuid);
        entityManager.close();
        return evento;
    }

    public void delete(Evento evento) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        evento = entityManager.merge(evento);
        entityManager.remove(evento);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void refresh(Evento evento) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        evento = entityManager.merge(evento);
        entityManager.refresh(evento);
        entityManager.close();
    }


}