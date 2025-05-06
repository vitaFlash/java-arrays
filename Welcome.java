public class Welcome {
    public static void main(String[] args) {

        //Crea un array que contenga 5 nombres de coders y con un bucle 'for-each' imprime: ¡Hola <name>, bienvenida a Java!
       String[]coders = {"Rocío", "María", "Ana", "Lucía", "Sara"};
        for (String coder : coders) {
            System.out.println("¡Hola " + coder + ", bienvenida a Java!");
        }

        //Escribe un bucle 'for' que imprima solo los siguientes números: 10 - 30 - 50 - 70 - 90 del array numbers, sin modificarlo ni creando uno nuevo
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 20 == 10) {
                System.out.println(numbers[i]);
            }
        }


        //Crea un array que contenga algunos números y usa un bucle 'for-each' e imprime cada número duplicado
        int[] numbers2 = {1, 2, 3, 4, 5};
        for (int number : numbers2) {
            System.out.println(number * 2);
        }


        //Crea un array de tipo char que contenga las vocales en minúsculas y usa un bucle 'for-each' e imprime cada vocal en mayúsculas
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            System.out.println(Character.toUpperCase(vowel));
        }

    }
}