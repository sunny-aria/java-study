package study.pattern.state;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String,State> stateMap;

    public Context() {
        this.stateMap = new HashMap<>(8);
    }

    /**
     * 放入状态
     * @param key 状态key
     * @param state 实际状态
     */
    public void addState(String key,State state){
         this.stateMap.put(key,state);
    }

    public void exec(String startKey){
        String nextKey = startKey;
        while(true){
            try {
                nextKey = this.stateMap.get(nextKey).handler("");
            }catch (Exception e){
                nextKey = "err";
                System.out.println("状态机出现问题了"+e.getMessage());
            }
            if("end".equals(nextKey)||"err".equals(nextKey)){
                break;
            }
        }
    }
}
