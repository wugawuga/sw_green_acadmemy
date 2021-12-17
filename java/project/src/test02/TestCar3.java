package test02;

public class TestCar3 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Car2 myCar = new Car2();
      Car2 yourCar = new Car2();
      Car2 hisCar = new Car2();
      Car2 herCar = new Car2();
      
      System.out.println(myCar.corparation);
      System.out.println(yourCar.corparation);
      System.out.println(hisCar.corparation);
      System.out.println(herCar.corparation);
      
      Car2.corparation = "HD";
      
      System.out.println(myCar.corparation);
      System.out.println(yourCar.corparation);
      System.out.println(hisCar.corparation);
      System.out.println(herCar.corparation);

   }

}