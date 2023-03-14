package Chapter9_ObjectsAndClasses.exercises;

public class Exercises96_Stopwatch {
    public static void main(String[] args) {
        Stopwatch stopWatch = new StopWatch();
        int[] randomArray = getArray();
        stopWatch.start();

        selectionSort(randomArray);

        stopWatch.stop();

        System.out.println("The execution time of sorting 100,00 " +
                "numbers using selection sort: " + stopWatch.getElapsedTime() + milliseconds);
    }

    public static int[] getArray() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }
    public class StopWatch {
        private long startTime;
        private long endTime;

        StopWatch() {
            startTime = System.currentTimeMillis();
        }

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public void stop() {
            endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return getEndTime() - getStartTime();
        }

        public long getStartTime() {
            return startTime;
        }

        public long getEndTime() {
            return endTime;
        }
    }
}
