package caracol;

import java.util.Scanner;

/**
 *
 * @author manuel
 */
public class Caracol {

    int direccion = 0; //0-Dcha, 1-Abajo, 2-Izqa, 3-Arriba 
    Integer[][] matriz;
    int numeroActual = 1;
    int posicionX = 0, posicionY = 0;

    public static void main(String[] args) {
        int numero = 9;
        Caracol mc = new Caracol();
        mc.matriz = new Integer[numero][numero];

        mc.rellena(numero, mc.direccion);
        numero--;

        while (numero > 0) {
            mc.rellena(numero, mc.direccion);
            mc.rellena(numero, mc.direccion);
            numero--;
        }

        System.out.println(mc.toString());
    }

    public void rellena(int num, int direccion) {
        if ((posicionX == 0) && (posicionY == 0)) {
            this.matriz[posicionX][posicionY] = numeroActual;
            this.numeroActual++;
            num--;
        }

        for (int i = 0; i < num; i++) {
            switch (direccion) {
                case 0:
                    posicionX++;
                    break;
                case 1:
                    posicionY++;
                    break;
                case 2:
                    posicionX--;
                    break;
                case 3:
                    posicionY--;
                    break;
            }
            this.matriz[posicionY][posicionX] = numeroActual;
            this.numeroActual++;
        }
        this.direccion = (this.direccion != 3) ? this.direccion + 1 : 0;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < matriz.length; i++) {
            res = res + "[";
            for (int j = 0; j < matriz.length; j++) {
                res = res + matriz[i][j] + ", ";
            }
            res = res.substring(0, res.length() - 2) + "] \n";
        }
        return res;
    }

}
