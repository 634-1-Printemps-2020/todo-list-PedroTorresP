package metier;

import domaine.*;

import static org.junit.jupiter.api.Assertions.*;

class GestionnaireTacheTest {

    @org.junit.jupiter.api.Test
    void addTache() {
        User test = new User("jean",null);
        Tache tacheTest1 = new Tache(test,null,null,null,null);
        Tache tacheTest2 = new Tache(test,null,null,null,null);
        GestionnaireTache gestionnaire =  new GestionnaireTache();
        gestionnaire.addTache(test,tacheTest1);

        assertTrue(gestionnaire.getTachesUser(test).contains(tacheTest2));



    }

}