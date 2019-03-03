import java.util.TreeMap;

public class Simulation  {

    private Integer numberOfDies;
    private Integer numberOfTosses;
    private Bins bins;
    private Dice dice;






    public Simulation(Integer numberOfDies, Integer numberOfTosses) {


        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        dice = new Dice(numberOfDies);
        bins = new Bins(numberOfDies, numberOfDies*6);
    }

    public void runSimulation(){


        for(int i = 0 ; i <= numberOfTosses ; i++){

            bins.incrementBin(dice.tossAndSum());
        }


    }

    public void printResults(){
          System.out.println("***");
          System.out.println("Simulation of "+numberOfDies+" dice tossed for " + numberOfTosses +" times.");
          System.out.println("***");
          printDice();
    }



    public void printDice() {
        for (int i = numberOfDies; i <= numberOfDies * 6; i++) {
            String scoreDice = String.format("%3d :", i);
            String binTime = String.format("%9d :", bins.getBins(i));

            Double perNumerb = (double) bins.getBins(i);
            Double perResult = perNumerb / numberOfTosses;
            String perR = String.format("%5f",perResult);
            getStar(perResult);
            System.out.println(scoreDice+ binTime + perR + getStar(perResult));
        }

    }
     public String getStar(Double pencentage){
            String star = "";
            for(double j=0.01; j<=pencentage; j+=0.01 ){
                star += "*";
            }
            return star;
        }



}

