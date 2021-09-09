public class GenericValue implements HasValue {

    private int valueVariable;

    public GenericValue(int x){
        valueVariable = x;
    }

    public String toString(){
        return Integer.toString(valueVariable);
    }


    @Override
    public int value() {
        return valueVariable;
    }
}
