public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[] {4,5,6,7,8};
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        for (int i=0; i<intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
    }
}
