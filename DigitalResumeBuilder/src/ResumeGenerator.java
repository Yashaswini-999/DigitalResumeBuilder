

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResumeGenerator {

    public static void generateResume(User user, String templatePath, String outputPath) {
        try {
            String template = new String(Files.readAllBytes(Paths.get(templatePath)));

            // Replace placeholders with actual user data
            template = template.replace("{{name}}", user.getName());
            template = template.replace("{{email}}", user.getEmail());
            template = template.replace("{{phone}}", user.getPhone());
            template = template.replace("{{education}}", user.getEducation());
            template = template.replace("{{skills}}", user.getSkills());
            template = template.replace("{{experience}}", user.getExperience());

            // Save to output file
            Files.write(Paths.get(outputPath), template.getBytes());
            System.out.println("Resume generated successfully at: " + outputPath);
        } catch (IOException e) {
            System.out.println("Error generating resume: " + e.getMessage());
        }
    }
}

