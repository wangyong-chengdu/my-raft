package cd.wangyong.raft.role;

/**
 * @author andy
 * @since 2021/2/22
 */
public class Leader extends Node  {

    /**
     * 发送心跳
     */
    public void sendHeartBeat() {

    }

    /**
     * 发送appendEntriesRpc
     */
    public void sendAppendEntriesRpc() {
        // TODO: 2021/2/22
        // if command received from client, append entry to local log, respond after applied to state machine


        // if last log index >= nextIndex send log starting at nextIndex; if still fail ,decrement nextIndex and retry

    }


}
