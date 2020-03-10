package classesFilhas;

import classesMae.Automovel;

public class moto extends Automovel{
    private boolean capacete;

    public moto(){
        this.capacete = true;
    }

    public boolean GetCapacete(){
        return this.capacete;
    }

    public void SetCapacete(boolean capacete){
        this.capacete = capacete;
    }
}

