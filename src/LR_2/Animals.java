package LR_2;

public class Animals {

    private String name;
    private String species;
    private String color;
    private int age;
    private boolean Wild;

    public Animals(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.Wild = Wild;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 ) {
            this.age = age;
        }
    }

    public boolean isWild() {
        return Wild;
    }

    public void setWild(boolean wild) {
        Wild = wild;
    }

    public void Info(){
        System.out.println("animals:" + species + " name " + name + "color" + color + " age " + age);
    }
}
