
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TemplateManager {

    public static List<String> listTemplates(String templateDir) {
        List<String> templates = new ArrayList<>();
        File folder = new File(templateDir);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".html"));
        if (files != null) {
            for (File file : files) {
                templates.add(file.getName());
            }
        }
        return templates;
    }
}
