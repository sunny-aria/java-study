package study.pattern.chainofres;

/**
 * 测试责任链模式
 */
public class MainClass {
    public static void main(String[] args) {
        Leader leader1,leader2,leader3;
        leader1 = new Director("张三");
        leader2 = new Manager("李四");
        leader3 = new Ceo("老白");
        leader1.setNextLeader(leader2);
        leader2.setNextLeader(leader3);
        LeaveRequest request = new LeaveRequest("小王",40,"生病看医生");
        leader1.handler(request);
    }
}
