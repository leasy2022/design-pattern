package d_责任链模式.s2;

/**
 * @author wushang
 * @description: * @description: 直接主管处理类
 * @date 2020-08-16
 */
public class DirectLeaderLeaveHandler extends AbstractLeaveHandler {


    public DirectLeaderLeaveHandler(String name) {
        this.handlerName = name;
    }
    @Override
    protected void handlerRequest(LeaveRequest request) {
        if(request.getLeaveDays() <= this.MIN){
            System.out.println("直接主管:" + handlerName + ",已经处理;流程结束。");
            return;
        }

        if(null != this.nextHandler){
            this.nextHandler.handlerRequest(request);
        }else{
            System.out.println("审批拒绝！");
        }

    }
}
