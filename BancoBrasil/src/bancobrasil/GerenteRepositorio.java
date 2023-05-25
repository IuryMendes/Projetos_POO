
package bancobrasil;

import java.util.ArrayList;


public class GerenteRepositorio {
   public ArrayList<Gerente> gerente = new ArrayList<>();
    
    public ArrayList<Gerente> addGerente(){
        gerente.add(new Gerente("iury1", "12345", "iury", "Mendes","88998643933"));
        gerente.add(new Gerente("teste","teste","","",""));
        return gerente;
    }
}
