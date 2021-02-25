package cd.wangyong.raft.role;

/**
 * 角色
 * @author andy
 * @since 2021/2/22
 */
public enum Role {
    /**
     * 领导者
     */
    LEADER,

    /**
     * 候选者
     */
    CANDIDATE,

    /**
     * 跟随者
     */
    FOLLOWER;
}
