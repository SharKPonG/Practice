import java.util.Scanner;

// SuperClass or Main Class
class Animal {
    // Attribute
    private String name;
    private int age;
    private String species;
    
    
    //constructer
    Animal(String name, int age, String species){
        this.name = name;
        this.age = age;
        this.species = species;
    }



    // method
        public void makeSound(){
        System.out.println("Animal sound");
    }

    public void showInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species);
    }

    //getter
    public String getSpecies(){
        return species;
    }
    //getter
    public String getName(){
        return name;
    }
    //getter
    public int getAge(){
        return age;
    }
    //setter NO RETURN
    public void setName(String name){
        this.name = name;
    }

    public void hunt(){

    }
}

//Sub class 
//inheritance
class Carnivore extends Animal {
    //Attrivute True or False
    private boolean isHungry;



    public Carnivore (String name, int age, String species, boolean isHungry){
        super(name,age,species);
        this.isHungry = isHungry;
    }


    public void hunt(){
        if (isHungry == true){
            System.out.println("The animal is hunting");
        }else{
            System.out.println("The animal is not hungry");
        }

    }

    // Overide
    public void makeSound(){
        System.out.println("Roar!");
    }

    public void showInfo(){
        super.showInfo();
        System.out.println(isHungry);
    }
}


public class ZooApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Carnivore[] carni = new Carnivore[3];

        for (int i = 0; i < carni.length; i++) {

            System.out.print("Animal is Name: ");    
            String name = in.nextLine();

            System.out.print("Animal is Age: ");   
            int age = Integer.parseInt(in.nextLine());

            System.out.print("Animal is Species: ");
            String species = in.nextLine();

            System.out.print("Animal is Hungry: ");
            boolean isHungry = Boolean.parseBoolean(in.nextLine());


            carni[i] = new Carnivore(name, age, species, isHungry);

            if (age < 3 ){
                System.out.println("This is a young animal");
            }else{
                System.out.println("This is an adult animal");
            }
        }


        System.out.println("=== Animal Information ===");
        // object
        for (Carnivore car : carni){
            car.showInfo();
            car.hunt();
            car.makeSound();
        }


        in.close();
    }
}




