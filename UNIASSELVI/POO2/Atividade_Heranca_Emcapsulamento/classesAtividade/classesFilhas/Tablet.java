package classesFilhas;

import classesMae.Celular;;

public class Tablet extends Celular{
    private boolean displayAumentado;

    public Tablet(){
        this.displayAumentado = true;
    }

    public boolean GetdisplayAumentado(){
        return this.displayAumentado;
    }

    public void SetdisplayAumentado(boolean displayAumentado){
        this.displayAumentado = displayAumentado;
    }
}

