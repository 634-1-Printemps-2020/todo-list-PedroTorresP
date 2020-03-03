import domaine.*;
import metier.GestionnaireTache;
import org.junit.Assert;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class GestionnaireTacheTest {

    @org.junit.jupiter.api.Test
    void addTache() {
        User test = new User("jean",null);
        Tache tacheTest1 = new Tache(test,null, LocalDate.now());
        Tache tacheTest2 = new Tache(test,null, LocalDate.now());
        GestionnaireTache gestionnaire =  new GestionnaireTache();
        gestionnaire.addTache(test,tacheTest1);
        gestionnaire.addTache(test,tacheTest2);

        Assert.assertTrue(gestionnaire.getTachesUser(test).contains(tacheTest2));



    }

}