package cd.wangyong.raft.state;

/**
 * @author andy
 * @since 2021/2/22
 */
public class NodeState {

    private PersistentState persistentState;

    private VolatileState volatileState;

    public PersistentState getPersistentState() {
        return persistentState;
    }

    public VolatileState getVolatileState() {
        return volatileState;
    }
}
