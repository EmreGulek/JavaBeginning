package OOP_Beginning.KoordinatSistemi;

public class Koordinat {
    public static void main(String[] args) {
        Point point1 = new Point();

        point1.setxKoordinatı(3);
        point1.setyKoordinatı(4);
        System.out.println(point1.distanceToOrigin());

        Point point2 = new Point();
        point2.setxKoordinatı(6);
        point2.setyKoordinatı(8);
        System.out.println(point2.distanceToOrigin());

        System.out.println(point1.distanceToOtherPoint(point2));


    }

    public static class Point {
        private double xKoordinatı ;
        private double yKoordinatı ;



        public double getxKoordinatı() {
            return xKoordinatı;
        }

        public void setxKoordinatı(int xKoordinatı) {
            this.xKoordinatı = xKoordinatı;
        }

        public double getyKoordinatı() {
            return yKoordinatı;
        }

        public void setyKoordinatı(int yKoordinatı) {
            this.yKoordinatı = yKoordinatı;
        }

        public double distanceToOrigin(){
            return Math.sqrt((yKoordinatı * yKoordinatı) + (xKoordinatı * xKoordinatı));
        }

        public double distanceToOtherPoint(Point otherPoint){
           double distanceX = this.xKoordinatı - otherPoint.xKoordinatı ;
           double distanceY = this.yKoordinatı - otherPoint.yKoordinatı ;
           return Math.sqrt((distanceY*distanceY)+(distanceX*distanceX));
        }
    }
}
