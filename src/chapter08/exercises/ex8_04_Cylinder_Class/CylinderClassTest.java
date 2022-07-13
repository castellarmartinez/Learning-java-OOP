package chapter08.exercises.ex8_04_Cylinder_Class;

public class CylinderClassTest {
   public static void main(String[] args) {
      Cylinder myCylinder = new Cylinder();

      System.out.println("The cylinder's radius is: " + myCylinder.getRadius());
      System.out.println("The cylinder's height is: " + myCylinder.getHeight());
      System.out.println("The cylinder's volume is: " + myCylinder.getVolume());

      System.out.println("\nSetting radius to 3.5 and height to 12");
      myCylinder.setRadius(3.5);
      myCylinder.setHeight(12);

      System.out.println("The cylinder's radius is: " + myCylinder.getRadius());
      System.out.println("The cylinder's height is: " + myCylinder.getHeight());
      System.out.println("The cylinder's volume is: " + myCylinder.getVolume());
   }
}
