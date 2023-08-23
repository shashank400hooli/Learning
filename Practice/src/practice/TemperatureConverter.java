package practice;
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Fahrenheit to convert to celsius");
		double Fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		double Celsius=temperatureConverter.convertFahrenheitToCelsius((Fahrenheit-32)*5/9);
		System.out.println(Celsius);
	
		
		
		

	}

	public double convertFahrenheitToCelsius(double Fahrenheit) {
		return (Fahrenheit-32)*5/9;
		// TODO Auto-generated method stub
		
	}

}
