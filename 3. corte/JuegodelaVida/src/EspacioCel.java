
import java.util.Random;

public class EspacioCel {

    Celula tablero[][] = new Celula[65][65];
    Random r = new Random();
    //Inicializamos el estado de todas las celulas del espacio celular a muertas

    public EspacioCel() {
        for (int i = 0; i < 65; i++) {
            for (int j = 0; j < 65; j++) {
                tablero[i][j] = new Celula(i, j, Estado.MUERTA);
            }
        }
    }
    //Metodo para llenar la matriz inicicialmente de forma aleatoria con celulas VIVAS o MUERTAS

    public void aleatorias() {
        int aux;
        for (int h = 0; h < tablero.length; h++) {
            for (int k = 0; k < tablero[h].length; k++) {
                aux = r.nextInt(2);
                if (aux == 1) {
                    tablero[h][k].setEstado(Estado.VIVA);
                } else {
                    tablero[h][k].setEstado(Estado.MUERTA);
                }
            }
        }
    }

    //Estudiamos las vecinas vivas que tienen cada una de ellas
    //pues esto es lo q marcara su evolucion
    public int contarVivas(int i, int j) {
        int vivas = 0;
        for (int fila = i - 1; fila <= i + 1; fila++) {
            for (int colum = j - 1; colum <= j + 1; colum++) {
                try {
                    if ((tablero[fila][colum].getEstado() == Estado.VIVA
                            || tablero[fila][colum].getEstado() == Estado.MORIBUNDA)
                            && (fila != i || colum != j))//excluir la posicion en la que estamos para el estudio
                    {
                        vivas++;
                    }
                } catch (IndexOutOfBoundsException e) {
                }	//bordes					
            }
        }
        return vivas;
    }

    /*Ya calculadas las vecinas vivas, vemos como evolucionan segun estas 
	 * asignando los nuevos estados MORIBUNDA o EMBRION */
    public void generacion() {
        int vivas;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                vivas = contarVivas(i, j);
                //nacimiento 
                if (vivas == 3 && tablero[i][j].getEstado() == Estado.MUERTA) {
                    tablero[i][j].setEstado(Estado.EMBRION);
                } //muerte por soledad(vivas<=1) y por superpoblacion (vivas=>4)
                else if ((vivas <= 1 || vivas >= 4) && tablero[i][j].getEstado() == Estado.VIVA) {
                    tablero[i][j].setEstado(Estado.MORIBUNDA);
                }
            }
        }
    }

    /*Calculo de la siguiente generacion, donde se cambiara el estado
	 a las celulas q vayan a morir y a las que vayan a nacer */
    public void generacionSig() {
        for (int h = 0; h < tablero.length; h++) {
            for (int k = 0; k < tablero[h].length; k++) {
                if (tablero[h][k].getEstado() == Estado.MORIBUNDA) {
                    tablero[h][k].setEstado(Estado.MUERTA);
                } else if (tablero[h][k].getEstado() == Estado.EMBRION) {
                    tablero[h][k].setEstado(Estado.VIVA);
                }
            }
        }
    }

    public Celula getCelula(int fila, int col) {
        return tablero[fila][col];
    }

    //Metodo para cambiar estado de VIVA->MUERTA y viceversa
    public void setVivaMuerta(int fila, int col) {
        if (tablero[fila][col].getEstado() == Estado.MUERTA || tablero[fila][col].getEstado() == Estado.MORIBUNDA) {
            tablero[fila][col].setEstado(Estado.VIVA);
        } else {
            tablero[fila][col].setEstado(Estado.MUERTA);
        }
    }

    //Metodo para cambiar el estado de todas las celulas a MUERTA
    public void limpiar() {
        for (int h = 0; h < tablero.length; h++) {
            for (int k = 0; k < tablero[h].length; k++) {
                tablero[h][k].setEstado(Estado.MUERTA);
            }
        }
    }

    //Patrones de comportamiento
    public void lineal() {

        for (int h = 0; h < tablero.length; h++) {
            for (int k = 0; k < tablero[h].length; k++) {

                if (k == tablero.length/2) {
                    tablero[h][k].setEstado(Estado.VIVA);
                } else {
                    tablero[h][k].setEstado(Estado.MUERTA);
                }
            }
        }

    }
}
