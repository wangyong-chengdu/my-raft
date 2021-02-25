package cd.wangyong.raft.service;

import cd.wangyong.raft.LogEntry;

/**
 * @author andy
 * @since 2021/2/22
 */
public class AppendEntriesRequest {

    /**
     * Leader的任期ID
     */
    private int term;

    /**
     * 用于follower重新定位客户端
     */
    private int leaderId;

    /**
     * 这条Entries之前的日志Index
     */
    private int prevLogIndex;

    /**
     * 这条Entries之前的日志Term
     */
    private int prevLogTerm;

    /**
     * LogEntry,为了提高性能，可能批量
     */
    private LogEntry[] entries;

    public int getTerm() {
        return term;
    }

    public int getLeaderId() {
        return leaderId;
    }

    public int getPrevLogIndex() {
        return prevLogIndex;
    }

    public int getPrevLogTerm() {
        return prevLogTerm;
    }

    public LogEntry[] getEntries() {
        return entries;
    }
}
