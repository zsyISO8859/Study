package responsibilitychain6;

/**
 * @author : zhousy
 * @date : 2022/10/31 17:19
 * @version : 1.0
 */


public abstract class Approver {

    private String name;


    public Approver approver;

    public Approver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    abstract void processRequest(PurchaseRequest purchaseRequest);
}
