package cd.wangyong.raft.role;

import cd.wangyong.raft.service.AppendEntriesRequest;
import cd.wangyong.raft.service.AppendEntriesResult;
import cd.wangyong.raft.state.NodeState;

/**
 * @author andy
 * @since 2021/2/22
 */
public interface EntriesAppend {
    /**
     * doAppendEntries
     */
    AppendEntriesResult doAppendEntries(AppendEntriesRequest request, NodeState nodeState);
}
