/**
 * Created by adn on 31/01/17.
 */
public class Guagua extends VEhiculo {

    private int numplazas;
    private String Servicio;

    public void setNumplazas(int numplazas){

        this.numplazas = numplazas;
    }

    public void setTipoServicio(String tipo){
        this.Servicio = tipo;
    }

    public int getNumplazas (){
        return this.numplazas;
    }

    public String getTipoServicio(){
        return this.Servicio;
    }

    @Override
    public int ITV() {
        return 2;
    }
}
