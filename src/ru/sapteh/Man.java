package ru.sapteh;

public class Man {
    private String name;
    private int age;
    private String gender;
    private int weight;
    public Man(String name,int age,String gender,int weight){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.weight= weight;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public int getWeight(){
        return weight;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public  void setWeight(int weight){
        this.weight= weight;
    }
    @Override
    public String toString(){
        return "Name: "+ getName()+"\n"+
                "Age: "+ getAge() + "\n"+
                "Gender: "+ getGender()+"\n"+
                "Weight: "+ getWeight()+ "\n";
    }
}
