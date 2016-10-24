
// Takes a base b and an exponent e from the user, and returns the result of b^e

int power(int base, int exponent){
	int answer = 1
	for (i = 0; i < exponent; i++){
		answer = answer * base
	}
	return answer	
}

// Takes an exponent e from the user and returns the result of 2^e. This method must call the previous one to find out the result.

int power2(int exponent){
	return power(2, exponent)
}

int binary2decimal(String binaryNumber){
	int decimalNumber = 0
	for (int i = binaryNumber.length(); i > 0; i--){
		String c = binaryNumber.substring(i - 1, i)
		int digit = Integer.parseInt(c)
		if (digit == 1){
			decimalNumber = decimalNumber + power2(binaryNumber.length() - i)
		}
	}
	return decimalNumber
}

String decimal2binary(int decimalNumber){
	String binaryNumber = ""
	int calculation = decimalNumber
	int remainder
	while (calculation != 0){
		remainder = calculation % 2
		calculation = calculation / 2
		if (remainder == 1){
			binaryNumber = 1 + binaryNumber
		} else {
			binaryNumber = 0 + binaryNumber
		}
	}
	return binaryNumber
}

println "What would you like to do?"
println "input 1 to convert a binary number to a decimal"
println "input 2 to convert a decimal number to a binary"
String str = System.console().readLine()
int option = Integer.parseInt(str)
switch (option) {
	case 1:	println "Please input a binary number"
		str = System.console().readLine()
		println "In decimal your number is " + binary2decimal(str)
		break
	case 2:	println "Please input a decimal number"
		str = System.console().readLine()
		int decimalNumber = Integer.parseInt(str)
		println "In binary your number is " + decimal2binary(decimalNumber)
		break
	default: println "Invalid option."
	}