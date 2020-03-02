package metier;
import domaine.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionnaireTache {
    private Map<User, List<Tache>> taches = new HashMap<>();

    public void addTache(User user, Tache tache){
        if(!taches.containsKey(user)){
            List<Tache> tachesUser = new ArrayList<>();
            taches.put(user, tachesUser);
        } else {taches.get(user).add(tache);}
    }

    public List<Tache> getTachesUser(User user){
        return taches.get(user);
    }

}
