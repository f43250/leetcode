package 设计模式.责任链模式;

/**
 * @author FLE
 * @description
 * @time 2021/4/12 15:34
 */
public class ThirdHandleChain extends  AbstractHandleChain {


    public ThirdHandleChain(String chainName) {
        this.chainName = chainName;
    }

    @Override
    public void handleRequest( ApproveRequest approveRequest) {
        if (approveRequest.getDays() > SECOND_APPROVE && approveRequest.getDays() <= THIRD_APPROVE) {
            System.err.println("第三级责任链:" + chainName + "已经处理");
            return;
        }

        if (null != this.nextHandleChain) {
            this.nextHandleChain.handleRequest(approveRequest);
        } else {
            System.err.println("请假天数超过最大值,拒绝审批");
        }
    }


}
