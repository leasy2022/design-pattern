package d_责任链模式.s1;

public class TextFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("begin TextFilter:");

        String newRequestStr = request.getRequestStr().replace("中国10.1", "中国") + "----TextFilter";
        request.setRequestStr(newRequestStr);
        filterChain.doFilter(request, response, filterChain);
        String newResponseStr = response.getResponseStr() + "----TextFilter";
        response.setResponseStr(newResponseStr);

        System.out.println("after TextFilter:");

    }
}
