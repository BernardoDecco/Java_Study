package LambdaExpression;

//Exercise 4.5:
//This exercise asks you to write a few lambda expressions and a function that returns a lambda expression as its value. Suppose that a function interface ArrayProcessor is defined as
//
//public interface ArrayProcessor {
//    double apply( double[] array );
//}
//Write a class that defines four public static final variables of type ArrayProcessor that process an array in the following ways: find the maximum value in the array, find the minimum value in an array,
//find the sum of the values in the array, and find the average of the values in the array. In each case, the value of the variable should be given by a lambda expression. The class should also define a function
//
//public static ArrayProcessor counter( double value ) { ...
//This function should return an ArrayProcessor that counts the number of times that value occurs in an array. The return value should be given as a lambda expression.
//
//The class should have a main() routine that tests your work. The program that you write for this exercise will need access to the file ArrayProcessor.java, which defines the functional interface.

public interface ArrayProcessor {
	double apply(double[] array);
}