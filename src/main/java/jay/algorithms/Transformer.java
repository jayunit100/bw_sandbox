package jay.algorithms;

public interface Transformer{

    /**
     * Any transformer will convert a data file into a new data file.
     */
    public DataFile transform(DataFile df);
}
