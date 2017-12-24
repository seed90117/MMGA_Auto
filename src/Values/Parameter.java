package Values;

public class Parameter {

	private int generation;
	private int chromosome;
	private double crossoverRate;
	private double mutationRateC;
	private double mutationRateE;
	private double optRate;
	private double minOptRate;
	double optReduce = 0.9975;
	double optAdd = 1.05;
	private double sizeX;
	private double sizeY;
	private double addNumber;
	private static Parameter instance = null;
	private Parameter(){}
	
	public static synchronized Parameter getInstance() {
		if (instance == null) {
			instance = new Parameter();
		}
		return instance;
	}
	
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	
	public void setChromosome(int chromosome) {
		if (chromosome%2 != 0)
			chromosome++;
		this.chromosome = chromosome;
	}
	
	public void setCossoverRate(double crossoverRate) {
		this.crossoverRate = crossoverRate;
	}
	
	public void setMutationRateC(double mutationRateC) {
		this.mutationRateC = mutationRateC;
	}
	
	public void setMutationRateE(double mutationRateE) {
		this.mutationRateE = mutationRateE;
	}
	
	public void setOptRate(double optRate) {
		this.optRate = optRate;
	}
	
	public void setMinOptRate(double minOptRate) {
		this.minOptRate = minOptRate;
	}
	
	public void setOptReduce(double optReduce) {
		this.optReduce = optReduce;
	}
	
	public void setOptAdd(double optAdd) {
		this.optAdd = optAdd;
	}
	
	public void setPointParameter(double sizeX, double sizeY, double addNumber) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.addNumber = addNumber;
	}
	
	public int getGeneration() {
		return this.generation;
	}
	
	public int getChromosome() {
		return this.chromosome;
	}
	
	public double getCossoverRate() {
		return this.crossoverRate;
	}
	
	public double getMutationRateC() {
		return this.mutationRateC;
	}
	
	public double getMutationRateE() {
		return this.mutationRateE;
	}
	
	public double getOptRate() {
		return this.optRate;
	}
	
	public double getMinOptRate() {
		return this.minOptRate;
	}
	
	public double getOptReduce() {
		return this.optReduce;
	}
	
	public double getOptAdd() {
		return this.optAdd;
	}
	
	public double getSizeX () {
		return this.sizeX;
	}
	
	public double getSizeY () {
		return this.sizeY;
	}
	
	public double getAddNumber () {
		return this.addNumber;
	}
}
