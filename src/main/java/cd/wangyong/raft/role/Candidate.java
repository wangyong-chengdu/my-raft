package cd.wangyong.raft.role;

/**
 * 候选者
 * @author andy
 * @since 2021/2/22
 */
public class Candidate extends Node {

    /**
     * 请求投票
     */
    public void requestVote() {
        // increment currentTerm
        // vote for self
        // reset election timer
        // send requestVoteRpc

    }


}
