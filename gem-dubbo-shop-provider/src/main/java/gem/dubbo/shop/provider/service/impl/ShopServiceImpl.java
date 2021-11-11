package gem.dubbo.shop.provider.service.impl;

import gem.dubbo.shop.provider.service.RpcShopService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class ShopServiceImpl implements RpcShopService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
