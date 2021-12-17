package test02;

public class Car2 {
   
   
   String color = "white";
   int speed = 0;
   static String corparation = "현대";
   
   Car2(){
      
   }
   
   Car2(String color){
      this.color = color;
   }
   
   void forward() {
      System.out.println("전진합니다");
      speed++;
   }
   
   void backward() {
      System.out.println("후진합니다");
      speed--;
   }

}
