public class Dice {


    private Integer numberOfDics;


    public Dice(Integer numberOfDics) {

        this.numberOfDics = numberOfDics;
    }


    public Integer getNumberOfDics() {
        return numberOfDics;
    }

    public void setNumberOfDics(Integer numberOfDics) {
        this.numberOfDics = numberOfDics;
    }

    public Integer toss() {
        Integer toss = (int) (Math.random() * 6 + 1);
        return toss;
    }



    public Integer tossAndSum() {
        Integer sum = 0;
        for (int i = 0; i < numberOfDics; i++) {
            sum += toss();
        }
        return sum;
    }


}



