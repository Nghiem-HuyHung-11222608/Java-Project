package Class;

public class Constructor {
    private int modelYear;
    protected String modelName;

//Class constructor
    public Constructor(int year, String name) {
        //Constructor parameters
        modelYear = year;
        modelName = name;
    }

    public static void main(String[]args){
        Constructor myCar = new Constructor(2004,"Lamborghini");
        Constructor yourCar = new Constructor(2000,"Mitsubishi");
                System.out.println(myCar.modelYear+" "+ myCar.modelName);
                System.out.println(yourCar.modelYear+" "+yourCar.modelName);
    }
}