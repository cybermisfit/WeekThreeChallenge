import java.util.Scanner;
//import java.util.ArrayList;

public class ResumeApp {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    //output("***************************************************************"+"\n");

    output("ENTER NAME: ");
    String name = scan.nextLine();

    output("ENTER EMAIL ADDRESS:  ");
    String email = scan.nextLine();

    //output("EDUCATION");

    output("ENTER DEGREE TYPE (AA, BS, MS, PhD, etc.): ");
    String degree = scan.nextLine();

    output("ENTER MAJOR: ");
    String major = scan.nextLine();

    output("ENTER UNIVERSITY NAME: ");
    String university = scan.nextLine();

    output("ENTER GRADUATION YEAR: ");
    String graduation = scan.nextLine();
    //Use String instead of int to avoid errors and allow more than one word in other fields.

    //output("WORK EXPERIENCE");

    output("ENTER MOST RECENT JOB TITLE: ");
    String title = scan.nextLine();

    output("ENTER COMPANY: ");
    String company = scan.nextLine();

    output("ENTER START DATE: ");
    String startDate = scan.nextLine();

    output("ENTER END DATE: ");
    String endDate = scan.nextLine();

    output("ENTER JOB DESCRIPTION #1: ");
    String description1 = scan.nextLine();

    output("ENTER JOB DESCRIPTION #2: ");
    String description2 = scan.nextLine();

    //output("SKILLS");

    String skillInput = "";
    String skillResult = "";

        while (!(skillInput.equalsIgnoreCase("q"))) {

            output("ENTER SKILL: ");
            String skill = scan.next();
            //went back to scan.next to avoid errors

            output("ENTER SKILL LEVEL (1=BEGINNER, 2=INTERMEDIATE, 3=ADVANCED): ");
            int skillLevel = scan.nextInt();

            String level = "";
            switch (skillLevel) {

                case 1:
                    level = "Beginner";
                    break;
                case 2:
                    level = "Intermediate";
                    break;
                case 3:
                    level = "Advanced";
                    break;
                default:
                    level = "Invalid";
                    break;
            }

            output("DO YOU WANT TO ADD ANOTHER SKILL (3 Skill Minimum)? (ENTER 'q' TO QUIT)");
            skillInput = scan.next();


            skillResult += skill + ", " + level + "\n";

        }

    //DISPLAY RESUME

        output("***************************************************************");
        output(name);
        output(email);

        output("\n");

        output("EDUCATION");
        output(degree + ", " + major);
        output(university + ", " + graduation);


        output("\n");

        output("EXPERIENCE");
        output(title);
        output(company + ", " + startDate + " - " + endDate);
        output("Duty 1, " + description1);
        output("Duty 2, " + description2);

        output("\n");

        output("SKILLS");
        output(skillResult);
    }

    //PRINT OUT METHOD

    public static void output(String message){
        System.out.println(message);
    }

}



