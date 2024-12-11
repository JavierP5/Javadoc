/**
 * Juego de Hundir la Flota
 * @version 1.0
 * @author Javier Portela García
 */
public class Main {

    /**
     * Función principal
     * @param args parametros del juego
     */
    public static void main(String[] args) {

        // definir
        int[][] tablero;

        // inicializar
        tablero = new int[][]{
                {4, 4, 4, 4, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 2},
                {0, 0, 0, 0, 2},
                {0, 1, 0, 0, 0}
        };

        recorrerTablero(tablero);

        System.out.println("...");

    }

    /**
     * Recorre el tablero de juego
     * @param tablero array de dos dimensiones, el tablero con los barcos
     */
    private static void recorrerTablero(int[][] tablero) {
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(esNave(tablero[i][j])){
                    switch(tablero[i][j]) {
                        case 1:
                            System.out.println("Submarino " + i +":" + j);
                            break;
                        case 2:
                            System.out.println("Acorazado " + i + ":" + j);
                            break;
                        case 4:
                            System.out.println("Portaaviones " + i + ":" + j);
                            break;
                        default:
                            System.out.println("No se lo que es");
                            break;
                    }
                }
            }
        }
    }

    /**
     * Comprueba si el valor es una nave o no
     *
     * @param valor_coordenada valor de la coordenada a estudiar
     * @return true en caso de ser una nave
     */
    static boolean esNave(int valor_coordenada){
        return valor_coordenada>0;
    }

    /**
     * Muestra por pantalla el tipo de nave segun valor coordenada
     * también muestra la coordenada y la ordenada
     * @param valor_coordenada valor de la coordenada
     * @param x coordenada, eje horizontal
     * @param y ordenada, eje vertical
     */

    static void tipoDeNave(int valor_coordenada, int x, int y){
        switch (valor_coordenada) {
            case 1:
                System.out.println("Submarino " + x + ":" + y);
                break;
            case 2:
                System.out.println("Acorazado " + x + ":" + y);
                break;
            case 4:
                System.out.println("Portaaviones " + x + ":" + y);
                break;
            default:
                System.out.println("No se lo que es");
                break;
                        
        }
    }
}
