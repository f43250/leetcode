package 设计模式.责任链模式;


/**
 * @author FLE
 * @description
 * @time 2021/4/12 15:32
 */

public class ApproveRequest {

    String name;
    Integer days;

    public ApproveRequest(String name, Integer days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
