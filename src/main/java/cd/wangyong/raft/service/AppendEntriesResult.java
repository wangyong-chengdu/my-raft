package cd.wangyong.raft.service;

/**
 * @author andy
 * @since 2021/2/22
 */
public class AppendEntriesResult {
    /**
     * 任期ID，供Leader使用
     */
    private int term;

    /**
     * 当follower能够匹配上prevLogIndex和prevLogTerm时，返回true
     */
    private boolean success;
}
