import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by adn on 31/01/17.
 */
public class Main {

    public static void main (String[]args){
        Turismo turism = new Turismo();
        Motos moto = new Motos();
        Guagua bus = new Guagua();

        Scanner sc = new Scanner(System.in);
        String Matricula,marca,dni,fecha;
        int chasis, potencia,opt;
        int an = 0;
        LocalDate act = LocalDate.now();
        boolean remolque;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("¿Qué vehiculo está usando?\n" +
                "1- Turismo \n" +
                "2-  Guagua \n" +
                "3- Motocicleta \n");
        opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Cuantas puertas tiene su coche?");
                int Numpuertas = sc.nextInt();
                turism.setNumpuertas(Numpuertas);
                int remolcable;
                System.out.println("Es su coche remolcable? 1- Si/2- No ");
                remolcable = sc.nextInt();
                if(remolcable == 1){
                    remolque = true;
                }else {remolque = false;}
                turism.setRemolque(remolque);
                System.out.println("Introduzca el número de plazas :");
                int numplazas = sc.nextInt();
                turism.setNumplazas(numplazas);
                System.out.println("Introduzca su matricula");
                Matricula = sc.next();
                turism.setMatricula(Matricula);
                System.out.println("Introduzca su número de chasis (1-2009): ");
                chasis = sc.nextInt();
                turism.setChasis(chasis);
                System.out.println("Introduzca la marca de su coche");
                marca = sc.next();
                turism.setMarca(marca);
                System.out.println("Introduzca la potencia en CV de su coche: ");
                potencia = sc.nextInt();
                turism.setPotencia(potencia);
                System.out.println("Introduzca su DNI");
                dni = sc.next();
                turism.setDNI(dni);
                System.out.println("Introduzca el año de compra de su vehiculo: ");
                turism.setFecha(LocalDate.parse(sc.next(), formato));
                an = turism.itvfecha(turism.getFecha());


                System.out.println("Num de plazas: "+turism.getNumplazas());
                System.out.println("Num de puertas: "+turism.getNumpuertas());
                System.out.println("Remolcable? :"+turism.getRemolque());
                System.out.println("DNI : "+turism.getDNI());
                System.out.println("Matricula : "+turism.getMatricula());
                System.out.println("Marca : "+turism.getMarca());
                if ( an >=  turism.ITV()){
                    System.out.println("Debe hacer la revisión de la ITV");
                }else{System.out.println("Aun no debe revisar su ITV");}
                System.out.println("Nº Chasis: "+turism.getChasis());


                break;

            case 2:

                System.out.println("Introduzca el número de plazas :");
                numplazas = sc.nextInt();
                bus.setNumplazas(numplazas);
                System.out.println("Introduzca el tipo de servicio de la guagua");
                String tipo = sc.next();
                bus.setTipoServicio(tipo);
                System.out.println("Introduzca su matricula");
                Matricula = sc.next();
                bus.setMatricula(Matricula);
                System.out.println("Introduzca su número de chasis (1-2009): ");
                chasis = sc.nextInt();
                bus.setChasis(chasis);
                System.out.println("Introduzca la marca de su coche");
                marca = sc.next();
                bus.setMarca(marca);
                System.out.println("Introduzca la potencia en CV de su coche: ");
                potencia = sc.nextInt();
                bus.setPotencia(potencia);
                System.out.println("Introduzca su DNI");
                dni = sc.next();
                bus.setDNI(dni);
                System.out.println("Introduzca el año de compra de su vehiculo: ");
                bus.setFecha(LocalDate.parse(sc.next(), formato));
                an = bus.itvfecha(bus.getFecha());


                System.out.println(bus.getNumplazas());
                System.out.println(bus.getTipoServicio());
                System.out.println(bus.getDNI());
                System.out.println(bus.getPotencia());
                System.out.println(bus.getMatricula());
                System.out.println(bus.getMarca());
                if ( an >= bus.ITV()){
                    System.out.println("Debe hacer la revisión de la ITV");
                }else{System.out.println("Aun no debe revisar su ITV");}
                System.out.println(bus.getChasis());
                System.out.println(bus.getFecha());
                break;

            case 3:


                System.out.println("Introduzca su matricula");
                Matricula = sc.next();
                moto.setMatricula(Matricula);
                System.out.println("Introduzca su número de chasis (1-2009): ");
                chasis = sc.nextInt();
                moto.setChasis(chasis);
                System.out.println("Introduzca la marca de su coche");
                marca = sc.next();
                moto.setMarca(marca);
                System.out.println("Introduzca la potencia en CV de su coche: ");
                potencia = sc.nextInt();
                moto.setPotencia(potencia);
                System.out.println("Introduzca su DNI");
                dni = sc.next();
                moto.setDNI(dni);
                System.out.println("Introduzca el año de compra de su vehiculo: ");
                moto.setFecha(LocalDate.parse(sc.next(), formato));
                an = moto.itvfecha(moto.getFecha());

                System.out.println(moto.getDNI());
                System.out.println(moto.getPotencia());
                System.out.println(moto.getMatricula());
                System.out.println(moto.getMarca());
                if ( an >= moto.ITV()){
                    System.out.println("Debe hacer la revisión de la ITV");
                }else{System.out.println("Aun no debe revisar su ITV");}

                System.out.println(moto.getChasis());
                System.out.println(moto.getFecha());

                break;


        }
    }
}
