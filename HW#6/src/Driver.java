import java.util.Random;


public class Driver implements DriverInterface {

    @Override
    public Integer[] createArray(ArrayType arrayType, int arraySize) {
        Integer[] array = new Integer[arraySize];
        Random random = new Random();
        
        switch (arrayType) {
        case Equal:
            for (int i = 0; i < array.length; i++) {
            array[i] = new Integer(5);
            }
            break;
        case Increasing:
            for (int i = 0; i < array.length; i++) {
            array[i] = new Integer(i);
            }
            break;
        case Random:
            for(int i = 0; i < array.length; i++) {
            array[i] = new Integer(random.nextInt());
            }
            break;
        case Decreasing: 
            for(int i = 0; i < array.length; i++) {
            array[i] = new Integer(array.length-(i+1));
            }
            break;
        case IncreasingAndRandom:
            for (int i = 0; i < array.length; i++) {
                int inc = (int) (array.length / 1.11);
                
                if (i < inc ) {    
                    array[i] = new Integer(i);
                }else {
                    array[i] = new Integer(random.nextInt());
                }
            }
            break;
        }
        return array;
        }
        

    
    @Override
    public TestTimes[] runSorts(ArrayType arrayType, int arraySize, int numberOfTimes) {
        
        TestTimes [] ts = new TestTimes[5];
        

        MergeSort<Integer> ms = new MergeSort<Integer>();
        
        QuickSort<Integer> qs1 = new QuickSort<Integer>();
        qs1.setPivotType(QuickSort.PivotType.FirstElement);
        
        QuickSort<Integer> qs2 = new QuickSort<Integer>();
        qs2.setPivotType(QuickSort.PivotType.RandomElement);
        
        QuickSort<Integer> qs3 = new QuickSort<Integer>();
        qs3.setPivotType(QuickSort.PivotType.MidOfFirstMidLastElement);
        
        HeapSort<Integer> hs  = new HeapSort<Integer>();
        
        ts[0] = ms;
        ts[1] = qs1;
        ts[2] = qs2;
        ts[3] = qs3;
        ts[4] = hs;
        
        
            for(int i = 0; i < numberOfTimes; i++) {
                
            Integer[] array = createArray(arrayType, arraySize);
            ms.sort(array);
            
            array = createArray(arrayType, arraySize);
            qs1.sort(array);
            
            array = createArray(arrayType, arraySize);
            qs2.sort(array);
            
            array = createArray(arrayType, arraySize);
            qs3.sort(array);
            
            array = createArray(arrayType, arraySize);
            hs.sort(array);
            
            
            }
            String[] s = { "MergeSort", "QuickSort.FirstElement",
                    "QuickSort.RandomElement",
                    "QuickSort MidOfFirstMidLastElement", "HeapSort" };

            for (int i = 0; i < 5; i++) {
                ts[i].setMemoryUnits(TestTimesInterface.MemoryUnits.KiloBytes);
            }

            for (int i = 0; i < 5; i++) {
                ts[i].setTimeUnits(TestTimesInterface.TimeUnits.MicroSeconds);
            }
            System.out.println("KilloBytes\n");
            for (int i = 0; i < 5; i++) {
                System.out.println(s[i] + "\n");
                ts[i].getMemoryUsages(); 
                                        
                
                System.out.println("\nAverage: \n" + ts[i].getAverageMemoryUsage());
                System.out.println();
            }

            System.out.println();
            System.out.println("TestTimes: \n");

            for (int i = 0; i < 5; i++) {
                System.out.println(s[i] + "\n");
                ts[i].getTestTimes(); 
                
                System.out.println("\nAverage: \n" + ts[i].getAverageTestTime());
                System.out.println();
            }
            
            return ts;
        }


    
    public static void main(String[] args) {
    
        Driver driver = new Driver();
            
            
            driver.runSorts(ArrayType.Equal, 1000, 10);
            driver.runSorts(ArrayType.Random, 1000, 10);
            driver.runSorts(ArrayType.Increasing, 1000, 10);
            driver.runSorts(ArrayType.Decreasing, 1000, 10);
            driver.runSorts(ArrayType.IncreasingAndRandom, 1000, 10);
    
    
        }
    
    

    }