public class Architect {
    private String name;
    private String specialization;
    private int experienceYears;
    private String company;

    public Architect(String name, String specialization, int experienceYears, String company) {
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.company = company;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public int getExperienceYears() { return experienceYears; }
    public void setExperienceYears(int experienceYears) { this.experienceYears = experienceYears; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public void showInfo() {
        System.out.println("Architect: " + name + ", " + specialization + ", "
                + experienceYears + " years, Company: " + company);
    }
}
