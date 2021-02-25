package cd.wangyong.raft.role;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cd.wangyong.raft.service.AppendEntriesRequest;
import cd.wangyong.raft.service.AppendEntriesResult;
import cd.wangyong.raft.state.NodeState;
import cd.wangyong.raft.state.PersistentState;
import cd.wangyong.raft.state.VolatileState;
import cd.wangyong.raft.service.VoteRequest;
import cd.wangyong.raft.service.VoteResult;

/**
 * 1.响应RPC请求
 * 2.当
 * @author andy
 * @since 2021/2/22
 */
public class Follower extends Node  {
    private ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    public void init() {
        executorService.submit(this::checkNodeState);
    }

    /**
     * 节点状态
     */
    private NodeState nodeState;

    /**
     * 检查节点状态
     */
    private void checkNodeState() {
        VolatileState volatileState = nodeState.getVolatileState();
        PersistentState persistentState = nodeState.getPersistentState();
        // TODO: 2021/2/22 长时间未收到Leader心跳，且没有投票，则有权更改角色并发起投票
        if (volatileState.getLastLeaderHeartbeatTime() < 0 && persistentState.getVoteFor() == null) {

        }
    }


    /**
     * 投票
     * @param request
     */
    public VoteResult vote(VoteRequest request) {
        // TODO: 2021/2/22
        return null;
    }

    /**
     * Append LogEntry
     */
    public AppendEntriesResult append(AppendEntriesRequest request) {
        // TODO: 2021/2/22

        return null;
    }



//    public void changeRole() {
//
//
//
//    }
}
