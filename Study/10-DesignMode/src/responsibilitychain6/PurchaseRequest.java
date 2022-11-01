package responsibilitychain6;

/**
 * @author : zhousy
 * @date : 2022/10/31 17:18
 * @version : 1.0
 */


public class PurchaseRequest {
    private String id;
    private int amt;

    public PurchaseRequest(String id, int amt) {
        this.id = id;
        this.amt = amt;
    }

    public String getId() {
        return id;
    }


    public int getAmt() {
        return amt;
    }

}
