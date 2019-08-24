# dubbo-demo
使用 zookeeper 作为注册中心，curator 作为客户端，需要外置的 zookeeper。
## 环境准备
> [] 中为服务启动的端口

1. zookeeper[2181]
## 启动顺序
1. com.github.mgzu.provider.Provider
2. com.github.mgzu.consumer.Consumer