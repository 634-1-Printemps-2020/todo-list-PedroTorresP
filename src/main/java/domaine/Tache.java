package domaine;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Objects;

public class Tache {
    private User user;
    private String description;
    private LocalDate date;
    private Statut statut;
    private Resolution resolution;

    public Tache(User user, String description, LocalDate date) {
        this.user = user;
        this.description = description;
        this.date = date;
        this.statut = Statut.OPEN;
        this.resolution = null;
    }

    public User getUser() {
        return user;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public Statut getStatut() {
        return statut;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tache tache = (Tache) o;
        return Objects.equals(user, tache.user) &&
                Objects.equals(description, tache.description) &&
                Objects.equals(date, tache.date) &&
                Objects.equals(statut, tache.statut) &&
                Objects.equals(resolution, tache.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, description, date, statut, resolution);
    }
}
