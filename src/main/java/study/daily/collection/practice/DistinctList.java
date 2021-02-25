package study.daily.collection.practice;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述：集合元素去重
 *
 * @author sundongfeng
 * @date 2021/2/25 16:37
 */
public class DistinctList {

    /**
     * 过滤list 获取 list
     * @param list
     * @return
     */
    public static List<Node> filterList(List<Node> list){
        Map<String,Node> smap = new HashMap<>();
        list.stream().forEach(it -> {
            if (smap.containsKey(it.getChildOid())) {
                if(!smap.get(it.getChildOid()).getSplit().equals("1") && it.getSplit().equals("1")){
                    smap.put(it.getChildOid(), it);
                }
            } else {
                smap.put(it.getChildOid(), it);
            }
        });
        List<Node> nodes= new ArrayList<>();
        nodes.addAll(smap.values());
        return  nodes;
    }

    //递归方法
    public static void genChilds(Node node){
        if("1".equals(node.getSplit())){
            //node.ChildOid 作为主单号查询拆单信息
            List<Node> childs = queryChilds(node.getChildOid());
            node.setChilds(childs);
            if(childs!=null && childs.size()>0){
                childs.stream().forEach(item->{
                    if(item.getSplit().equals("0")){
                        //查询delivery信息
                    }else {
                        genChilds(item);
                    }
                });
            }
        }
    }

    /**
     * node.ChildOid 作为主单号查询拆单信息
     * @param childOid
     * @return
     */
    public static List<Node> queryChilds(String childOid){
        //查询数据库信息
        List<Node> list = new ArrayList<>();
        return filterList(list);
    }

    public static void main(String[] args) {
        List<Node> flist = new ArrayList<>();
        List<Node> slist = new ArrayList<>();
        Node node  = new Node("9093","1","4116","6048");
        Node aNode = new Node("9093","1","4116","8673");
        Node bNode = new Node("9093","1","4116","1565");
        Node cNode = new Node("9093","0","1797","4201");
        Node dNode = new Node("9093","0","4116","1257");
        Node eNode = new Node("9093","0","1765","4390");
        Node fNode = new Node("4116","0","6354","6048");
        Node gNode = new Node("4116","0","6354","1565");
        Node hNode = new Node("4116","0","6354","8673");
        Node iNode = new Node("4116","0","8423","1257");
        flist.add(node);
        flist.add(aNode);
        flist.add(bNode);
        flist.add(cNode);
        flist.add(dNode);
        flist.add(eNode);
        slist.add(fNode);
        slist.add(gNode);
        slist.add(hNode);
        slist.add(iNode);
        //处理slist

        List<Node> ssList = filterList(slist);
        System.out.println(JSON.toJSON(ssList));
        List<Node> ffList = filterList(flist);
        System.out.println(JSON.toJSON(ffList));
        ffList.stream().forEach(it->
        {
            if(it.getChildOid().equals(ssList.get(0).getMainOid())){
                it.setChilds(ssList);
            }else {
                //将childOid 作为主单号查询拆单信息
                //这里有个递归操作，查询拆单信息
                genChilds(it);
            }
        });

        System.out.println(JSON.toJSON(ffList));

    }

    public static class Node{
        String mainOid;
        String split;
        String childOid;
        String skuId;
        List<Node> childs;
        public Node(){}
        public Node(String mainOid,String split,String childOid,String skuId){
            this.mainOid=mainOid;
            this.skuId=skuId;
            this.split=split;
            this.childOid=childOid;
        }

        public String getMainOid() {
            return mainOid;
        }

        public void setMainOid(String mainOid) {
            this.mainOid = mainOid;
        }

        public String getSplit() {
            return split;
        }

        public void setSplit(String split) {
            this.split = split;
        }

        public String getChildOid() {
            return childOid;
        }

        public void setChildOid(String childOid) {
            this.childOid = childOid;
        }

        public String getSkuId() {
            return skuId;
        }

        public void setSkuId(String skuId) {
            this.skuId = skuId;
        }

        public List<Node> getChilds() {
            return childs;
        }

        public void setChilds(List<Node> childs) {
            this.childs = childs;
        }

    }
}
