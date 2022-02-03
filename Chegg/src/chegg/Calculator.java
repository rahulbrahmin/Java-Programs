package chegg;

class Calculator {
	public Double add(Double num1 , Double num2) {
		return num1 + num2;
	}
	
	public Double subtract(Double num1 , Double num2) {
		return num1 - num2;
	}
	
	public Double multiply(Double num1 , Double num2) {
		return num1 * num2;
	}
	
	public Double divide(Double num1 , Double num2) {
		return num1 / num2;
	}
	
	public Double avg(Double num1 , Double num2) {
		return (num1+num2)/2;
	}
	
	public Double mod(Double num1 , Double num2) {
		return num1 % num2;
	}
	
	public Boolean logicAnd(Double num1 , Double num2) {
		return (num1>num2) && (num2>0);
	}
	
	public Boolean logicOr(Double num1 , Double num2) {
		return (num1>num2) || (num2>0);
	}
}
