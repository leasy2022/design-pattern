package d_责任链模式.s2;

import lombok.Builder;
import lombok.Data;

/**
 * @author wushang
 * @description:
 * @date 2020-08-16
 */
/*
请假详情
 */
@Builder
@Data
public class LeaveRequest {
    /**天数*/
    private int leaveDays;

    /**姓名*/
    private String name;


}
