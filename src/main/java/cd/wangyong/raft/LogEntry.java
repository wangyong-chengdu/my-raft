package cd.wangyong.raft;

/**
 * 日志条目
 * @author andy
 * @since 2021/2/22
 */
public class LogEntry {
    /**
     * 创建的任期
     */
    private int term;

    /**
     * 日志索引：用于标识索引位置
     */
    private int index;

    /**
     * 状态机命令
     */
    private String command;
}
