package d_责任链模式.s1;


/**
 * @description 我们有一个字符串String msg = ":):,<script>,敏感,被就业,网络授课";我们希望应用以下三个规则对字符串进行过滤和谐处理：
 *
 * 　　(1)将字符串中出现的"<>"符号替换成"[]"
 *
 * 　　(2)处理字符串中的敏感信息，将被就业和谐成就业
 *
 * 　　(3)将字符串中出现的":):"转换成"^V^";
 *
 * 　字符串会依次运用这三条规则，对字符串进行处理，每个规则都有自己需要完成的责任和任务。 
 * @Param 
 * @return   
 * @throws 
*/
public class Client {

    public static void main(String[] args) {
        String requestStr = "1111111,2222222:),中国10.1国庆节....";
        Request request = new Request();
        request.setRequestStr(requestStr);
        Response response = new Response();
        //构造责任链
        FilterChain filterChain = buildFilterChain();
        //使用责任链
        filterChain.doFilter(request, response, filterChain);

        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());

        System.out.println("------");
        filterChain.doFilter(request, response, filterChain);

    }

    public static FilterChain buildFilterChain() {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlFilter()).addFilter(new TextFilter());
        return filterChain;
    }
}
