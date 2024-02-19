public class GenericClassExample <T>{

    private T deger;

    // Constructor
    public GenericClassExample(T deger) {
        this.deger=deger;
    }

    // Getter method
    public T getDeger() {
        return deger;
    }

    // Setter method
    public void setDeger(T deger) {
        this.deger=deger;
    }

    // Print method
    public void printDeger() {
        System.out.println("Yazdirilacak Deger: " + deger);
    }

}
