public class Main {
    public static void main(String[] args) {
        Integer[] elements = {2, 3 , 4};
        int index = search(elements, 3, 4);
        System.out.println("The location is " + index);
        GenericValue number = greaterThan(new GenericValue(4), new GenericValue(3));
        System.out.println("The greater number is " + number);

    }

    public static <T> int search(T[] array, int size, T value){
        for(int i = 0; i < size; i++){
            if (array[i].equals(value))
                return i;
        }
        return -1;
    }

    public static <T extends HasValue> T greaterThan(T a, T b){
        if(a.value() > b.value())
            return a;
        else
            return b;
    }
}
