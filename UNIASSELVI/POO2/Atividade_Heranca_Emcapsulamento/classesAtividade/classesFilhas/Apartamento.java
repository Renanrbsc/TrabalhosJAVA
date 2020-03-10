package classesFilhas;

import classesMae.Imovel;

public class Apartamento extends Imovel{
    private boolean parteDeUmPredio;

    public Apartamento(){
        this.parteDeUmPredio = true;
    }

    public boolean GetParteDeUmPredio(){
        return this.parteDeUmPredio;
    }

    public void SetParteDeUmPredio(boolean parteDeUmPredio){
        this.parteDeUmPredio = parteDeUmPredio;
    }
}

