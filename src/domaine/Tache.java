package domaine;

import java.util.Calendar;
import java.util.Objects;

public class Tache {
    private User user;
    private String description;
    private Calendar date;
    private Statut statut;
    private Resolution resolution;

    public Tache(User user, String description, Calendar date, Statut statut, Resolution resolution) {
        this.user = user;
        this.description = description;
        this.date = date;
        this.statut = statut;
        this.resolution = resolution;
    }

    public User getUser() {
        return user;
    }

    public String getDescription() {
        return description;
    }

    public Calendar getDate() {
        return date;
    }

    public Statut getStatut() {
        return statut;
    }

    public Resolution getResolution() {
        return resolution;
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
