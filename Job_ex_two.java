package ex_two;

public class Job_ex_two implements Comparable<Job_ex_two> {

	private int weight;
	private int lenght;
	private double factor;

	public Job_ex_two(int weight, int lenght) {
		super();
		this.weight = weight;
		this.lenght = lenght;
		this.factor = (double) (float) weight / (float) lenght;

	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int _weight) {
		this.weight = _weight;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int _lenght) {
		this.lenght = _lenght;
	}

	public double getFactor() {
		return factor;
	}

	// Exercise2
	public int compareTo(Job_ex_two compareJob) {

		if ((compareJob.factor - this.factor) < 0) { return -1;}
		
		if ((compareJob.factor - this.factor) == 0) { return 0;}
		else { return 1;}

	}


}
