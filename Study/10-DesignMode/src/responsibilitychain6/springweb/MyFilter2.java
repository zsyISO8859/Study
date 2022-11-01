package responsibilitychain6.springweb;

/**
 * @author : zhousy
 * @date : 2022/10/31 20:35
 * @version : 1.0
 */


public class MyFilter2 implements Filter{
    @Override
    public void doFilter(FilterChain filterChain) {
        System.out.println("前置通知2");
        filterChain.doFilter();
        System.out.println("后置通知2");
    }
}
