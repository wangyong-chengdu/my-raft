package cd.wangyong.raft.state;

import cd.wangyong.raft.NodeLogIndex;

/**
 * Leader可变状态
 * @author andy
 * @since 2021/2/22
 */
public class LeaderVolatileState {
    /**
     * 每个节点下一次将匹配的LogIndex
     */
    private NodeLogIndex[] nextIndex;
    /**
     * 每个节点已匹配的LogIndex
     */
    private NodeLogIndex[] matchIndex;
}
