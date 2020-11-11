package space.harbour.java.hw2;

public class EstimateSize {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before GC:");
        long total = Runtime.getRuntime().totalMemory();
        long free = Runtime.getRuntime().freeMemory();
        long occupiedBeforeGc = total - free;
        System.out.println("Total Memory: " + total);
        System.out.println("Free Memory: " + free);
        System.out.println("Occupied Memory: " + occupiedBeforeGc);
        System.out.println();

        System.gc();
        Thread.sleep(10);


        System.out.println("After GC:");
        total = Runtime.getRuntime().totalMemory();
        free = Runtime.getRuntime().freeMemory();
        long occupiedAfterGc = total - free;
        System.out.println("Total Memory: " + total);
        System.out.println("Free Memory: " + free);
        System.out.println("Occupied Memory: " + occupiedAfterGc);
        System.out.println();

        int n = 10_000_000;
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
        
            myArray[i] = i;
        }

        System.out.println("After int array allocation: ");
        total = Runtime.getRuntime().totalMemory();
        free = Runtime.getRuntime().freeMemory();
        long sizeArray = total - free - occupiedAfterGc;
        System.out.println("Total Memory: " + total);
        System.out.println("Free Memory: " + free);
        System.out.println("Occupied Memory: " + sizeArray);
        System.out.println("Size of int: " + sizeArray / Float.valueOf(n));
        System.out.println();


    }

}
