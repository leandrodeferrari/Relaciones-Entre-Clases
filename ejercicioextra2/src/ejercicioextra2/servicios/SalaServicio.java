package ejercicioextra2.servicios;

import ejercicioextra2.entidades.*;
import java.util.*;

public class SalaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Espectador> listaEspectadores;

    public Sala crearSalaSinEspectadores() {

        listaEspectadores = new ArrayList();
        String[][] matrizSala = new String[8][6];
        int numeroAsiento = 1;
        char letraAsiento = 70;

        for (int i = matrizSala.length - 1; i >= 0; i--) {

            for (int j = matrizSala[i].length - 1; j >= 0; j--) {

                if (j != matrizSala[i].length - 1) {

                    matrizSala[i][j] = numeroAsiento + " " + letraAsiento + " " + "O" + "|";

                } else {

                    matrizSala[i][j] = numeroAsiento + " " + letraAsiento + " " + "O";

                }

                letraAsiento--;

            }

            numeroAsiento++;
            letraAsiento = 70;

        }

        for (int i = 0; i < matrizSala.length; i++) {

            for (int j = 0; j < matrizSala[i].length; j++) {

                System.out.print((matrizSala[i][j]));

            }
            System.out.println("");
        }

        Sala sala = new Sala(matrizSala, listaEspectadores);

        return sala;

    }

    public Sala ingresarEspectadoresEnSala(Pelicula pelicula, double precioEntrada, Sala sala) {

        EspectadorServicio servicioEspectador = new EspectadorServicio();
        listaEspectadores = new ArrayList();
        int cantidadEspectadores;

        System.out.println("Ingrese la cantidad de espectadores que quiere ingresar en la sala");
        cantidadEspectadores = leer.nextInt();

        for (int i = 0; i < cantidadEspectadores; i++) {

            Espectador espectadorUsuario = servicioEspectador.crearEspectador();

            listaEspectadores.add(espectadorUsuario);

        }

        String[][] nuevaSala = sala.getSala();

        for (int i = 0; i < listaEspectadores.size(); i++) {

            int numeroAlAzarParaFilas = (int) (Math.random() * 8);
            int numeroAlAzarParaColumnas = (int) (Math.random() * 6);

            String contenidoAsiento = sala.getSala(numeroAlAzarParaFilas, numeroAlAzarParaColumnas);

            if (hayEspacioEnLaSala(sala)) {

                if (TieneEdadParaVerPelicula(listaEspectadores.get(i), pelicula)) {

                    if (tieneDineroSuficienteParaEntrada(precioEntrada, listaEspectadores.get(i).getDineroDisponible())) {

                        if (estaLibreElAsiento(contenidoAsiento)) {

                            if ((numeroAlAzarParaColumnas + 1) == nuevaSala[numeroAlAzarParaFilas].length) {

                                nuevaSala[numeroAlAzarParaFilas][numeroAlAzarParaColumnas] = contenidoAsiento.substring(0, 4) + "X";

                            } else {

                                nuevaSala[numeroAlAzarParaFilas][numeroAlAzarParaColumnas] = contenidoAsiento.substring(0, 4) + "X|";

                            }

                        } else {

                            nuevaSala[numeroAlAzarParaFilas][numeroAlAzarParaColumnas] = contenidoAsiento;
                            System.out.println("Lo siento, " + listaEspectadores.get(i).getNombre() + ", está ocupado el asiento");

                        }

                    } else {

                        System.out.println("Lo siento, " + listaEspectadores.get(i).getNombre() + ", no tiene dinero suficiente para pagar entrada");

                    }

                } else {

                    System.out.println("Lo siento, " + listaEspectadores.get(i).getNombre() + ", no tiene edad suficiente para ver esta película");

                }

            } else {

                System.out.println("Lo siento, " + listaEspectadores.get(i).getNombre() + ", ya no quedan asientos disponibles");

            }

        }

        sala.setSala(nuevaSala);

        for (int i = 0; i < nuevaSala.length; i++) {

            for (int j = 0; j < nuevaSala[i].length; j++) {

                System.out.print((nuevaSala[i][j]));

            }
            System.out.println("");
        }

        sala.setSala(nuevaSala);

        return sala;

    }

    public boolean estaLibreElAsiento(String datosAsiento) {

        return (datosAsiento.substring(4, 5).equals("O"));

    }

    public boolean hayEspacioEnLaSala(Sala sala) {

        return sala.getAsientosDesocupados() >= 0;

    }

    public boolean TieneEdadParaVerPelicula(Espectador espectador, Pelicula pelicula) {

        return espectador.getEdad() >= pelicula.getEdadMinima();

    }

    public boolean tieneDineroSuficienteParaEntrada(double precioEntrada, double dineroEspectador) {

        return dineroEspectador >= precioEntrada;

    }

}
