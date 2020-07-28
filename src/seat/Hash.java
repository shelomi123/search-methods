
package seat;


public class Hash {
    String []arr ;
    int size ;
    int items = 0;
    
    public static void main(String args[]){
        Hash Hfunc = new Hash();
        
        String [] elementsToAdd2 = {"100", "102", "309", "546", "345", "276", "107", "490", "200", "300",
					"400", "500", "600", "700", "800", "900", "10", "20", "30", "40",
                                        "50", "60", "70", "80", "90", "2", "5", "56", "76", "87"};
        
        
    }
    
    public void hashFunction1(String[]  stringsForArr, String[] arr){
        
        for(int i =0; i<stringsForArr.length; i++){
            arr[i] = stringsForArr[i];
            //String newElementVal = stringsForArray[n];
            //theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }   
    }
    public void hashFunction2(String[]  stringsForArr, String[] arr){
        for(int i =0; i<stringsForArr.length; i++){
            String newElVal = stringsForArr[i];
            int arIndex = Integer.parseInt(newElVal) % 29;
            System.out.println("Index = " +arIndex + "for value" + newElVal);
            while(arr[arIndex]!="-1"){
                
            }
        }
    }
    
}
