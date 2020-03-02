package domaine;

import java.util.Objects;

public class User {
    private String nom;
    private String email;

    public User(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nom, user.nom) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, email);
    }
}
