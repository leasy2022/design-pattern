package d_责任链模式.s1;

public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
