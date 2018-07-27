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

    output("ENTER DEGREE TYPE: ");
    String degree = scan.nextLine();

    output("ENTER MAJOR: ");
    String major = scan.nextLine();

    output("ENTER UNIVERSITY NAME: ");
    String university = scan.nextLine();

    output("ENTER GRADUATION YEAR: ");
    String graduation = scan.nextLine();

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

            output("ENTER SKILL LEVEL (1=BEGINNER, 2=INTERMEDIATE, 3=ADVANCED: ");
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

            output("DO YOU WANT TO ADD ANOTHER SKILL? (ENTER 'q' TO QUIT)");
            skillInput = scan.next();


            skillResult += skill + ", " + level + "\n";

        }

    //DISPLAY RESUME

        output("***************************************************************");
        output(name);
        output(email);

        output("\n");

        output("Education");
        output(degree + ", " + major);
        output(university + ", " + graduation);


        output("\n");

        output("Experience");
        output(title);
        output(company + ", " + startDate + " - " + endDate);
        output("Duty 1, " + description1);
        output("Duty 2, " + description2);

        output("\n");

        output("Skills");
        output(skillResult);
    }

    //PRINT OUT METHOD

    public static void output(String message){
        System.out.println(message);
    }

}



