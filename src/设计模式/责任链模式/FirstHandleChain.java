package 设计模式.责任链模式;


/**
 * @author FLE
 * @description
 * @time 2021/4/12 15:33
 */
public class FirstHandleChain extends AbstractHandleChain {

    public FirstHandleChain(String chainName) {
        this.chainName = chainName;
    }

    @Override
    public void handleRequest(ApproveRequest approveRequest) {
        if (approveRequest.getDays() <= FIRST_APPROVE) {
            System.err.println("第一级责任链:" + chainName + "已经处理");
            return;
        }

        if (null != this.nextHandleChain) {
            this.nextHandleChain.handleRequest(approveRequest);
        } else {
            System.err.println("拒绝审批");
        }
    }

}
