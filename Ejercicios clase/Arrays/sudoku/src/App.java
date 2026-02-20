public class App {
    public static void main(String[] args) throws Exception {
        
        int[][] sudoku = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
        if(esSudokuValido(sudoku))
            System.out.println("El sudoku es valido");
        else
            System.out.println("El sudoku no es valido");
    }

    public static boolean esSudokuValido(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            if (!esFilaValida(sudoku, i) ||
                    !esColumnaValida(sudoku, i) || !esSubmatrizValida(sudoku, i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean esFilaValida(int[][] sudoku, int fila) {
        boolean[] visto = new boolean[10];
        for (int j = 0; j < 9; j++) {
            int num = sudoku[fila][j];
            if (num < 1 || num > 9 || visto[num])
                return false;
            visto[num] = true;
        }
        return true;
    }

    private static boolean esColumnaValida(int[][] sudoku, int col) {
        boolean[] visto = new boolean[10];
        for (int i = 0; i < 9; i++) {
            int num = sudoku[i][col];
            if (num < 1 || num > 9 || visto[num])
                return false;
            visto[num] = true;
        }
        return true;
    }

    private static boolean esSubmatrizValida(int[][] sudoku, int bloque) {
        boolean[] visto = new boolean[10];

        int filaInicio = (bloque / 3)* 3;
        int colInicio = (bloque % 3) * 3;

        for (int i = filaInicio; i < filaInicio + 3; i++) {
            for (int j = colInicio; j < colInicio + 3; j++) {
                int num = sudoku[i][j];

                if (num < 1 || num > 9 || visto[num]) {
                    return false;
                }
                visto[num] = true;
            }
        }
        return true;
    }
}
