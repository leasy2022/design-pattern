package 责任链模式;

public class Main {

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
    }

    public static FilterChain buildFilterChain() {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlFilter()).addFilter(new TextFilter());
        return filterChain;
    }
}
