package adapter7.springmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhousy
 * @date : 2022/11/1 14:59
 * @version : 1.0
 */


public class DispatchServlet {
    private static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
    }

    public void doDispatch() {
        AnnotationController controller = new AnnotationController();
        HandlerAdapter handlerAdapter = getHandlerAdapter(controller);
        handlerAdapter.handle(controller);
    }

    public HandlerAdapter getHandlerAdapter(Controller controller) {
        for (HandlerAdapter adapter : this.handlerAdapters) {
            if (adapter.support(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        DispatchServlet dispatchServlet = new DispatchServlet();
        dispatchServlet.doDispatch();
    }
}
