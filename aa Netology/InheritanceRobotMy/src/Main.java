public class Main {

   public static void main(String[] args) {
      SmartRobot robot = new SmartRobot();
      robot.moveDown();
      robot.moveDown();
      robot.moveLeft();
      robot.moveUp();
      robot.moveDown();
      robot.moveLeft();
      robot.moveLeft();

      System.out.println("Координаты робота: " + robot.getX() + ":" + robot.getY());
      System.out.println("Количество шагов: " + robot.getStepsCount());
   }//end of psvm
}//end of Main

class Robot {
   private int x;
   private int y;

   public void moveRight() {x++;}
   public void moveLeft() {x--;}
   public void moveUp() {y--;}
   public void moveDown() {y++;}

   public int getX() {return x;}
   public int getY() {return y;}
}

class SmartRobot extends Robot {
   private int StepsCount = 0;
   private int x,y;

   public void moveRight() {
      this.x++;
      StepsCount++;
   }
   public void moveLeft() {
      this.x--;
      StepsCount++;
   }
   public void moveUp() {
      this.y--;
      StepsCount++;
   }
   public void moveDown() {
      this.y++;
      StepsCount++;
   }

   @Override
   public int getX() {return x;}
   @Override
   public int getY() {return y;}

   public int getStepsCount() {
      return StepsCount;
   }
}