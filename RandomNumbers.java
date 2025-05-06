public class RandomNumbers {
    public static void main(String[] args) {
        
        //Escribe un programa que genere un array de 2 dimensiones de 100 filas y 10 columnas  con números aleatorios del 0 al 99, a través de un bucle anidado (Si no te suenan estos conceptos, ¡búscalos!)
        //Imprime el array en la terminal
        int[][] randomNumbers = new int[100][10];
        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 0; j < randomNumbers[i].length; j++) {
                randomNumbers[i][j] = randomNumber();
            }
        }
        print2DArray(randomNumbers);
    }

    /**
     * Function name: randomNumber
     * 
     * @return (int)
     * 
     * Inside the function:
     * 1. generate random numbers from 0 to 99
     */
    public static int randomNumber() {
        return (int) (Math.random() * 100);

    }
        /**
         * Function name: print2DArray
         *
         * @param integers (2D array int)
         *
         * Inside the function:
         * 1. nested loop that prints a 2D array using the randomNumber function
         */
        public static void print2DArray ( int[][] integers){
            for (int i = 0; i < integers.length; i++) {
                for (int j = 0; j < integers[i].length; j++) {
                    System.out.print(integers[i][j] + " ");
                }
                System.out.println();
            }

        }
    }