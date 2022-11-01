package responsibilitychain6;

/**
 * @author : zhousy
 * @date : 2022/10/31 17:36
 * @version : 1.0
 */


public class SchoolApprover extends Approver {

    public SchoolApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmt() > 5000 && purchaseRequest.getAmt() <= 10000) {
            System.out.println("当前处理人：" + this.getName() + "已经批准了id为" + purchaseRequest.getId() + "的购买请求");
        } else {
            this.approver.processRequest(purchaseRequest);
        }
    }
}
