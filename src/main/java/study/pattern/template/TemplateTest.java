package study.pattern.template;

/**
 * 模版模式测试类
 *
 * @author sunny
 * @create 2017/11/2 14:48
 **/
public class TemplateTest {

    public static void main(String[] args) {
    DoDishTemplate template = null;
    if("tomato".equals(args[0])){
        template = new EggsWithTomato();
    }
    if("potato".equals(args[0])){
        template = new Potato();
    }
    template.templateMethod();

    }
}
