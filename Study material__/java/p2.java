

class p2{
public static void main(String []args){

int s1,sum=0;
int n=args.length;
if(n<=5){
for(int i=0;i<n;i++){
  s1=Integer.parseInt(args[i]);
     sum=sum+s1;
}
System.out.println("Answer:"+sum);
}
else{
System.out.println("invalid");
}

}


}