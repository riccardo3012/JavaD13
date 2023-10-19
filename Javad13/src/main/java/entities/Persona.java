package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name ="persone")
public class Persona {
@Id
@GeneratedValue
    private long id;
    private String name;
    private String cognome;
    private char gender;
    private LocalDate dataNascita;
    private String email;

    @OneToMany(mappedBy = "persona")
    private List <Partecipazione> listaPartecipanti;
    public Persona(){}

    public Persona(long id, String name, String cognome, char gender, LocalDate dataNascita, String email, List<Partecipazione> listaPartecipanti) {
        this.id = id;
        this.name = name;
        this.cognome = cognome;
        this.gender = gender;
        this.dataNascita = dataNascita;
        this.email = email;
        this.listaPartecipanti = listaPartecipanti;
    }

    public Persona(String name, String surname, String mail, LocalDate localDate, Gender gender) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Partecipazione> getListaPartecipanti() {
        return listaPartecipanti;
    }

    public void setListaPartecipanti(List<Partecipazione> listaPartecipanti) {
        this.listaPartecipanti = listaPartecipanti;
    }
    @Override
    public String toString(){
        return "entities.Persona {" +
              "id =" +id+
                ", nome='" + name + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email ='" + email + '\'' +
                ", dataNascita =" + dataNascita +
                ", sesso =" + gender +
                ", listaPartecipanti=" + listaPartecipanti+
                '}';
    }
}
