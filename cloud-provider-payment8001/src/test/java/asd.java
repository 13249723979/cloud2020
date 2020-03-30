import com.zht.springcloud.AAA;
import com.zht.springcloud.BBB;
import com.zht.springcloud.CCC;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import redis.clients.jedis.Jedis;

public class asd {

    @Test
    public void aVoid(){
        BBB bbb=new BBB();
        bbb.eat();
        CCC ccc=new CCC();
        ccc.eat();
        ccc.eat();

    }
}
