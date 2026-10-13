public class remove_duplicates {
    public static  void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5};
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean temp=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    temp=true;
                    break;
                }
            }
        
        if(!temp){
            System.out.println(" "+arr[i]);
        }
        }

    }
    
}
