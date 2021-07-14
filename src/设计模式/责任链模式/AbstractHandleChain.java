package 设计模式.责任链模式;

/**
 * @author FLE
 * @description
 * @time 2021/4/12 15:31
 */
public class AbstractHandleChain {

    int FIRST_APPROVE = 1;
    int SECOND_APPROVE = 3;
    int THIRD_APPROVE = 30;

    /**
     * 当前责任链名称
     */
    String chainName;

    /**
     * 下一审批节点
     */
    AbstractHandleChain nextHandleChain;

    public void setNextHandleChain(AbstractHandleChain nextHandleChain) {
        this.nextHandleChain = nextHandleChain;
    }

    public void handleRequest(ApproveRequest approveRequest){

    }
}
