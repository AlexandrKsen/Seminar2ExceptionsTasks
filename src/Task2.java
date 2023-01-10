public class Task2 {
    public static void main(String[] args) {

        int[] intArray = {3, 5, 10, 15, 20, 23, 30, 50};

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound " + e);
        } catch (NullPointerException e) {
            System.out.println("Nulls are not alowed" + e);
        }

    }
}
