public class Array1 {
    public static void main(String args[]){

        int x=10 , y=10;
            System.out.println("The Required Output is : ");
            int arr[][] =  new int[10][10];
            for(int i=0;i<10;i++){
              y=10;
              for(int j=0 ;j<10;j++){
                arr[i][j]= x * y ;
                System.out.print(arr[i][j] + " ");
                y++;
              }
             System.out.println();
             x++;
            }
        
    }
}
 

