package study.pattern.composite;

/**
 * 测试组合模式
 */
public class MainClass {
    public static void main(String[] args) {
        Folder f1 = new Folder("我的电脑");
        AbstractFile f2,f3,f4;
        f2 = new TextFile("小牛.txt");
        f3 = new ImageFile("dog.jpg");
        f4 = new VideoFile("知否.mp4");
        f1.add(f2);
        f1.add(f3);
        f1.add(f4);

        Folder f11 = new Folder("D盘");
        AbstractFile f22,f33,f44 ;
        f22 = new TextFile("小牛22.txt");
        f33 = new ImageFile("dog33.jpg");
        f44 = new VideoFile("知否44.mp4");
        f11.add(f22);
        f11.add(f33);
        f11.add(f44);
        f1.add(f11);
        f1.killVirus();
    }
}
