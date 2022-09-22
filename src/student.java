import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class student {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
//            ArrayList<String> student = new ArrayList<>();
            HashMap<String, Integer> student = new HashMap<>();
            boolean on=true;
            while (on=true){
                System.out.println("1.student entry");
                System.out.println("2.search rollnumber");
                System.out.println("3.del student");
                System.out.println("4.list student");
                System.out.println("5.exit student");
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("enter name");
                        String x = input.next();
                        System.out.println("enter roll number");

                        int y = input.nextInt();
                        student.put(x, y);
                        break;

                    case 2:
                        System.out.println("enter name to be searched");
                        String x1 = input.next();
//                        boolean result = student.contains(x1);
                        if (student.containsKey(x1)) {

                            // Mapping
                            Integer a = student.get(x1);

                            // Printing value fr the corresponding key
                            System.out.println("roll number for name  \""+ x1+"\" is:- " + a);
                        }

                         else {
                            System.out.println("not found");
                        }
                        break;

                    case 3:
                        System.out.println("enter name to be deleted");
                        String x2 = input.next();
                        student.remove(x2);
                        break;

                    case 4:
                        System.out.println("list a array");
                        System.out.println(student);
                        break;
                    case 5:
                        System.out.println("exiting..........");
                        on=false;
                    default:
                        System.out.println("invalid");

                }
            }

        }
    }


