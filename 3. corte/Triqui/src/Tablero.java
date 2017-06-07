/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manuel Pinilla casas ID: 537249
 *
 */
public class Tablero {

    char[][] M = new char[3][3];

    public Tablero() {

        limpiarTablero();
    }

    int calcularTriqui() {
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (M[i][0] != 'a' && M[i][0] == M[i][1] && M[i][1] == M[i][2]) {
                    return 1;
                } else {
                    if (M[0][j] != 'a' && M[0][j] == M[1][j] && M[0][j] == M[2][j]) {
                        return 1;
                    } else {
                        if (M[0][0] != 'a' && M[0][0] == M[1][1] && M[0][0] == M[2][2]) {
                            return 1;
                        } else {
                            if (M[1][1] != 'a' && M[2][0] == M[1][1] && M[2][0] == M[0][2]) {
                                return 1;
                            }

                        }
                    }
                }
            }
        }
        return 0;
    }
    void limpiarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                M[i][j] = 'a';
            }
        }
    }
}