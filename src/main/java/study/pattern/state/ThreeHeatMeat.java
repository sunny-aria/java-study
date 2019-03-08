package study.pattern.state;

/**
 * 三分熟的肉
 */
public class ThreeHeatMeat implements State{
    @Override
    public String handler(String arg) {
        System.out.println("肉已经三分熟");
        return "seven";
    }
}
