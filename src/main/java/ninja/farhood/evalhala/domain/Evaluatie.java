package ninja.farhood.evalhala.domain;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Evaluatie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String voornaam;

    private String achternaam;

    private String tewerkstellingskansen;

    private String bedrijvenlijst;

    private String algemenefeedback;

    @OneToMany
    @JoinColumn(name="evaluatie_id")
    private List<CursusEval> cursusEvals = new ArrayList<>();

    public Evaluatie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }


    public String getTewerkstellingskansen() {
        return tewerkstellingskansen;
    }

    public void setTewerkstellingskansen(String tewerkstellingskansen) {
        this.tewerkstellingskansen = tewerkstellingskansen;
    }

    public String getBedrijvenlijst() {
        return bedrijvenlijst;
    }

    public void setBedrijvenlijst(String bedrijvenlijst) {
        this.bedrijvenlijst = bedrijvenlijst;
    }

    public String getAlgemenefeedback() {
        return algemenefeedback;
    }

    public void setAlgemenefeedback(String algemenefeedback) {
        this.algemenefeedback = algemenefeedback;
    }

    public List<CursusEval> getCursusEvals() {
        return cursusEvals;
    }

    public void setCursusEvals(List<CursusEval> cursusEvals) {
        this.cursusEvals = cursusEvals;
    }
}
