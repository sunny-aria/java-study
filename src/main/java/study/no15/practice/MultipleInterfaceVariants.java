package study.no15.practice;

public class MultipleInterfaceVariants {

}
interface Payable<T>{}
class Employee1 implements Payable{
}
class Hourly extends Employee1 implements Payable{
}