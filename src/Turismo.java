/**
 * Created by adn on 31/01/17.
 */
public class Turismo extends VEhiculo {

    private int numpuertas,numplazas;
    private boolean remolcable;

    public void setNumpuertas (int Numpuertas){
        this.numpuertas = Numpuertas;
    }
    public  void setRemolque (boolean remolque){
        this.remolcable = remolque;
    }
    public void setNumplazas(int numplazas){
        this.numplazas = numplazas;
    }

    public int getNumpuertas (){
        return this.numpuertas;
    }
    public boolean getRemolque (){
        return this.remolcable;
    }
    public int getNumplazas(){

        return this.numplazas;
    }


    @Override
    public int ITV() {
        return 5;
    }
}
