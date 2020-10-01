package ru.sapteh;

public class Student extends Man{
    private int yearStudy;
    public Student(String name,int age,String gender,int weight,int yearStudy){
        super(name, age, gender, weight);
        this.yearStudy= yearStudy;
    }
    public int getYearStudy(){
        return yearStudy;
    }
    public void setYearStudy(int yearStudy){
            this.yearStudy = yearStudy;
    }
    public void nextYear(){
        this.yearStudy++;
    }
    @Override
    public String toString(){
        return "Name: "+ super.getName()+"\n"+
                "Age: "+ super.getAge() + "\n"+
                "Gender: "+ super.getGender()+"\n"+
                "Weight: "+ super.getWeight()+ "\n"+
                "Год обучения: "+ getYearStudy()+"\n";
    }
}
