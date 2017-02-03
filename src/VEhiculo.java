import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Created by adn on 31/01/17.
 */
public abstract class VEhiculo {
    private String matricula;
    private String marca;
    private String DNI;
    private LocalDate fecha;
    private int Chasis,potencia;
    private LocalDate fechaitv;

    public void setMatricula(String Matricula){
        this.matricula = Matricula;
    }

    public void setChasis (int chasis){
        this.Chasis = chasis;
    }

    public void setMarca (String marca){
        this.marca = marca;
    }
    public void setPotencia (int potencia){
        this.potencia = potencia;
    }

    public void setDNI (String dni){
        this.DNI = dni;
    }



    public String getMatricula(){
        return this.matricula;
    }

    public int getChasis (){
        return this.Chasis ;
    }

    public String getMarca (){
        return this.marca;
    }
    public int getPotencia (){
        return this.potencia;
    }

    public String getDNI (){
        return this.DNI;
    }



    public void setFecha(LocalDate fecha) {this.fecha = fecha;
    }

    public int itvfecha(LocalDate vf) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate hoy = LocalDate.now();

        Period periodo = Period.between(vf, hoy);
        return periodo.getYears();
    }
    public LocalDate getFecha (){
        return this.fecha;
    }

    public void Elsaludo(){
        System.out.println("Bienvenido a la ITV la pardilla");
    }

   public abstract int ITV();


}
