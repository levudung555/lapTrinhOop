public class Astronomer {
    private String name;
    private String researchField;
    private int publications;
    private String university;

    public Astronomer(String name, String researchField, int publications, String university) {
        this.name = name;
        this.researchField = researchField;
        this.publications = publications;
        this.university = university;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getResearchField() { return researchField; }
    public void setResearchField(String researchField) { this.researchField = researchField; }

    public int getPublications() { return publications; }
    public void setPublications(int publications) { this.publications = publications; }

    public String getUniversity() { return university; }
    public void setUniversity(String university) { this.university = university; }

    public void showInfo() {
        System.out.println("Astronomer: " + name + ", Field: " + researchField +
                ", Publications: " + publications + ", University: " + university);
    }
}
