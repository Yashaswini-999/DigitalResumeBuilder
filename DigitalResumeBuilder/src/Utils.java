

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {

    // Read file content as a String
    public static String readFile(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            System.out.println("Error reading file: " + path);
            return "";
        }
    }

    // Write content to file
    public static void writeFile(String path, String content) {
        try {
            Files.write(Paths.get(path), content.getBytes());
        } catch (IOException e) {
            System.out.println("Error writing file: " + path);
        }
    }

    // Convert comma-separated skills into HTML list items
    public static String formatSkills(String skills) {
        StringBuilder sb = new StringBuilder();
        String[] skillArray = skills.split(",");
        for (String skill : skillArray) {
            sb.append("<li>").append(skill.trim()).append("</li>");
        }
        return sb.toString();
    }

    // Generate a safe file name from user name
    public static String generateFileName(String name) {
        return name.trim().replaceAll("\\s+", "_") + "_Resume.html";
    }
}
