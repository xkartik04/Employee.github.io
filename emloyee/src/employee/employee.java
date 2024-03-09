package employee;
import java.util.Scanner;
class age{
    Scanner sc = new Scanner(System.in);
    int a;
    void show(){
        System.out.print("Enter your Age - ");
        a = sc.nextInt();
        if(a>=18){
            System.out.println("Your eligible For my Company.");
        }
        else{
            System.out.println("Your are not eligible for my Company.");
        }

    }
}
class qualification extends  age{
    Scanner ss = new Scanner(System.in);
    String name;
    int age1;
    void show2(){
        System.out.print("Enter Your Full Name :- ");
        name = ss.nextLine();
        System.out.print("Enter Your Current age :- ");
        age1 = ss.nextInt();

        System.out.println("Your Name is : "+name);
        System.out.println("Your age is : "+age1);
        System.out.println(" ");
//         System.out.println("Congrats you are");
    }

}
class selection extends qualification{
    Scanner sa = new Scanner(System.in);
    int i;
    void show3(){
        System.out.println("Employee ask to sir.Sir i am selected or not please tell? ");
        System.out.println("Sir say to you if  ? i  Press 1 then you are Selected otherwise for 2 You are not Selected");
        i = sa.nextInt();
        if(i==1){
            System.out.println("[ Your are selected ] ");
        }
        else{
            System.out.println("[ You are not Selected ]");
        }
    }
}
class last extends selection{
    Scanner ks = new Scanner(System.in);
    int k=50000,s=13300,sum=0;
    String p;
    void show4(){
        System.out.print("Bose Name is : ");
        p = ks.nextLine();
        System.out.println("Bose Name : "+p);
        System.out.println("So lets talk about  your salary, your salary is : "+k+"rs");
        System.out.println("Boy listen here there is offer,if you do over time for my company then i add overtime salary. ");
        System.out.println("Salary is of overtime is : "+s+"rs");
        System.out.println("After that your total salary is "+k+"="+s+"rs");
        sum= k+s;
        System.out.println("total is = "+sum);
    }

}
public class employee {
    public static void main(String[] args){
        System.out.println("Our Company name xkartik05");


        age ss2 = new age();
        ss2.show();

        qualification ss3 = new qualification();
        ss3.show2();

        selection ss4 = new selection();
        ss4.show3();

        last ss6 = new last();
        ss6.show4();
    }
}


