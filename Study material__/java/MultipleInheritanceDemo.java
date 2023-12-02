class Student
{
int rollNumber;
void getNumber(int n)
{
rollNumber=n;
}
void putNumber()
{
System.out.println("RollNo:" +rollNumber);
}
}

class Test extends Student{
float IAT1, IAT2;

void getMarks (float m1, float m2){
IAT1=m1;
IAT2=m2;
}
void putMarks()
{
System.out.println("Marks Obtained Are: ");
System.out.println("IAT1:" +IAT1);
System.out.println("IAT2:" +IAT2);
}
}

interface Sports {
    float sportswt = 6.0F;

    void putWt();
}

class Result extends Test implements Sports {
    float total;

    public void putWt() {
        System.out.println("Sports weight is:" + sportswt);
    }

    void display() {
        total = IAT1 + IAT2 + sportswt;
        putNumber();
        putMarks();
        putWt();
        System.out.println("Total Score is: " + total);
    }
}


class MultipleInheritanceDemo{
public static void main(String[] args)

{

Result r1=new Result();
r1.getNumber(12); 
r1.getMarks (18.0F, 19.0F); 
r1.display();
}

}


