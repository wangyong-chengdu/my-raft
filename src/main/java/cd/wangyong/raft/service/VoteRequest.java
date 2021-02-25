package cd.wangyong.raft.service;

/**
 * @author andy
 * @since 2021/2/22
 */
public class VoteRequest {

    /**
     * 候选人任期
     */
    private int term;
    /***
     * 候选人ID
     */
    private int candidateId;
    /**
     * 最后日志Index
     */
    private int lastLogIndex;
    /**
     * 最后日志任期
     */
    private int lastLogTerm;


}
