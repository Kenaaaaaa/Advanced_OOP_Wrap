public class Car {
    /*Car class
Create the  Car  class which will store information about a car make and type. It
should contain  getter  and  setter  methods.
Engine class
Implement the  Engine  class which will be a nested non-static class under the
Car  class. This class should contain the eld: engine type and  setEngine
method which will set a type based on the car type. If the car type is  economy ,
then the engine type should be set to  diesel . If the car type is  luxury , then the
engine type should be dened as  electric . Otherwise, the engine type should
be dened as  petrol*/


    private String make;
    private String type;

    public Car(String type, String make) {
        this.type = type;
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public String getType() {
        return type;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    //Klasa jo statike Engine
    public class Engine{

        private String engineType;

        //metoda per te percaktuar tipin e motorit duke u bazuar ne tipin e makines
        public void setEngineType(String engineType) {
            switch (type.toLowerCase()){
                case "economy":
                    this.engineType = engineType;
                    break;
                case "luxury":
                    this.engineType = "Luxury";
                    break;
                default:
                    this.engineType="Petrol";
            }

        }
    }
}
