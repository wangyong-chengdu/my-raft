package cd.wangyong.raft.service;

/**
 * @author andy
 * @since 2021/2/22
 */
public class VoteResult {
    /**
     * Follower返回当前任期，提供给竞选者参考
     */
    private int termId;

    /**
     * 是否同意投票
     */
    private boolean voteGranted;

}
