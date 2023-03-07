package poliHeranc;

public class teacher {
    private String name;
    private int age;
    private String major;
    private String discipline;
    
    public teacher(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    public String getDiscipline() {
		return discipline;
	}
    public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
}

