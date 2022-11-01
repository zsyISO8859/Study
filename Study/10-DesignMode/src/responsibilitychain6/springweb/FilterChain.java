package responsibilitychain6.springweb;

import java.util.ArrayList;

/**
 * @author : zhousy
 * @date : 2022/10/31 20:35
 * @version : 1.0
 */


public class FilterChain {
    public ArrayList<Filter> filters = new ArrayList<>();
    public int index = 0;

    public FilterChain addFilters(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public void doFilter() {
        if (filters.size() == index) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(this);

    }
}
