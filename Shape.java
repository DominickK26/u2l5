public class Shape{
  public int height;
  public int width;
  public int area;
  public String type;// no default

  public Shape(){
    height = 0;
    width = 0;
    area = 0;
    type = "Shape";
  }

  public Shape(int height, int width){
    this.height = height;
    this.width = width;
  }
}