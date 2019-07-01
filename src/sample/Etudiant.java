package sample;

public class Etudiant {
    private int id;
    private String FName;
    private String LName;
    private Double Average;

    public Etudiant(String fname,String lname, Double av){
        this.FName=fname;
        this.LName=fname;
        this.Average=av;
    }

    public Etudiant() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String fname) {
        this.FName = fname;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String lName) {
        this.LName = lName;
    }

    public Double getAverage() {
        return Average;
    }

    public  void setAverage(Double av){
        this.Average=av;
    }
}


