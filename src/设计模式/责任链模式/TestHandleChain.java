package 设计模式.责任链模式;

/**
 * @author FLE
 * @description
 * @time 2021/4/12 15:47
 */
public class TestHandleChain {

    public static void main(String[] args) {
        ApproveRequest approveRequest = new ApproveRequest("小明", 10);
        FirstHandleChain firstHandleChain = new  FirstHandleChain("组长");
        SecondHandleChain secondHandleChain = new  SecondHandleChain("经理");
        ThirdHandleChain thirdHandleChain = new ThirdHandleChain("总监");
        firstHandleChain.setNextHandleChain(secondHandleChain);
        secondHandleChain.setNextHandleChain(thirdHandleChain);
        firstHandleChain.handleRequest(approveRequest);
    }

}
