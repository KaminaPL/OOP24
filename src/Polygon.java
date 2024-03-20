public class Polygon {

  private Point [] points;

  public Polygon(Point [] points){
      this.points=points;
  }

  public Polygon(Polygon origin){
      this.points= origin.points;
      System.out.println("Skopiowano obiekt...");
  }

    public void toSvg(int i, int j){

        System.out.println(" <svg height=\"200\" width=\"300\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "  <line x1=\""+points[i].x+"\" y1=\""+points[i].y+"\" x2=\""+points[j].x+"\" y2=\""+points[j].y+"\" style=\"stroke:red;stroke-width:2\" />\n" +
                "</svg> ");
    }

}
