package cd.wangyong.raft.service;

/**
 * 共识服务
 * @author andy
 * @since 2021/2/22
 */
public interface ConsensusService {

    /**
     * Candidate发起投票，接受者处理规则如下：
     * 1.首先检验节点的当前任期和请求带过来的任期，如果接收者 term < currentTerm，返回false
     * 2.如果接收者 votedFor字段为空，且 候选人的日志 至少和 接收者 一样日志是最新的，则投票给对方
     */
    VoteResult requestVoteRpc(VoteRequest request);

    /**
     * Leader进行复制日志条目，同时，也可用于心跳。 Follower处理规则如下：(日志一致性检测)
     * 1.首先检验节点的当前任期和请求带过来的任期，如果接收者 term < currentTerm,返回false
     * 2.如果接受者日志中不包含 prevLogIndex,或存在prevLogIndex和prevLogTerm不匹配之处，返回false
     * 3.如果日志Entries存在冲突 same index but different terms，删除已存在的条目以及之后的所有条目。
     * 4.以上都没问题后添加日志中没有的日志
     * 5.commitIndex = min(leaderCommit, index of last new entry)
     */
    AppendEntriesResult appendEntriesRpc(AppendEntriesRequest request);

    /**
     * 安装快照，Leader进行安装快照RPC调用，一般是因为Leader已经放弃发送nextLogIndex给follower了，因为follower落后太多了。
     * 原因可能出在这个节点总是异常，又或者这是一个新加入集群的节点。
     * 安装快照规则如下:
     * 1.首先检验节点的当前任期和请求带过来的任期，当 term < currentTerm，则立即返回。
     * 2.如果offset为0,则创建新的快照文件，否则以offset在快照文件中追加。
     * 3.写入成功后，判断是否done = false,如果为false,则返回并等待更多数据块，为true,则复制完成了新快照。
     * 4.丢弃更早更小的快照。
     * 5.如果节点现有的日志条目与快照包含最后包含的日志索引和任期，则删除之前的日志条目，保留之后的日志条目并回复。
     * 6.使用快照重置状态机（并加载快照的集群配置）
     */
    InstallSnapshotResult installSnapshotRpc(InstallSnapshotRequest request);


}
