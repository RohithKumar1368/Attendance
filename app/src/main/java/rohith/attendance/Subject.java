package rohith.attendance;

import java.util.UUID;

public class Subject {

    private String name ;
    private int totalClasses ;
    private int bunks ;
    private double minPercentage ;
    private  double currentPercentage ;
    private UUID subjectID ;

    public Subject(){
        subjectID = UUID.randomUUID() ;
    }

    public Subject(String n, int tc , int b , double mp , double cp){
        name = n ;
        totalClasses = tc ;
        bunks = b ;
        minPercentage = mp ;
        currentPercentage = cp ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalClasses(int totalClasses) {
        this.totalClasses = totalClasses;
    }

    public void setBunks(int bunks) {
        this.bunks = bunks;
    }

    public void setMinPercentage(double minPercentage) {
        this.minPercentage = minPercentage;
    }

    public void setCurrentPercentage(double currentPercentage) {
        this.currentPercentage = currentPercentage;
    }

    public String getName() {
        return name;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public int getBunks() {
        return bunks;
    }

    public double getMinPercentage() {
        return minPercentage;
    }

    public double getCurrentPercentage() {
        return currentPercentage;
    }

    public UUID getSubjectID() {
        return subjectID;
    }
}
