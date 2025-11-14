
public class User {
    private String name;
    private String email;
    private String phone;
    private String education;
    private String skills;
    private String experience;

    // Constructor
    public User(String name, String email, String phone, String education, String skills, String experience) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.education = education;
        this.skills = skills;
        this.experience = experience;
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getEducation() { return education; }
    public String getSkills() { return skills; }
    public String getExperience() { return experience; }
}
