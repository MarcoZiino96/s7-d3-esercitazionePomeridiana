package it.epicode.adapter;

public class UserData {
    private  String nameComplete;
    private  int age;


    public UserData(DataSource ds){
        this.nameComplete= ds.getNameComplete();
        this.age = ds.getAge();
    }

    public void setNameComplete(String nameComplete) {
        this.nameComplete = nameComplete;
    }

    public void setEta(int eta) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "nameComplete='" + nameComplete + '\'' +
                ", age=" + age +
                '}';
    }
}
