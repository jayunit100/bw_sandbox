package jay.algorithms;

/**
 * An object representation of a data file.
 */
public class DataFile {

    String contents=null;
    
    public DataFile(String initial){
        this.contents=initial;
    }
    
    public String getContents(){
        return contents;
    }

    public void setContents(String contents){
        this.contents=contents;
    }

    public String toString(){
        return contents;
    }
}
