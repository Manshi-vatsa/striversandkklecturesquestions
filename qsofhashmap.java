public class qsofhashmap {
    static class find_frequency{
        
        
        void find_frequency(int[] array){
         for (int i = 0; i < array.length; i++) {
            int num=array[i];
            int count=0;
           
            for (int j = 0; j < array.length; j++) {
                if(array[j]==num){
                    count++;
                }
            }
            if(count>array.length/3){
                  boolean isprinted=false;
                  for (int k = 0; k < i; k++) {
                    if(array[k]==num){
                        isprinted=true;
                        break;
                    }
                  }
                  if(!isprinted){
                    System.out.println(num);
                  }
            }
            
         }
        }

    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,1,2,3,3,3,3};
        find_frequency obj=new find_frequency();
        obj.find_frequency(array);
        
    }
}

