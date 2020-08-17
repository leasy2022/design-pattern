package d_责任链模式.s1;

import java.util.ArrayList;
import java.util.List;

/*
责任链类也实现了 Filter接口
 */
public class FilterChain implements Filter {
    private List<Filter> filters = new ArrayList();

    private int currentPosition = 0;

    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }
/*
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        //退出
        if (this.currentPosition == this.filters.size()) {
            return;
        }
        //类似递归
        this.currentPosition++;
        Filter nextFilter = this.filters.get(this.currentPosition - 1);
        nextFilter.doFilter(request, response, this);
    }

 */

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        //退出
        if (this.currentPosition == this.filters.size()) {
            return;
        }
        //类似递归
        this.currentPosition++;
        Filter nextFilter = this.filters.get(this.currentPosition - 1);
        nextFilter.doFilter(request, response, this);

        for (Filter filter : filters) {
            filter.doFilter(request,response, this);
        }
    }
}
