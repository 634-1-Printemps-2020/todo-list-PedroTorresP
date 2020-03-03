package metier;

import domaine.Tache;
import domaine.User;

import java.util.List;

public interface GestionnaireTacheInterface {
    public void addTache(User user, Tache tache);
    public void annulerTache(User user, Tache tache);
    public void mettreAJourTache(User user, Tache tache);
    public List<Tache> getTachesUser(User user);
}
