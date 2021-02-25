package cd.wangyong.raft.role;

import cd.wangyong.raft.service.AppendEntriesRequest;
import cd.wangyong.raft.service.AppendEntriesResult;
import cd.wangyong.raft.state.NodeState;
import cd.wangyong.raft.state.PersistentState;
import cd.wangyong.raft.state.VolatileState;

/**
 * 通用规则
 * @author andy
 * @since 2021/2/22
 */
public class Node implements EntriesAppend {

    @Override
    public AppendEntriesResult doAppendEntries(AppendEntriesRequest request, NodeState nodeState) {
        AppendEntriesResult result = null;
        // 1.处理commitIndex和appliedIndex
        VolatileState volatileState = nodeState.getVolatileState();
        if (volatileState.getCommitIndex() > volatileState.getLastApplied()) {
            // TODO: 2021/2/22
            // increment lastApplied
            // apply log[lastApplied] to state machine
        }

        // 2.处理任期
        PersistentState persistentState = nodeState.getPersistentState();
        if (request.getTerm() > persistentState.getCurrentTerm()) {
            persistentState.setCurrentTerm(request.getTerm());
            // TODO: 2021/2/22  持久化状态
            // update current term
            // chang role to follower
            volatileState.setRole(Role.FOLLOWER);
        }

        return result;
    }
}
