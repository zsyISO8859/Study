package responsibilitychain6;

/**
 * @author : zhousy
 * @date : 2022/10/31 17:46
 * @version : 1.0
 */

/**
 * 职责链模式：
 *    又叫责任链模式，为请求创建一个接收者对象的链，这种方式对请求的发送和接收者解耦。
 *    职责链模式通常每个接收者都有另一个接收者的引用，如果一个对象不能处理请求，就会把相同请求传递给下一个接收者，依此类推。
 *    属于行为型设计模式。
 *
 * 职责链模式的注意事项和细节：
 */
public class Client_enter {
    public static void main(String[] args) {
        //创建请求
        PurchaseRequest purchaseRequest = new PurchaseRequest("123", 1000);

        //创建approver
        DepartmentApprover d = new DepartmentApprover("教导主任");
        ViceSchoolApprover v = new ViceSchoolApprover("副校长");
        SchoolApprover s = new SchoolApprover("校长");

        //维护职责链关系成环状
        d.setApprover(v);
        v.setApprover(s);
        s.setApprover(d);

        //处理请求
        d.processRequest(purchaseRequest);
    }
}
