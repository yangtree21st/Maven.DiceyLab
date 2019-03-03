public class Main {
    public static void main (String[] args) {
        Simulation simulation = new Simulation(2,10000);
        simulation.runSimulation();
        simulation.printResults();
    }

}
