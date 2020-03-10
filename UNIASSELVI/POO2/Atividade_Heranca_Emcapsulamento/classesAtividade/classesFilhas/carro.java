package classesFilhas;

import classesMae.Automovel;

public class carro extends Automovel{
    private boolean airbag;

    public carro(){
        this.airbag = true;
    }

    public boolean GetAirbag(){
        return this.airbag;
    }

    public void SetAirbag(boolean airbag){
        this.airbag = airbag;
    }
}

