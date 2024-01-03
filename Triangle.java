public class Triangle extends Shape {
  public String type = "Triangle";

  public Triangle (int height, int width){
    this.height = height;
    this.width = width;
  }

  public void calculateArea(){
    area = (height * width) / 2 ;
  }
}