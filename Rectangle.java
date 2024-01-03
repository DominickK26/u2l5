public class Rectangle extends Shape {
  public String type = "Rectangle";

  public Rectangle(int height, int width){
    this.height = height;
    this.width = width;
  }

  public void calculateArea(){
    area = height * width;
  }
}