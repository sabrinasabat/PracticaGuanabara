public class CounterTest {
    public int countSheeps(Boolean[] arrayOfSheeps) {

        int sheeps = 0;

        for (int c=0; c<arrayOfSheeps.length; c++){
            if (arrayOfSheeps.equals("true")){
                sheeps = sheeps+1;
            }
        }
        return (sheeps);
    }
}
