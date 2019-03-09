package study.pattern.chainofres;

/**
 * 责任链模式，
 *
 */
public abstract  class Leader {
    protected  String name;
    //定义下一个处理的对象
    protected  Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 抽象的方法，处理方法，需要各个责任者处理
     */
    public abstract  void handler(LeaveRequest request);
}

/**
 * 组长
 */
class Director extends  Leader{
    public Director(String name) {
        super(name);
    }

    @Override
    public void handler(LeaveRequest request) {
        int days  = request.getDays();
        if(days<3){
            System.out.println("--组长负责审批,申请人："+request.getName()+"请假天数："+request.getDays()+",请假理由："+request.getReason());
            System.out.println("审批通过");
        }else{
            System.out.println("组长同意，交给上级处理。");
            if(this.getNextLeader()!=null){
                this.getNextLeader().handler(request);
            }
        }
    }
}

class Manager extends Leader{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handler(LeaveRequest request) {
        int days  = request.getDays();
        System.out.println("--部门经理负责审批,申请人："+request.getName()+"请假天数："+request.getDays()+",请假理由："+request.getReason());
        if(days<10){
            System.out.println("--部门经理 审批通过");
        }else{
            System.out.println("部门经理同意，交给上级处理。");
            if(this.getNextLeader()!=null){
                this.getNextLeader().handler(request);
            }
        }
    }
}
class Ceo extends Leader{
    public Ceo(String name) {
        super(name);
    }

    @Override
    public void handler(LeaveRequest request) {
        int days  = request.getDays();
        System.out.println("--ceo负责审批,申请人："+request.getName()+"请假天数："+request.getDays()+",请假理由："+request.getReason());
        if(days<30){
            System.out.println("ceo审批通过");
        }else{
            if(this.getNextLeader()!=null){
                this.getNextLeader().handler(request);
            }else{
                System.out.println("ceo审批不通过");
            }
        }
    }
}