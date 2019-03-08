package study.pattern.state;

public class SevenHeatMeat implements State{
    @Override
    public String handler(String arg) {
        System.out.println("肉已经七分熟");
        return "all";
    }
}
