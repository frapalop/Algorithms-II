package ex_one;

public class Job_ex_one implements Comparable<Job_ex_one> {

	private int weight;
	private int lenght;
	private int factor;

	public Job_ex_one(int weight, int lenght) {
		super();
		this.weight = weight;
		this.lenght = lenght;
		this.factor = weight - lenght;

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

	public int getFactor() {
		return factor;
	}

	// Exercise1
	public int compareTo(Job_ex_one compareJob) {

		int factorA = compareJob.factor;

		// ascending order
		if (this.factor != factorA) {

			return factorA - this.factor;

		} else
			return (compareJob.weight - this.weight);

		// descending order
		// return compareQuantity - this.quantity;

	}

	// Exercise2
	// public int compareTo(Job2 compareJob) {
	//
	// int factorA = compareJob.factor;
	//
	// //ascending order
	// if (this.factor != factorA){
	//
	// return factorA - this.factor ;
	//
	// }else return (compareJob.weight - this.weight );
	//
	// //descending order
	// //return compareQuantity - this.quantity;
	//
	// }

}
