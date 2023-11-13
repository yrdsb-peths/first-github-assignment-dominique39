public class Random{
    private int min;
    private int max;

    public Random(int min, int max){
        this.min = min;
        this.max = max;
    }

    public String toString(){
        return min+max;
    }
}