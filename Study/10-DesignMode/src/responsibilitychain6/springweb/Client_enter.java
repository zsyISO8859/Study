package responsibilitychain6.springweb;

/**
 * @author : zhousy
 * @date : 2022/10/31 20:42
 * @version : 1.0
 */


public class Client_enter {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilters(new MyFilter1()).addFilters(new MyFilter2());
        filterChain.doFilter();
    }
}
