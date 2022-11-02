package adapter7.springmvc;

/**
 * @author : zhousy
 * @date : 2022/11/1 14:49
 * @version : 1.0
 */


public interface Controller {
}

class HttpController implements Controller {
    public void doHttpHandler() {
        System.out.println("http......");
    }
}

class SimpleController implements Controller {
    public void doSimpleHandler() {
        System.out.println("simple......");
    }
}

class AnnotationController implements Controller {
    public void doAnnotationHandler() {
        System.out.println("annotation......");
    }
}
