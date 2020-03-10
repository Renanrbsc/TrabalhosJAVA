package classesFilhas;

import classesMae.Imovel;

public class loja extends Imovel{
    private boolean centroDeVenda;

    public loja(){
        this.centroDeVenda = true;
    }

    public boolean GetCentroDeVenda(){
        return this.centroDeVenda;
    }

    public void SetCentroDeVenda(boolean centroDeVenda){
        this.centroDeVenda = centroDeVenda;
    }
}

