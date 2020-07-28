
package seat;


public class lb {
    private int currentSize, maxSize;
    private String[] key;
    private String[] val;
    
    public lb(int capacity){
        currentSize=0;
        maxSize= capacity;
        key= new String[maxSize];
        val= new String[maxSize];
    }
    public void makeEmpty(){
        currentSize=0;
        key= new String[maxSize];
        val= new String[maxSize];
    }
    
    public int getSize(){
        return currentSize; 
    }
    public boolean isEmpty(){
        return currentSize==0;
    }
    public boolean isFull(){
        return currentSize==maxSize;
    }
    
}
