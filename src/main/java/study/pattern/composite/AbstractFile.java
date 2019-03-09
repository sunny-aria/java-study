package study.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * c抽象文件,适用树形结构（统一的行为接口，叶子节点，容器节点（包含叶子节点））-文件夹，部门组织结构
 */
public  interface AbstractFile {
    /**
     * 定义统一的行为
     */
     void killVirus();
}

/**
 * 叶子节点，文本文件
 */
class TextFile implements AbstractFile{
    String name;

    public TextFile(String name) {
        super();
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--文本文件查杀--"+this.name);
    }
}
/**
 * 叶子节点，图片文件
 */
class ImageFile implements AbstractFile{
    String name;

    public ImageFile(String name) {
        super();
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--图片文件查杀--"+this.name);
    }
}
/**
 * 叶子节点，视频文件
 */
class VideoFile implements AbstractFile{
    String name;

    public VideoFile(String name) {
        super();
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("--视频文件查杀--"+this.name);
    }
}

/**
 * 容器节点，文本夹
 */
class Folder implements AbstractFile{
    String name;
    List<AbstractFile> list = new ArrayList<AbstractFile>();
    public Folder(String name) {
        super();
        this.name = name;
    }
    public void add(AbstractFile file){
        this.list.add(file);
    }
    public void remove(AbstractFile file){
        this.list.remove(file);
    }
    public AbstractFile get(int index){
        return this.list.get(index);
    }
    @Override
    public void killVirus() {
        System.out.println("--文件夹查杀--"+this.name);
        list.forEach(a->a.killVirus());
    }
}