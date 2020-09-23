package test.lw.zookeeper;

import com.lw.zookeeper.master.MasterResolve;
import org.junit.Test;

/**
 * @author liuwei
 * 2020-07-20
 */
public class MasterResolveTest {
//  job 定时任务
    @Test
    public void MasterTest() throws InterruptedException {
        MasterResolve instance = MasterResolve.getInstance();
        System.out.println("master:" + MasterResolve.isMaster());
        Thread.sleep(Long.MAX_VALUE);
    }
}
