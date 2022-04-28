public class Main {

    public static void main(String[] args) {

        String a = "anagram";
        String b = "margana";

        if(a.length() != b.length()){
            System.out.println("This 2 strings is not anagrams");
        }

//        System.out.println("Array1shorted : ");
//        printArray(shortArray(a));
//
//
//        System.out.println("Array2shorted : ");
//        printArray(shortArray(b));

        char [] shortedArray1 = shortArray(a);
        int [] shortedArrayValue1 = new int[shortedArray1.length];

        char [] shortedArray2 = shortArray(b);
        int [] shortedArrayValue2 = new int[shortedArray2.length];

        for(int i = 0; i < shortedArray1.length; i++){
            shortedArrayValue1[i] = checkIfAppears(shortedArray1[i],a);   //work well
        }

        for(int i = 0; i < shortedArray2.length; i++){
            shortedArrayValue2[i] = checkIfAppears(shortedArray2[i],a);   //work well
        }

        boolean flag = true;

        for(int i = 0; i < shortedArray1.length; i++){
            int index = 0;
            for(int j = 0; j < shortedArray1.length; j++){
                if(shortedArray1[i] == shortedArray2[j]){
                    index = j;
                }
                if(shortedArrayValue1[i] != shortedArray2[index]){
                    //System.out.println("Works well");
                }
                else{
                    System.out.println("No i nie działa");
                    flag = false;
                }
            }
        }
        if(flag == true){
            System.out.println("Everything worked well 2 strings are anagrams!!!!" +
                    "\nAlmost Done");
        }

        System.out.println("Shorted Array 1");
        printArray(shortedArray1);


        System.out.println("Shorted Array 2");
        printArray(shortedArray2);


        System.out.println("Shorted Array Value 1");
        printArray(shortedArrayValue1);

        System.out.println("Shorted Array Value 2");
        printArray(shortedArrayValue2);
    }

    public static char [] shortArray(String a){

        char [] array = new char[a.length()];              //work well
        char [] str = a.toCharArray();

        for(int i = 0; i < a.length(); i++){
            boolean isInArray = false;
            for(int j = 0; j < a.length(); j++){    //sprawdza czy jest już taka litera w arrayu
                if(str[i] == array[j]){
                    isInArray = true;
                }
            }

            int index = 0;

            if(isInArray == false){
                for(int k = 0; k < a.length(); k++){
                    if(array[k] == 0){
                        index = k;
                        array[index] = str[i];
                        break;
                    }
                }
            }
        }

        int licznik = 0;

        for(int h = 0; h < array.length; h++){
            if(array[h] == 0) {
                licznik = h;
            }
        }

        char [] newArray = new char[licznik - 1];

        for(int g = 0; g < newArray.length; g++){
            newArray[g] = array[g];
        }

//        printArray(newArray);

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

//        System.out.println("Counter = " + counter);
//        System.out.println("check if appears array : ");

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
