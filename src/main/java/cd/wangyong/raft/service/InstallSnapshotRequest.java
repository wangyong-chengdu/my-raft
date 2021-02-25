package cd.wangyong.raft.service;

/**
 * @author andy
 * @since 2021/2/25
 */
public class InstallSnapshotRequest {

    /**
     * 任期
     */
    private int term;

    /**
     * leaderId
     */
    private int leaderId;

    /**
     * 最后包含的日志索引
     */
    private int lastIncludedIndex;

    /**
     * 最后包含的任期
     */
    private int lastIncludedTerm;

    /**
     * 偏移
     */
    private int offset;

    /**
     * 数据
     */
    private byte[] data;

    /**
     * 是否是快照的最后一个Chunk
     */
    private boolean done;
}
