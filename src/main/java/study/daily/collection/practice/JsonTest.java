package study.daily.collection.practice;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 *
 * @author sundongfeng
 * @date 2021/3/5 9:54
 */
public class JsonTest {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("venderId",200101);
        JSONObject url = new JSONObject();
//        venderUrlsTypeMap.put(15,"syncAddressInfo");
//        venderUrlsTypeMap.put(57,"syncJdExpressInfo");
//        venderUrlsTypeMap.put(302,"promptCreate");
//        venderUrlsTypeMap.put(511,"privateInfo");
//        venderUrlsTypeMap.put(510,"qulityReportNew");
//        venderUrlsTypeMap.put(403,"riskCheck");
        url.put("syncAddressInfo","https://jdgw.aihuishou.com/c2b-gateway-jd/external/jd/order/sync-address-info");
        url.put("syncJdExpressInfo","https://jdgw.aihuishou.com/c2b-gateway-jd/external/jd/order/sync-jd-express-info");
        url.put("promptCreate","https://jdgw.aihuishou.com/c2b-gateway-jd/external/jdv2/order/prompt-create");
        url.put("privateInfo","https://jdgw.aihuishou.com/c2b-gateway-jd/external/jdv2/Product/private-report?orderNo=%s&userId=%s");
        url.put("qulityReportNew","https://jdgw.aihuishou.com/c2b-gateway-jd/external/jdv2/product/quality-report-new?orderNo=%s&userId=%s");
        url.put("riskCheck","https://jdgw.aihuishou.com/c2b-gateway-jd/external/jdv2/risk/risk-check");
        obj.put("urls",url);
        List<JSONObject> list  = new ArrayList<>();
        list.add(obj);
        System.out.println(JSONObject.toJSON(list));
    }
}
