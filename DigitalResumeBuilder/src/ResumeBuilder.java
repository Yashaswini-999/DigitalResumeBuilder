import java.util.Scanner;

public class ResumeBuilder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get user details
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter Education: ");
        String education = sc.nextLine();

        System.out.print("Enter Skills (comma separated): ");
        String skills = sc.nextLine();

        System.out.print("Enter Experience: ");
        String experience = sc.nextLine();

        System.out.print("Enter Projects: ");
        String projects = sc.nextLine();

        System.out.print("Enter Hobbies: ");
        String hobbies = sc.nextLine();

        // 2. Select template
        System.out.println("\nAvailable Templates:");
        System.out.println("1. template1.html");
        System.out.println("2. template2.html");
        System.out.print("Select template number: ");
        int templateChoice = Integer.parseInt(sc.nextLine());

        String templateFile = (templateChoice == 1) ? "web/templates/template1.html" : "web/templates/template2.html";

        // 3. Read template content
        String template = Utils.readFile(templateFile);

        // 4. Replace placeholders
        template = template.replace("{{name}}", name);
        template = template.replace("{{email}}", email);
        template = template.replace("{{phone}}", phone);
        template = template.replace("{{education}}", education);
        template = template.replace("{{skills}}", Utils.formatSkills(skills));
        template = template.replace("{{experience}}", experience);
        template = template.replace("{{projects}}", projects);
        template = template.replace("{{hobbies}}", hobbies);

        // 5. Generate dynamic output filename
        String outputFileName = "output/" + Utils.generateFileName(name);

        // 6. Write the final resume HTML
        Utils.writeFile(outputFileName, template);

        System.out.println("\nResume generated successfully at: " + outputFileName);

        sc.close();
    }
}
