package treepackage;

public class Tree {
  public static void main (String args[]){
     
    Tree obj = new Tree();
    obj.Tree1();

  }

    public void Tree1(){
    int i,j;
     for(i=1;i<=5;i++){

        for(j=5;j>=i;j--){

            System.out.print("  ");
        }
         for(j=1;j<=i;j++){

            System.out.print("  * ");
        }
        System.out.println();

    }
    for(i=1;i<=5;i++){

        for(j=5;j>=i;j--){

            System.out.print("  ");
        }
         for(j=1;j<=i;j++){

            System.out.print("  * ");
        }
        System.out.println();
    }
    
   
} 
}
