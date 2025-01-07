public class Driver {
    String name;
    boolean isBooked;
    int[] districtCoverage;

    Driver(String name, int[] districtCoverage){
        this.name = name;
        this.districtCoverage = districtCoverage;
    }

    int[] getDistrictCoverage(){
        return districtCoverage;
    }

    String getName(){
        return name;
    }

}
