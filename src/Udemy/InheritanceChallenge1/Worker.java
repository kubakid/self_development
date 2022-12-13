package Udemy.InheritanceChallenge1;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public Worker() {
    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }
    public int getAge(Worker worker){
        String[] a = worker.birthDate.split("/");
        return 2022 - Integer.parseInt(a[2]);
    }
    public double collectPay(){
        return 0.0;

    }
    public void terminate (String endDate){
        this.endDate = endDate;
    }
}
