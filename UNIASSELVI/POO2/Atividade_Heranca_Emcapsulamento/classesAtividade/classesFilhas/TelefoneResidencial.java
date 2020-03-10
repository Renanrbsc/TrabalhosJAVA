package classesFilhas;

import classesMae.Celular;

public class TelefoneResidencial extends Celular{
    private boolean teclasManuais;

    public TelefoneResidencial(){
        this.teclasManuais = true;
    }

    public boolean GetTeclasManuais(){
        return this.teclasManuais;
    }

    public void SetTeclasManuais(boolean teclasManuais){
        this.teclasManuais = teclasManuais;
    }
}

