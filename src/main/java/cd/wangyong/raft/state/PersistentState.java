package cd.wangyong.raft.state;

import cd.wangyong.raft.LogEntry;

/**
 * 节点持久化状态
 * @author andy
 * @since 2021/2/22
 */
public class PersistentState {

    /**
     * 当前任期
     */
    private int currentTerm;

    /**
     * 投票给了谁
     */
    private Integer voteFor;

    /**
     * LogEntry,每个Entry包含状态机需要的命令
     */
    private LogEntry[] log;

    public int getCurrentTerm() {
        return currentTerm;
    }

    public void setCurrentTerm(int currentTerm) {
        this.currentTerm = currentTerm;
    }

    public Integer getVoteFor() {
        return voteFor;
    }

    public void setVoteFor(Integer voteFor) {
        this.voteFor = voteFor;
    }

    public LogEntry[] getLog() {
        return log;
    }

    public void setLog(LogEntry[] log) {
        this.log = log;
    }
}
