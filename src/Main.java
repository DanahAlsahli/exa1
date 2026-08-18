import java.util.Scanner;
public class Main{
    public static void main(String[] args){
     Scanner input=new Scanner(System.in);

     //Q1:Write a Java program that accept three numbers from the user and print the largest number .
        System.out.println("enter a 1st number:");
        int n1=input.nextInt();
        System.out.println("enter a2nd number:");
        int n2=input.nextInt();
        System.out.println("enter a 3rd number:");
        int n3=input.nextInt();

        if(n1>n2 && n1>n3){
         System.out.println("the largest number is: "+n1);
        }else if(n2>n1 && n2>n3){
            System.out.println("the largest number is: "+n2);
        }else{
            System.out.println("the largest number is: "+n3);
        }

        //Q2: Write a Java program that accept a String and a number from the user, then print the character at the given index( the number) .
        System.out.println("please enter a string: ");
        String s1=input.nextLine();
        input.nextLine();
        System.out.println("please enter an index: ");
        int n4=input.nextInt();

        for(int i=0; i>s1.length(); i++){
         System.out.println(s1.charAt(i));

        }

        //Q3:
        System.out.println("please enter a 5numbers:");
        int[] numberss=new int[5];
        int sum=0;
        for(int i=0; i<numberss.length; i++){
            numberss[i]=input.nextInt();
            sum+=numberss[i];
        }
        System.out.println("the sum: "+sum);



        //Q3:Write a Java program that allows the user to enter numbers repeatedly until they choose to stop, then displays the total sum of all entered numbers.
        //هنا حنستعمل do while
        /**System.out.println("enter a number:");
        int n5=input.nextInt();
        System.out.println("do u want to continue? ");
        boolean con=true;
        //for(int i=1; i)**/

        //Q4:Write a Java program to determine whether each number in a given array is positive or negative.
        //ArrayList<int> numbers <>();

        /**System.out.println("enter a numbers:");
        int n=input.nextInt();**/

        //Q4:Write a Java program to determine whether each number in a given array is positive or negative.
        //System.out.println("enter a 5 nmbers: ");
        //او ممكن احدد كل انديكس في المصفوفه لحال واحدد اذا هوا ضمن اي فئه..
        int[] numm={10, -21,30,31,-25};
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0; i<5; i++){
            numm[i]=input.nextInt();
            if(numm[i]>0){
                pos++;
            }else if(numm[i]<0){
                neg++;
            }else{
                zero++;
            }
            System.out.println("positive: "+pos);
            System.out.println("negative: "+neg);
            System.out.println("zeros: "+zero);
        }


        //Q5:Write a Java program to find the shortest word in a given array of strings.
        String[] wo={"Tuwaiq","Bootcamp","Student","JAVA"};
        System.out.println(wo);
        boolean shortest=true;
        for(int i=0; i>wo.length; i--){

        }




    }
}

