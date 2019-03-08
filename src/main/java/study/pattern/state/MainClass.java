package study.pattern.state;

public class MainClass {
    public static void main(String[] args) {
        ThreeHeatMeat three = new ThreeHeatMeat();
        SevenHeatMeat seven = new SevenHeatMeat();
        AllHeatMeat all = new AllHeatMeat();

        Context context = new Context();
        context.addState("three",three);
        context.addState("seven",seven);
        context.addState("all",all);
        context.exec("three");
    }
}
