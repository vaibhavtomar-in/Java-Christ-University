public class SimpleCalculator{
	private double firstNumber;
	private double secondNumber;
	public SimpleCalculator(){
	}
	public SimpleCalculator(double firstNumber, double SecondNumber){
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	public double getFirstNumber(){
		return this.firstNumber;
	}
	public double getSecondNumber(){
		return this.secondNumber;
	}
	public void setFirstNumber(double firstNumber){
		this.firstNumber = firstNumber;
	}
	public void setSecondNumber(double secondNumber){
		this.secondNumber = secondNumber;
	}
	public double add(){
		return firstNumber + secondNumber;
	}
	public double subtract(){
		return firstNumber - secondNumber;
	}
	public double multiply(){
		return firstNumber * secondNumber;
	}
	public double divide(){
		return firstNumber / secondNumber;
	}
}