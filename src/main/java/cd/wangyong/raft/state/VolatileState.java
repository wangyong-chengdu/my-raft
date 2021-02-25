package cd.wangyong.raft.state;

import cd.wangyong.raft.role.Role;

/**
 * 节点可变状态
 * @author andy
 * @since 2021/2/22
 */
public class VolatileState {

    /**
     * 角色
     */
    private Role role;

    /**
     * 已提交的最高LogEntry Index, 从0开始，自动递增
     */
    private int commitIndex;

    /**
     * 状态机最后应用的最高LogEntry index
     */
    private int lastApplied;

    /**
     * 最后感受到Leader心跳时间
     */
    private long lastLeaderHeartbeatTime;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getCommitIndex() {
        return commitIndex;
    }

    public void setCommitIndex(int commitIndex) {
        this.commitIndex = commitIndex;
    }

    public int getLastApplied() {
        return lastApplied;
    }

    public void setLastApplied(int lastApplied) {
        this.lastApplied = lastApplied;
    }

    public long getLastLeaderHeartbeatTime() {
        return lastLeaderHeartbeatTime;
    }

    public void setLastLeaderHeartbeatTime(long lastLeaderHeartbeatTime) {
        this.lastLeaderHeartbeatTime = lastLeaderHeartbeatTime;
    }
}
