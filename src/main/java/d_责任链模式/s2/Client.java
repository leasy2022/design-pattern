package d_责任链模式.s2;

/**
 * @author wushang
 * @description:
 * @date 2020-08-16
 */
/*
感觉s1的示例更好
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest request = LeaveRequest.builder().leaveDays(20).name("小明").build();

        AbstractLeaveHandler directLeaderLeaveHandler = new DirectLeaderLeaveHandler("县令");
        DeptManagerLeaveHandler deptManagerLeaveHandler = new DeptManagerLeaveHandler("知府");
        GManagerLeaveHandler gManagerLeaveHandler = new GManagerLeaveHandler("京兆尹");
        directLeaderLeaveHandler.setNextHandler(deptManagerLeaveHandler);
        deptManagerLeaveHandler.setNextHandler(gManagerLeaveHandler);

        directLeaderLeaveHandler.handlerRequest(request);
    }
}
