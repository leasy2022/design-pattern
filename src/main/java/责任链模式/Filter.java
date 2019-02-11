package 责任链模式;

public interface Filter {
    public void doFilter(Request request, Response response, FilterChain filterChain);
}
