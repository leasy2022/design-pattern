package d_责任链模式.s1;

public class HtmlFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("begin HtmlFilter:");

        String newRequestStr = request.getRequestStr().replace(":)", "^-^") + "----HtmlFilter";
        request.setRequestStr(newRequestStr);
        //再次调用
        filterChain.doFilter(request, response, filterChain);
        String newResponseStr = response.getResponseStr() + "----HtmlFilter";
        response.setResponseStr(newResponseStr);
        System.out.println("after HtmlFilter:");
    }

}
