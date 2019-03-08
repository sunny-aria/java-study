package study.pattern.state;

public class AllHeatMeat implements State{
    @Override
    public String handler(String arg) {
        System.out.println("肉已经出锅了。");
        return "end";
    }
}
