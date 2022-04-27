public class Main {

    public static void main(String[] args) {

        String a = "anagram";

        char [] array = new char [a.length()];
        int [] values = new int [a.length()];

        // count the same chars from string

        System.out.println(
                "Char : " + 'a' + " appears : "
                + checkIfAppears('a', a) + " times"); // work well

    }

    public static char [] shortArray(String a){
        char [] array = new char[a.length()];

        char [] str = a.toCharArray();

        int counter = 0;

        for(int i = 0; i < a.length(); i++){

        }

        return array;
    }

    public static char [] deleteZeros(char [] array){

        char [] newArray = new char[array.length];

        for(int i = 0; i < array.length; i++){
            if()
        }

        return newArray;
    }

    public static int checkIfAppears(char ch, String a){

        int counter = 0;

        int [] array = new int[a.length()];    //work well

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == ch){
                counter++;
                array[counter - 1] = 1;
            }
        }

        System.out.println("Counter = " + counter);
        System.out.println("check if appears array : ");

        printArray(array);

        return counter;
    }

    public static void printArray(int [] array){    //work well
        for(int i = 0; i < array.length; i++){
            System.out.println("Array element : " + i + " value : " + array[i]);
        }
    }

    public static void printArray(char [] array){    //work well
        for(int i = 0; i < array.length; i++){
            System.out.println("Array element : " + i + " value : " + array[i]);
        }
    }
}
