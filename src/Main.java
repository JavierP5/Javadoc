public class Main {
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

    private static void recorrerTablero(int[][] tablero) {
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(tablero[i][j]>0){
                    switch(tablero[i][j]){
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
}