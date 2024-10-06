package Basic;

public class Practice3 {
    public static void main(String[] args) {
    int tilelength=13;
    int tilebreadth=7;
    int regionlength=540;
    int regionbreadth=140;
    int requiredtileslength=0;
    int requiredtilesbreadth=0;
    int requiredtiles;
    int areaofplot;
    int areaoftiles;
      // public int requiredtiles(){
        // requiredtileslength = regionlength / tilelength;
        // System.out.println("tiles required on length: "+requiredtileslength);
        // requiredtilesbreadth = regionbreadth / tilebreadth;
        // System.out.println("tiles required on breadth: "+requiredtilesbreadth);
        //requiredtiles = requiredtileslength * requiredtilesbreadth;
    //     areaofplot=regionlength*regionbreadth;
    //     System.out.println("area of region is:"+areaofplot);
    //     areaoftiles = tilelength*tilebreadth;
    //     System.out.println("area of tiles is : "+areaoftiles);
    //     requiredtiles=areaofplot/areaoftiles;
    //     System.out.println("The Number of tiles required to cover region is :  "+requiredtiles);
    //     return requiredtiles;
    //   }
    //    public static void main(String[] args) {
    //     Practice3 p = new Practice3();
    //     p.requiredtiles();
     int areaofregion=regionlength*regionbreadth;
    int areaoftile=tilelength*tilebreadth;
    int required=areaofregion/areaoftile;
    System.out.println("the number of tiles required to cover region is:"+required);
    }
}
