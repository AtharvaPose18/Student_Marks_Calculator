import java.util.Scanner;
public class Student_marks_calculator{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String name=sc.nextLine();
        int total=0;
        for(int i=1;i<=5;i++){
            System.out.println("Enter the marks in subject"+i+":");
            int marks=sc.nextInt();
            total=total+marks;
        }
        double percentage=total/5.0;
        System.out.println("Name of student:"+name);
        System.out.println("Total marks obtained:"+total);
        System.out.println("Percentage:"+percentage+"%");
        System.out.println("Grade obtained:");
        if(percentage>=90){
                System.out.println("A Grade");
        }
        else if(percentage>=80){
            System.out.println("B Grade");
        }
        else if(percentage>=70){
            System.out.println("C Grade");
        }
        else if(percentage>=60){
            System.out.println("D Grade");
        }
        else if(percentage>=35){
                System.out.println("Fail");
        }
    }
}