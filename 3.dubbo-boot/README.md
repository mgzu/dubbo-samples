# dubbo-boot
dubbo 集成 boot
## 环境准备
> [] 中为服务启动的端口

1. zookeeper[2181]
2. provider[8081]
3. consumer[8082]
## 启动顺序
启动 DubboProviderApplication 前，需要先启动 zookeeper。
1. com.github.mgzu.provider.DubboProviderApplication
2. com.github.mgzu.consumer.DubboConsumerApplication