import com.genesis.api.EventCallBack;
import lombok.extern.slf4j.Slf4j;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;

import java.util.List;

@Slf4j
public class DemoEventCallBack extends EventCallBack {

    /**
     * @param pollTime 轮询时间
     * @param event    监听事件的格式
     */
    public DemoEventCallBack(int pollTime, Event event) {
        super(pollTime, event);
    }

    public DemoEventCallBack(Event event) {
        super(event);
    }

    /**
     * 业务处理
     *
     * @param decodeResult
     */
    @Override
    public void handleEvent(List<Type> decodeResult) {
        log.info("decoded result {}", decodeResult);
        log.info("start to Process Data");
    }
}
